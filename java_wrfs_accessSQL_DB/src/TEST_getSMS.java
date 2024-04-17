
public class TEST_getSMS {
	private static String m4uUsrName = "Self082";//"WinmaleRural002";//
	private static String m4uPassword = "z7HGcNKW";//"fire000";//
	
	private static boolean secureMode = false;
	private static boolean debug = false;
	private static String  debugFile = "";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println (m4uUsrName);
		SMS_getSMS m4u = new SMS_getSMS(m4uUsrName,m4uPassword);
        String[][] smsMessages = m4u.testCheckReplies(secureMode, debug, debugFile);
        System.out.println("//// TEST_getSMS");
        System.out.println(smsMessages);
        if(smsMessages != null){
        	System.out.println(smsMessages[0][0]);
        	System.out.println(smsMessages[0][1]);
        	System.out.println(smsMessages[0][2]);
        }else{
        	System.out.println("No new SMS's");
        }
	}

}
