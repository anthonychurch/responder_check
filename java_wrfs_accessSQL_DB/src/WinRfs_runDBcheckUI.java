import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;

import javax.swing.Timer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinRfs_runDBcheckUI.java
 *
 * Created on Apr 3, 2012, 10:37:04 AM
 */
//package winrfs_rundbcheck;

/**
 *
 * @author Anthony  Church
 */
public class WinRfs_runDBcheckUI extends javax.swing.JFrame {

    /** Creates new form WinRfs_runDBcheckUI */
    public WinRfs_runDBcheckUI() {
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
    }
    
    private void stop_jButtonActionPerformed(java.awt.event.ActionEvent evt, GetCurrentTimeStamp timeStamp) {                                             
    	runProgram = false;
		tss = getTimeStampSeconds(timeStamp);
		timeStamp_jTextField.setText("   " + tss + "  :: PROGRAM STOPPED!! ");
    }                     
    
    private static String getTimeStampSeconds(GetCurrentTimeStamp timeStamp){
    	String timeStampString = timeStamp.get().toString();
    	timeStampString = timeStampString.substring(0,19);
    	return timeStampString;
    }
    
    private static String convertToTimeStamp(int value){
    	//1000 = 1 second or in hours/minutes/seconds = 00:00:01
    	//This method only deals with whole seconds, therefore value will be rounded up to 
    	//the nearest 1000
    	//Simplify the calculations for value
    	value = value / 1000;
    	int getHours = 0;
    	int getMinutes = 0;
    	int getSeconds = 0;
    	String getHoursString = "00";
    	String getMinutesString = "00";
    	String getSecondsString = "00";
    	//System.out.println("value start = " + value);
    	//Test to see if is greater than 24 hours :: 3600,000 (1 hour) x 24 = 86400,000 seconds or 24 hours
    	//if(value > 86400,000){ or 24:00:00
    	if(value > 86400){
    		value = value - 86400;
    	}
    	//GET HOURS, MINUTES AND SECONDS	
    	//Test to see if is greater than 60 minutes :: 60,000 (1 minute) x 60 = 3600,000 seconds or 1 hour
    	//if(value > 3600,000){ or 01:00:00
    	if(value > 3599){
    		getHours = value / 3600;
    		getMinutes = (value - (getHours * 3600))/60;
    		getSeconds = (value - (getHours * 3600))-(getMinutes*60);
    		if(getMinutes > 60){
    			getHours = getHours + (getMinutes/60);
    			getMinutes = getMinutes - ((getMinutes/60) * 60);
    		}
    		if(getSeconds > 60){
    			getMinutes = getMinutes + (getSeconds/60);
    			getSeconds = getSeconds - ((getSeconds/60) * 60);
    		}
    		//System.out.println("value hours = " + getHours + " hours");
    		//System.out.println("value minute = " + getMinutes + " minutes");
    		//System.out.println("value seconds = " + getSeconds + " seconds");
    	//GET MINUTES AND SECONDS ONLY	
    	//Test to see if is greater than 60 seconds :: 1000 x 60 = 60 seconds or 1 minute
    	//}else if(value > 60,000){ or 00:01:00
    	}else if(value > 59){
    		getMinutes = value / 60 ;
    		getSeconds = value - (getMinutes * 60);
    		if(getSeconds > 60){
    			getMinutes = getMinutes + (getSeconds/60);
    			getSeconds = getSeconds - ((getSeconds/60) * 60);
    		}
    		//System.out.println("value hours = 0 hours");
    		//System.out.println("value minute = " + getMinutes + " minutes");
    		//System.out.println("value seconds = " + getSeconds + " seconds");
    	}else{
    		getSeconds = value;
    		//System.out.println("value hours = 0 hours");
    		//System.out.println("value minute = 0 minutes");
    		//System.out.println("value seconds = " + getSeconds + " seconds");
    	}
    	if(getHours<10){
    		getHoursString = "0" + Integer.toString(getHours);
    	}else{getHoursString = Integer.toString(getHours);};
    	
    	if(getMinutes<10){
    		getMinutesString = "0" + Integer.toString(getMinutes);
    	}else{getMinutesString = Integer.toString(getMinutes);};
    	
    	if(getSeconds<10){
    		getSecondsString = "0" + Integer.toString(getSeconds);
    	}else{getSecondsString = Integer.toString(getSeconds);};
    	
      	return getHoursString + ":" + getMinutesString + ":" + getSecondsString;
    }

//private void timeStamp_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
//}
	private static int delay = 1000;//1 second delay
	private static int delayCeckDB = 5000;//5 second delay
	private static int test = 1000 * 86500;// * 86300;
	private static boolean runProgram = true;
	private static String tss = "";
	private static String nextTimeStamp = "";
	
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
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }//END TRY CATCH
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
            	
            	//final GetCurrentTimeStamp timeStamp = new GetCurrentTimeStamp();
                new WinRfs_runDBcheckUI().setVisible(true);
               	ActionListener taskPerformer = new ActionListener() {
                	public void actionPerformed(ActionEvent evt) {
                		//System.out.println(runProgram);
                		if(runProgram == true){
                			tss = getTimeStampSeconds(timeStamp);
                			timeStamp_jTextField.setText("   " + tss);
                		}//END IF
                	}// ACTION PERFORMED
                };//END ACTION LISTNER
                if(delayCeckDB > 86400000){
                	tss = getTimeStampSeconds(timeStamp);
                	log_jTextArea.setText(log_jTextArea.getText() + "ERROR :: " + tss + " :: delayCeckDB variable > 86,400,000 ( or 24 hours) :: test = " + test + "\n");
                }else{
                	//convertToTimeStamp(test);
                	ActionListener checkDB = new ActionListener() {
                	public void actionPerformed(ActionEvent evt) {
                		if(runProgram == true){
                			log_jTextArea.setText(log_jTextArea.getText() + "ADVICE :: " + tss + " :: Checking Database \n");
                			}//END IF
                		}// ACTION PERFORMED
                	};//END ACTION LISTNER
                    new Timer(delayCeckDB, checkDB).start();
                }
                new Timer(delay, taskPerformer).start();

                tss = getTimeStampSeconds(timeStamp);
                timeStamp_jTextField.setText("   " + tss);
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