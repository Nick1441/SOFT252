package soft252.Secretary;

import javax.swing.JOptionPane;

//Importing Required Classes.
import soft252.JSONSaving.SavingJSON;
import soft252.Other.Medicine;
import soft252.Other.Notify;
import soft252.Other.Prescription;
import soft252.System.SystemDatabase;

public class GiveMedication extends javax.swing.JFrame {
    
    public static String CurrentID;
    public static String FileName;
    public Prescription Pre;
    public Medicine Med;
    
    //Created New Give Medication Form.
    public GiveMedication(String CurrentID, String FileName) {
        initComponents();
        this.CurrentID = CurrentID;
        this.FileName = FileName;
        
        //Displays all Prescriptions In COmbo Box.
        int Number = 0;
        
        for (int i = 0; i < SystemDatabase.Prescriptions.size(); i++)
        {
            Number = i + 1;
            cmbPre.addItem(Number + ". " + SystemDatabase.Prescriptions.get(i).getPatientID().toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPre = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtMedName = new javax.swing.JTextField();
        txtMedAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStockAmount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGiveMed = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbCompleted = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbPre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbPre.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPreItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Prescription Output");

        txtMedName.setEditable(false);
        txtMedName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtMedAmount.setEditable(false);
        txtMedAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Medication Name");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Amount Wanted");

        txtStockAmount.setEditable(false);
        txtStockAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Stock Amount");

        btnGiveMed.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGiveMed.setText("Give Medication");
        btnGiveMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiveMedActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Select Prescription");

        cbCompleted.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbCompleted.setText("Completed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCompleted)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMedName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMedAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPre, 0, 131, Short.MAX_VALUE)
                                    .addComponent(txtStockAmount))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGiveMed)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMedName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStockAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbCompleted)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGiveMed)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPreItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPreItemStateChanged
        
        //Sets Name and Amount of medication in Text.
        //Sets the Amount of Stock of that medication.
        Pre = SystemDatabase.Prescriptions.get(cmbPre.getSelectedIndex());
        txtMedName.setText(Pre.getMedicationName().toString());
        txtMedAmount.setText(Pre.getQuantity().toString());
        cbCompleted.setSelected(Pre.getCompleted());
        
        for (int i = 0; i < SystemDatabase.Medication.size(); i++)
        {
            if (SystemDatabase.Medication.get(i).getName().equals(Pre.getMedicationName().toString()))
            {
                Med = SystemDatabase.Medication.get(i);
                txtStockAmount.setText(Med.getStock().toString());
            }
        }
    }//GEN-LAST:event_cmbPreItemStateChanged

    private void btnGiveMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiveMedActionPerformed
        
        //Checks to see if there is enough medication.
        //if there is, Gives medication out. Sets Prescription to completed.
        if (Pre.getQuantity() < Med.getStock())
        {
            Pre.setCompleted(true);
            Med.setStock(Med.getStock() - Pre.getQuantity());
            JOptionPane.showMessageDialog(null, "Medication Has Been Given Out.", "Notifications", JOptionPane.WARNING_MESSAGE);
        }
        //if there isnt enough, asks user to come back soon.
        //Notifys Secretary to order more of that medication and how much.
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Medication To Give Out. Notifying For More.", "Notifications", JOptionPane.WARNING_MESSAGE);
            Notify Not = new Notify("S", "Order Request For " + Med.getName() + ". Amount " + Pre.getQuantity());
            SystemDatabase.Notifications.add(Not);
        }
        
        SavingJSON.Save(FileName);
    }//GEN-LAST:event_btnGiveMedActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new DashBoardSecretary(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(GiveMedication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiveMedication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiveMedication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiveMedication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiveMedication(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGiveMed;
    private javax.swing.JCheckBox cbCompleted;
    private javax.swing.JComboBox<String> cmbPre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtMedAmount;
    private javax.swing.JTextField txtMedName;
    private javax.swing.JTextField txtStockAmount;
    // End of variables declaration//GEN-END:variables
}
