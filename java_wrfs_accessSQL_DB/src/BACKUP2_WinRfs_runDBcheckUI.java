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
public class BACKUP2_WinRfs_runDBcheckUI extends javax.swing.JFrame {

    /** Creates new form WinRfs_runDBcheckUI */
    public BACKUP2_WinRfs_runDBcheckUI() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base_jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        title_jLabel.setText("Run Winmalee RFB's Availibility Database");

        timeStamp_jLabel.setText("Monitor Current System Time Stamp:");

        timeStamp_jTextField.setBackground(new java.awt.Color(236, 233, 216));
        timeStamp_jTextField.setBorder(null);
        timeStamp_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeStamp_jTextFieldActionPerformed(evt);
            }
        });

        credit_jLabel.setText("Developed by Anthony Church : aw_church@yahoo.com.au");

        help_jButton.setText("Help");
        help_jButton.setEnabled(false);

        run_jButton.setText("Run");

        stop_jButton.setText("Stop");
        stop_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_jButtonActionPerformed(evt);
            }
        });

        info_jLabel.setText("This is an aid in monitoring members availibility to respond a Fire Applicance at any time.");

        javax.swing.GroupLayout base_jPanelLayout = new javax.swing.GroupLayout(base_jPanel);
        base_jPanel.setLayout(base_jPanelLayout);
        base_jPanelLayout.setHorizontalGroup(
            base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_jPanelLayout.createSequentialGroup()
                .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(base_jPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(base_jPanelLayout.createSequentialGroup()
                                .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(help_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timeStamp_jLabel))
                                .addGap(9, 9, 9)
                                .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(base_jPanelLayout.createSequentialGroup()
                                        .addComponent(run_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(stop_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(timeStamp_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))
                            .addComponent(credit_jLabel)
                            .addComponent(info_jLabel)))
                    .addGroup(base_jPanelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(title_jLabel)))
                .addContainerGap(15, Short.MAX_VALUE))
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
                .addGap(45, 45, 45)
                .addGroup(base_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(help_jButton)
                    .addComponent(stop_jButton)
                    .addComponent(run_jButton))
                .addGap(18, 18, 18)
                .addComponent(credit_jLabel)
                .addContainerGap(64, Short.MAX_VALUE))
        );

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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

private void stop_jButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:
}                                            

private void timeStamp_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
// TODO add your handling code here:
}

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
            java.util.logging.Logger.getLogger(BACKUP2_WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BACKUP2_WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BACKUP2_WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BACKUP2_WinRfs_runDBcheckUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BACKUP2_WinRfs_runDBcheckUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JPanel base_jPanel;
    private javax.swing.JLabel credit_jLabel;
    private javax.swing.JButton help_jButton;
    private javax.swing.JLabel info_jLabel;
    private javax.swing.JButton run_jButton;
    private javax.swing.JButton stop_jButton;
    private javax.swing.JLabel timeStamp_jLabel;
    private javax.swing.JTextField timeStamp_jTextField;
    private javax.swing.JLabel title_jLabel;
    // End of variables declaration
}
