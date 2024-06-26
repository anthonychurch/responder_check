import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import javax.mail.Message;
import javax.swing.Timer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinRfs_runDBcheckUI_3.java
 *
 * Created on Apr 3, 2012, 10:37:04 AM
 */
//package winrfs_rundbcheck;

/**
 *
 * @author Anthony  Church
 */
public class WinRfs_runDBcheckUI_3 extends javax.swing.JFrame {

    /** Creates new form WinRfs_runDBcheckUI_3 */
    public WinRfs_runDBcheckUI_3() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        base_jPanel = new javax.swing.JPanel();
        title_jLabel = new javax.swing.JLabel();
        timeStamp_jLabel = new javax.swing.JLabel();
        timeStamp_jTextField = new javax.swing.JTextField();
        credit_jLabel = new javax.swing.JLabel();
        help_jButton = new javax.swing.JButton();
        run_jButton = new javax.swing.JButton();
        stop_jButton = new javax.swing.JButton();
        info_jLabel = new javax.swing.JLabel();
        log_jScrollPane = new javax.swing.JScrollPane();
        log_jTextArea = new javax.swing.JTextArea();
        log_jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base_jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        title_jLabel.setText("Run Winmalee RFB's Availibility Database");

        timeStamp_jLabel.setText("Monitor Current System Time Stamp:");

        timeStamp_jTextField.setBackground(new java.awt.Color(236, 233, 216));
        timeStamp_jTextField.setBorder(null);
        //timeStamp_jTextField.addActionListener(new java.awt.event.ActionListener() {
        //    public void actionPerformed(java.awt.event.ActionEvent evt) {
        //        timeStamp_jTextFieldActionPerformed(evt);
        //    }
        //});

        credit_jLabel.setText("Developed by Anthony Church : aw_church@yahoo.com.au");

        help_jButton.setText("Help");
        help_jButton.setEnabled(false);

        run_jButton.setText("Run");
        run_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	run_jButtonActionPerformed(evt);
            }
        });

        stop_jButton.setText("Stop");
        stop_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_jButtonActionPerformed(evt,timeStamp);
            }
        });

        info_jLabel.setText("This is an aid in monitoring members availibility to respond a Fire Applicance at any time.");

        log_jTextArea.setBackground(new java.awt.Color(236, 233, 216));
        log_jTextArea.setColumns(20);
        log_jTextArea.setRows(5);
        log_jScrollPane.setViewportView(log_jTextArea);

        log_jLabel.setText("Log:");

        javax.swing.GroupLayout base_jPanelLayout = new javax.swing.GroupLayout(base_jPanel);
        base_jPanel.setLayout(base_jPanelLayout);
        base_jPanelLayout.setHorizontalGroup(
            base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_jPanelLayout.createSequentialGroup()
                .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(base_jPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info_jLabel)
                            .addComponent(credit_jLabel)
                            .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, base_jPanelLayout.createSequentialGroup()
                                    .addComponent(help_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(run_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stop_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, base_jPanelLayout.createSequentialGroup()
                                    .addComponent(timeStamp_jLabel)
                                    .addGap(9, 9, 9)
                                    .addComponent(timeStamp_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(log_jScrollPane, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(log_jLabel, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(base_jPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(title_jLabel)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        base_jPanelLayout.setVerticalGroup(
            base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeStamp_jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeStamp_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(log_jLabel)
                .addGap(7, 7, 7)
                .addComponent(log_jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(help_jButton)
                    .addComponent(stop_jButton)
                    .addComponent(run_jButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(credit_jLabel)
                .addContainerGap())
        );

        log_jLabel.getAccessibleContext().setAccessibleName("Log:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(base_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(base_jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>
    
    private void run_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	runProgram = true;
    	runCheck();
    }
    
    private void stop_jButtonActionPerformed(java.awt.event.ActionEvent evt, GetCurrentTimeStamp timeStamp) {                                             
    	runProgram = false;
		tss = MessageUtilities.getTimeStampSeconds(timeStamp);
		timeStamp_jTextField.setText("   " + tss + "  :: PROGRAM STOPPED!! ");
    }                     
    
    private static void printLog(String logImportance, String logText, String logTmeStmp){
    	log_jTextArea.setText(log_jTextArea.getText() + logImportance + " :: " + logTmeStmp + " "+ logText + " \n");
    }
    
    private static String[] populateLogArray(String arg0, String arg1, String arg2){
    	String[] returnArray = {arg2,arg0,arg1};
    	return returnArray;
    }
    
    private static void runCheck(){
    	//String[] getNames = null;
    	
    	ActionListener taskPerformer = new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		if(runProgram == true){
        			tss = MessageUtilities.getTimeStampSeconds(timeStamp);
        			//timeStamp_jTextField.setText("   " + tss + "  :: BUSY PLEASE WAIT!! ");
        			timeStamp_jTextField.setText("   " + tss);
        		}//END IF
        	}// ACTION PERFORMED
        };//END ACTION LISTNER taskPerformer
        
        if(delayCeckDB > 86400000){
        	tss = MessageUtilities.getTimeStampSeconds(timeStamp);
        	log_jTextArea.setText(log_jTextArea.getText() + "ERROR :: " + tss + " delayCeckDB variable > 86,400,000 ( or 24 hours) :: test = " + test + "\n");
        }else{
        	
        	ActionListener checkDB = new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		String seperator = " ;;;; ";
        		String colon = " : ";
        		String[] tempLogArray = new String[3];
        		String log = "";
        		if(runProgram == true){
          			tempLogArray = populateLogArray("ADVICE", "Checking Email for New Messages.", tss);
        			//printLog("ADVICE", "Checking Email for New Messages.", tss);
        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        			log = tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
         			//LOG ONTO THE EMAIL ACCOUNT
        			//Gmail_Imap_getMsgSubjectLine emailCheck = new Gmail_Imap_getMsgSubjectLine(gmailUsrName, gmailPassword);
          			Gmail_Imap_getSendReceiveMessages emailCheck = new Gmail_Imap_getSendReceiveMessages(gmailStatusUsrName, gmailPassword);
        			try {
        				//CHECK EMAIL ACCOUNT FOR NEW MESSAGES
        				System.out.println("//CHECK EMAIL ACCOUNT FOR NEW MESSAGES///////");
        				String[][] newMessages = emailCheck.getSubjectLines();
        				if(newMessages != null){
        					System.out.println("newMessages[0][0] = " + newMessages[0][0]);
        					System.out.println("newMessages[0][1] = " + newMessages[0][1]);
        					System.out.println("newMessages[0][1] = " + newMessages[0][2]);
        					System.out.println("newMessages.length = " + newMessages.length);
        					if(newMessages[0][0] != "false"){
        						//CONNECT TO DATABASE
        						tempLogArray = populateLogArray("ADVICE", "Connecting to Database.", tss);
        	        			//printLog("ADVICE", "Connecting to Database.", tss);
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        						
        						System.out.println("//CONNECT TO DATABASE///////");
        						SQL_DButilities winRfsDB = new SQL_DButilities();
        						winRfsDB.setUserPassUrl(url,userName,password);
        						winRfsDB.connect();
        						//CYCLE THROUGH NEW MESSAGES, SPLIT THE SUBJECT
        						
    							//GET ALL THE NAMES OF THE MEMBERS IN THE STATUS TABLE
    							System.out.println("//GET ALL THE NAMES OF THE MEMBERS IN THE STATUS TABLE///////");
    							tempLogArray = populateLogArray("ADVICE", "Getting all Active Members names from Status Table.", tss);
        	        			//printLog("ADVICE", "Getting all Active Members names from Status Table.", tss);
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        	        			tempLogArray = populateLogArray(" ", " ", " ");
    							//printLog("", " ", " ");
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
    							String DBgetStatment = "select name from status";
    							ResultSet rs = winRfsDB.query(DBgetStatment);
    							int howManyNams = 1;
    							String holdList = "";
    							if(rs.next()){
    								holdList = rs.getString(1);
    								while(rs.next()){
    									howManyNams += 1;
    									holdList = holdList + ":" + rs.getString(1);
    								}//END WHILE
    							}//END IF
    							String[] getActiveMembersNames = new String[howManyNams];
    							getActiveMembersNames = holdList.split(":+");
    							System.out.println("// PRINT OUT tempGetNames //////////");
    							winRfsDB.printStringArray(getActiveMembersNames);
    							System.out.println("tempGetNames.length = " + getActiveMembersNames.length);
        						
    							String[] re = {"Re:","RE:","re:","rE:"};
    							String[] messageDetails = null;
    							
    							String ist = "";
								String update = "";
								String set1 = "";
								String set2 = "";
								String where = "";
								
        						for(int i = 0; i < newMessages.length; i++){
        							System.out.println("// TESTING MESSAGE " + newMessages[i][0] + " //////////");
        							System.out.println("//NEW MESSAGE " + newMessages[i][0] + "///////");
        							tempLogArray = populateLogArray("ADVICE", "New Message : " + newMessages[i][0] + ".", tss);
            	        			//printLog("ADVICE", "New Message : " + newMessages[i][0] + ".", tss);
            	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
            	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
            	        			tempLogArray = populateLogArray("ADVICE", "Testing Details of Message.", tss);
        							//printLog("ADVICE", "Testing Details of Message.", tss);
            	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
            	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        							messageDetails = MessageUtilities.getCodeMessageDetails(newMessages[i], getActiveMembersNames, re);
        							if(Boolean.parseBoolean(messageDetails[0]) == true){
        								tempLogArray = populateLogArray("ADVICE", "SUCCESS : " + messageDetails[2] + " is Code " + messageDetails[1] + ".", tss);
                	        			//printLog("ADVICE", "SUCCESS : " + messageDetails[2] + " is Code " + messageDetails[1] + ".", tss);
                	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
                	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
                	        			tempLogArray = populateLogArray("ADVICE", "Updating Status of " + messageDetails[2] + ".", tss);
        								//printLog("ADVICE", "Updating Status of " + messageDetails[2] + ".", tss);
                	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
                	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        								System.out.println("//Updating Status of " + messageDetails[2] + ".///////");
        								update = "UPDATE " + tableStatus;
        								set1 = " SET " + column2Name + " = '" + Integer.parseInt(messageDetails[1]) + "'";
        								set2 = " , " + column6Name + " = '" + newMessages[i][1] + "'";
        								where = " WHERE " + column3Name + " = '" + messageDetails[2] + "'";
        								ist = update + set1 + set2 + where;
        								winRfsDB.executeUpdate(ist);
        							}else{
        								//REPLY TO SENDER WITH FAIL MESSAGE
        								emailCheck.sendMessage(newMessages[i][2],"ERROR :: " + newMessages[i][0], messageDetails[4] + "\nPlease rectify and resend message if possible.");
        								tempLogArray = populateLogArray("ERROR", "FAIL : " + messageDetails[4] + ". Return to sender.", tss);
                	        			//printLog("ERROR", "FAIL : " + messageDetails[4] + ". Return to sender.", tss);
                	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
                	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        								//printLog("", " ", " ");
        							}//END IF ELSE
        							System.out.println("//");
        							System.out.println("//");
        							tempLogArray = populateLogArray(" ", " ", " ");
        							//printLog("", " ", " ");
            	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
            	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        							tempLogArray = populateLogArray(" ", " ", " ");
        							//printLog("", " ", " ");
            	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
            	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        						}//END FOR
        						
    							tempLogArray = populateLogArray("ADVICE", "Disconnecting to Database.", tss);
    							//printLog("ADVICE", "Disconnecting to Database.", tss);;
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
    							tempLogArray = populateLogArray(" ", " ", " ");
    							//printLog("", " ", " ");
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
    							tempLogArray = populateLogArray(" ", " ", " ");
    							//printLog("", " ", " ");
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        						//emailCheck.close();
         						winRfsDB.close();
         						
         						//FLAG FOR GARBAGE COLLECTION
         						re = null;
    							messageDetails = null;
    							ist = null;
								update = null;
								set1 = null;
								set2 = null;
								where = null;
        					}else{
        						
        						tempLogArray = populateLogArray("ERROR", "Could not retreive messages : " + newMessages[0][1]+ ".", tss);
    							//printLog("ERROR", "Could not retreive messages : " + newMessages[0][1]+ ".", tss);
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        	        			tempLogArray = populateLogArray(" ", " ", " ");
    							//printLog("", " ", " ");
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        	        			tempLogArray = populateLogArray(" ", " ", " ");
    							//printLog("", " ", " ");
        	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
        	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        					}
        				}else{
        					//log_jTextArea.setText(log_jTextArea.getText() + "ADVICE :: " + tss + " No New Email Messages. \n");
        					tempLogArray = populateLogArray("ADVICE", "No New Email Messages.", tss);
        					//printLog("ADVICE", "No New Email Messages.", tss);
        					printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
    	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        					tempLogArray = populateLogArray(" ", " ", " ");
							//printLog("", " ", " ");
    	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
    	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
    	        			tempLogArray = populateLogArray(" ", " ", " ");
							//printLog("", " ", " ");
    	        			printLog(tempLogArray[0], tempLogArray[1], tempLogArray[2]);
    	        			log = log + tempLogArray[0] + colon + tempLogArray[1] + colon +  tempLogArray[2] + seperator;
        				}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					String[] writeLog = log.split(seperator);
					StringUtilities.printArray(writeLog);
					String getTodaysDate = tss.substring(0,10);
					String logFolder = StringUtilities.makeFolder("c://winRfs_Availability_DB_Log").toString() + "/";
					//String logFolder =  "c://winRfs_Availability_DB_Log/";
					String logFile = "winRfs_Availability_DB_Log_" + getTodaysDate;
					StringUtilities.writeLog(logFolder + logFile + ".txt", writeLog);
					//EMAIL LOG FILE TO logwinmaleerfb@gmail.com
					emailCheck.sendMessageAttachment(gmailStatusUsrName, gmailLogUsrName, "Log Update " + tss, "Log Update", logFolder + logFile + ".txt");
					emailCheck.close();
					//StringUtilities.writeLog("c://" + logFile + ".txt", writeLog);
					//StringUtilities.writeLog("c://test/test.txt" , ["boooo"]);
					
					//FLAG FOR GARBAGE COLLECTION
					//writeLog = null;
					//getTodaysDate = null;
					//logFolder =  null;
					//logFile = null;
					//log = null;
					//tempLogArray = null;
        			}//END IF runProgram
          		}// ACTION PERFORMED 			
         	};//END ACTION LISTNER checkDB
            new Timer(delayCeckDB, checkDB).start();
        }// END ELSE
        new Timer(delay, taskPerformer).start();

        tss = MessageUtilities.getTimeStampSeconds(timeStamp);
        System.out.println("tss = " + tss);
        timeStamp_jTextField.setText("   " + tss);
    }//RUN CHECK

    

//private void timeStamp_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
//}
	private static int delay = 1000;//1 second delay
	private static int delayCeckDB = 15000;//15 second delay//5000;//5 second delay
	private static int test = 1000 * 86500;// * 86300;
	private static boolean runProgram = true;
	private static String tss = "";
	private static String nextTimeStamp = "";
	
	private static String gmailStatusUsrName = "statuswinmaleerfb@gmail.com" ;
	private static String gmailPassword = "roadrunner01";
	
	private static String gmailLogUsrName = "logwinmaleerfb@gmail.com" ;

	
	private static String url = "jdbc:mysql://localhost:3306/winRfs_availability";
	private static String userName = "root";
	private static String password = "please";
	private static String tableStatus = "status";
	private static String tableLog = "status";
	private static String column2Name = "code";
	private static String column3Name = "name";
	private static String column6Name = "time";
	
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }//END TRY CATCH
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
            	
            	//final GetCurrentTimeStamp timeStamp = new GetCurrentTimeStamp();
                new WinRfs_runDBcheckUI_3().setVisible(true);
                runCheck();
               	
            }//END RUN
        });//END EVENTQUEUE
    }//END MAIN
    // Variables declaration - do not modify
    private javax.swing.JPanel base_jPanel;
    private javax.swing.JLabel credit_jLabel;
    private javax.swing.JButton help_jButton;
    private javax.swing.JLabel info_jLabel;
    private javax.swing.JLabel log_jLabel;
    private javax.swing.JScrollPane log_jScrollPane;
    private static javax.swing.JTextArea log_jTextArea;
    private javax.swing.JButton run_jButton;
    private javax.swing.JButton stop_jButton;
    private javax.swing.JLabel timeStamp_jLabel;
    private static javax.swing.JTextField timeStamp_jTextField;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration
    
    private final static GetCurrentTimeStamp timeStamp = new GetCurrentTimeStamp();
}
