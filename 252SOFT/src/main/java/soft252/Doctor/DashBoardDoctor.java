package soft252.Doctor;

import javax.swing.JOptionPane;

//Importing Required Classes.
import soft252.JSONSaving.SavingJSON;
import soft252.Login;
import static soft252.Secretary.DashBoardSecretary.CurrentID;
import soft252.System.SystemDatabase;

public class DashBoardDoctor extends javax.swing.JFrame {

    public static String FileName;
    public static String CurrentID;
    
    public DashBoardDoctor(String ID, String FileName) {
        initComponents();
        this.CurrentID = ID;
        this.FileName = FileName;
        
        //Checking For Notifications for Current User, Or General "Rank" Wide Messages.
        //Adds Info Into Notification String.
        String Notifications = "";
        for (int i  = 0; i < SystemDatabase.Notifications.size(); i++)
        {
            if (SystemDatabase.Notifications.get(i).getNotifyID().equals(CurrentID))
            {
                Notifications = Notifications + SystemDatabase.Notifications.get(i).getInfo() + "\n";
                SystemDatabase.Notifications.remove(i);
            }
            else if (SystemDatabase.Notifications.get(i).getNotifyID().equals("D"))
            {
                Notifications = Notifications + SystemDatabase.Notifications.get(i).getInfo() + "\n";
                SystemDatabase.Notifications.remove(i);
            }
        }
        
        //Shows Notifications If There is notifications to Show.
        if (Notifications != "")
        {
            JOptionPane.showMessageDialog(null, Notifications, "Notifications", JOptionPane.WARNING_MESSAGE);
        }
        
        //Saves File with Removes Notifications. Removed Due To Issue With View Feedback.
        //SavingJSON.Save(FileName);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewMed = new javax.swing.JButton();
        btnNotMed = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        btnViewApp = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNewMed.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNewMed.setText("New Medication");
        btnNewMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMedActionPerformed(evt);
            }
        });

        btnNotMed.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNotMed.setText("Make Notes / Prescribe Medication");
        btnNotMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotMedActionPerformed(evt);
            }
        });

        btnHistory.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnHistory.setText("Patient History");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnAppointment.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAppointment.setText("Create Appointment");
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
            }
        });

        btnViewApp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnViewApp.setText("View Appointments");
        btnViewApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Doctor Dashboard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnNewMed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNotMed, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                .addComponent(btnViewApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNotMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAppointment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Directing User To New Form, Depending on which button is pressed.
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        SavingJSON.Save(FileName);
        new Login(FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnNewMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMedActionPerformed
        new NewMedication(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNewMedActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        new AppointmentCreate(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnViewAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppActionPerformed
        new ViewAppointments(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewAppActionPerformed

    private void btnNotMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotMedActionPerformed
        new PrescribeMedication(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNotMedActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        new ViewPatientHistory(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoardDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoardDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoardDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoardDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardDoctor(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnNewMed;
    private javax.swing.JButton btnNotMed;
    private javax.swing.JButton btnViewApp;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
