/*
 * Run simple tests through Java SmsInterface
 *
 * Usage: ApiTester [--secure] [--debug [file] [-c|-r|-s [message]|-t]
 *
 * Originally written by Matthew Kwan - October 2002.
 *
 * Updated by Ethan Smith - 23 July 2009
 *  - Updated for latest version of API
 *  - Added commandline parameters for testing
 * 
 * Updated by Ethan Smith - 18 January 2010
 *  - Fixed identification of prepaid credits
 *  - Added --debug option
 *
 */


import java.io.IOException;

import au.com.m4u.smsapi.MessageStatus;
import au.com.m4u.smsapi.SmsReply;
import au.com.m4u.smsapi.SmsReplyList;
import au.com.m4u.smsapi.ValidityPeriod;

class ApiTester {
        // Testing parameters
    private final static String m4uUser = "WinmaleeRural002";//"WinmaleeRural002";//"Self082";       // messagemedia username
    private final static String m4uPass = "fire000";//"fire000";//"z7HGcNKW";       // messagemedia password
    private final static String testPhone = "+61405319054"; // phone number to receive test messages (start with a + in international format)

        // Open an interface connection.
    private static SmsInterface
    openConnection (
        boolean     secureMode,
        boolean     debug,
        String      debugFile
    ){
        SmsInterface    si = new SmsInterface (1);
        si.useSecureMode(secureMode);

        si.setDebug(debug);

        if (debugFile != ""){
            try {
                si.setDebug(debugFile);
            } catch (IOException e){
                System.err.println ("Could not write to debug output file '" + debugFile + "'");
            }
        }

        if (!si.connect (m4uUser, m4uPass, false)) {
            System.err.println ("Failed to connect");
            return null;
        }

        return si;
    }

        // Test credits remaining.
    private static void
    testCreditsRemaining (
        boolean     secureMode,
        boolean     debug,
        String      debugFile
    ){
        SmsInterface    si;

        if ((si = openConnection (secureMode, debug, debugFile)) == null)
            return;

        int     cr = si.getCreditsRemaining ();

        if (cr == -1)
            System.out.println ("Account is not a trial");
        else if (cr != -2)
            System.out.println ("Credits remaining = " + cr);
        else {
            System.out.println ("Could not read credit information");
            System.out.println ("Response code = "
                            + si.getResponseCode ());
        }
    }

        // Test sending of messages.
    private static void testSendMessages (
        String      testPhone,
        String      testMessage,
        boolean     secureMode,
        boolean     debug,
        String      debugFile
    ) {
        SmsInterface    si;

        if ((si = openConnection (secureMode, debug, debugFile)) == null)
            return;

        si.addMessage (testPhone, testMessage, 0, 0,ValidityPeriod.DEFAULT, false);

        if (si.sendMessages ()) {
            System.out.println ("Messages sent successfully");
            System.out.println ("Response code = " + si.getResponseCode ());
        } else {
            System.err.println ("Messages failed");
            System.err.println ("Response code = " + si.getResponseCode ());
        }
    }

        // Print the contents of a reply.
    private static void
    printReply (
        SmsReply    sr
    ) {
        System.err.println ("Phone = " + sr.getPhoneNumber ());
        System.err.println ("Message = " + sr.getMessage ());
        System.err.println ("ID = " + sr.getMessageID ());

        String      status;

        switch (sr.getDeliveryStatus ()) {
            case MessageStatus.NONE:
            status = "None";
            break;
            case MessageStatus.PENDING:
            status = "Pending";
            break;
            case MessageStatus.DELIVERED:
            status = "Delivered";
            break;
            case MessageStatus.FAILED:
            status = "Failed";
            break;
            default:
            status = "Unknown";
            break;
        }

        System.err.println ("Status = " + status);
    }

        // Test downloading of replies.
    private static void
    testCheckReplies (
        boolean     secureMode,
        boolean     debug,
        String      debugFile
    ){
        SmsInterface si;

        if ((si = openConnection (secureMode, debug, debugFile)) == null){
        	System.err.println ("si = " + null);
            return;
        }

        SmsReplyList srl = si.checkRepliesAC ();
        System.out.println ("srl = " + srl);

        if (srl == null) {
            System.err.println ("Replies download failed");
            System.err.println ("Response code = " + si.getResponseCode ());
        } else {
            int     i;
            System.out.println ("srl.size() = " + srl.size());
            for (i = 0; i < srl.size(); i++) {
            	SmsReply    sr = srl.getReply (i);

            	printReply (sr);
            }
        }
    }

        // Main routine.
    public static void
    main (
        String      argv[]
    ) {
        boolean testFunction = false;
        String  testMessage = "Test message" + System.getProperty("line.separator") + "from Java API";
        String[] mode = {"-r"};
        boolean secureMode = false;
        boolean debug = false;
        String  debugFile = "";
        
        System.out.println (m4uUser);

        for (int i = 0; i < mode.length; i++){
            String arg = mode[i].trim();

            if (arg.equals("-c")){
                System.out.println ("Checking credits...");
                testCreditsRemaining (secureMode, debug, debugFile);
                testFunction = true;
            } else if (arg.equals("-s")){
                System.out.println ("Sending message...");
                if (i < (argv.length - 1) && !argv[(i + 1)].substring(0,2).equals("-"))
                    testMessage = argv[++i];
                testSendMessages (testPhone, testMessage, secureMode, debug, debugFile);
                testFunction = true;
            } else if (arg.equals("-r")){
            	if (SmsInterface.internetConnected())
                    System.out.println("Connected OK to reference site");
                else
                    System.out.println("Error connecting to reference site");
                System.out.println ("Checking replies...");
                testCheckReplies(secureMode, debug, debugFile);
                testFunction = true;
            } else if (arg.equals("-t")){
                System.out.println ("Checking internet connection...");
                if (SmsInterface.internetConnected())
                    System.out.println("Connected OK to reference site");
                else
                    System.out.println("Error connecting to reference site");
                testFunction = true;
            } else if (arg.equals("--debug")){
                debug = true;
                if (i < (argv.length - 1) && !argv[(i + 1)].substring(0,1).equals("-"))
                    debugFile = argv[++i];
            } else if (arg.equals("--secure")){
                secureMode = true;
            } else {
                System.err.println("Skipping unrecognized argument: " + arg);
            }
        }

        if (!testFunction){
            System.err.println("Usage: ApiTester [--secure] [--debug [file]] [-c|-r|-s [message]|-t]");
            System.err.println("\t-c\tCheck trial credits remaining");
            System.err.println("\t-r\tCheck for replies");
            System.err.println("\t-s\tSend a test message.  Optionally, the message text can be supplied");
            System.err.println("\t-t\tCheck internet connection to google.com");
            System.err.println("");
            System.err.println("\t--secure\tConnect to the gateway in secure mode");
            System.err.println("\t--debug [file]\tShow debugging output, or log to FILE");
        }

        System.exit (0);
    }
}
