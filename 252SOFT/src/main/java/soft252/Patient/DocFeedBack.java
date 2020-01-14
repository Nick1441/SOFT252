package soft252.Patient;

//Importing Required Classes.
import soft252.Doctor.Doctor;
import soft252.System.ICreateUser;
import soft252.System.SystemDatabase;
import static soft252.System.SystemDatabase.Users;
import soft252.JSONSaving.JSONRead;
import soft252.JSONSaving.SavingJSON;
import soft252.Login;
import soft252.Other.DoctorFeedback;
import soft252.System.Startup;
import soft252.Other.Notify;

import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;

public class DocFeedBack extends javax.swing.JFrame {

    public static String CurrentID;
    public static String FileName;
    public DocFeedBack(String ID, String FileName) {
        initComponents();
        this.CurrentID = ID;
        this.FileName = FileName;
        
        //Creating Button Group, Only One Button can then be selected.
        ButtonGroup BG = new ButtonGroup();
        
        BG.add(rbtnRate1);
        BG.add(rbtnRate2);
        BG.add(rbtnRate3);
        BG.add(rbtnRate4);
        BG.add(rbtnRate5);
        
        //ADDING DOCTORS TO THE DROP DOWN
        DocBox.removeAllItems();
        
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("D"))
            {
                String DocName = Users.get(i).getUserLast();
                DocBox.addItem(String.format("Dr " + DocName));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFeedback = new javax.swing.JButton();
        DocBox = new javax.swing.JComboBox<>();
        lblDocFeedback = new javax.swing.JLabel();
        lblDocFeedback1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnRate5 = new javax.swing.JRadioButton();
        rbtnRate4 = new javax.swing.JRadioButton();
        rbtnRate3 = new javax.swing.JRadioButton();
        rbtnRate2 = new javax.swing.JRadioButton();
        rbtnRate1 = new javax.swing.JRadioButton();
        lblDocFeedback2 = new javax.swing.JLabel();
        lblDocFeedback3 = new javax.swing.JLabel();
        lblDocFeedback4 = new javax.swing.JLabel();
        lblDocFeedback5 = new javax.swing.JLabel();
        lblDocFeedback6 = new javax.swing.JLabel();
        lblDocFeedback7 = new javax.swing.JLabel();
        txtNotes = new javax.swing.JTextField();
        lblDocFeedback8 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnFeedback.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnFeedback.setText("Submit");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        DocBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DocBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DocBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocBoxMouseClicked(evt);
            }
        });

        lblDocFeedback.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback.setText("Select Doctor");

        lblDocFeedback1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblDocFeedback1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback1.setText("Doctor Feedback");

        rbtnRate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRate2ActionPerformed(evt);
            }
        });

        lblDocFeedback2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback2.setText("4");

        lblDocFeedback3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback3.setText("1");

        lblDocFeedback4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback4.setText("5");

        lblDocFeedback5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback5.setText("2");

        lblDocFeedback6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback6.setText("3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDocFeedback3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDocFeedback5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnRate1)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnRate2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnRate3)
                    .addComponent(lblDocFeedback6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnRate4)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnRate5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDocFeedback2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDocFeedback4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnRate5)
                    .addComponent(rbtnRate4)
                    .addComponent(rbtnRate1)
                    .addComponent(rbtnRate2)
                    .addComponent(rbtnRate3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDocFeedback3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDocFeedback5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDocFeedback2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDocFeedback6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDocFeedback4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblDocFeedback7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback7.setText("Notes");

        txtNotes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblDocFeedback8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback8.setText("Select Rating");

        btnBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFeedback)
                .addGap(50, 50, 50)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDocFeedback7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDocFeedback8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDocFeedback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DocBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblDocFeedback1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDocFeedback1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DocBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblDocFeedback8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblDocFeedback7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtNotes, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DocBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocBoxMouseClicked
           
    }//GEN-LAST:event_DocBoxMouseClicked

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
    
        //Finding What Doctor You Have Chosen.
        int DocNumber = DocBox.getSelectedIndex() + 1;
        String DocID = "";
        
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("D"))
            {
                DocNumber--;
                if (DocNumber == 0)
                {
                    DocID = SystemDatabase.Users.get(i).getUserID();
                    
                }
            }
        }
        System.out.println("Doctor ID - " + DocID);
        
        //Finding Rating For Doctor
        int Rate = 0;
        
        if (rbtnRate1.isSelected())
        {
            Rate = 1;
        }
        else if (rbtnRate2.isSelected())
        {
            Rate = 2;
        }
        else if (rbtnRate3.isSelected())
        {
            Rate = 3;
        }
        else if (rbtnRate4.isSelected())
        {
            Rate = 4;
        }
        else if (rbtnRate5.isSelected())     
        {
            Rate = 5;
        }
        else 
        {
            System.out.println("Something Went Wrong.");
        }
        
        System.out.println("Rating -" + Rate + "/5");
        
        //Getting Notes From 
        String Notes;
        Notes = txtNotes.getText();
        System.out.println("Notes - " + Notes);
        
        //Creating New Doc Feedback Object. Using DocFeedBack Constructor.
        //All New Feedback Must Be Approved By People Before Being Public. CAN BE TURNED ON.
        //Need To Make It Find End Of Array, Add One Onto It then Add This into New Slot.
        DoctorFeedback DocFeed = new DoctorFeedback(DocID, Rate, Notes, false);
        SystemDatabase.DocFeed.add(DocFeed);
        
        Notify Not = new Notify("S", "New Feedback, Please Rate.");
        SystemDatabase.Notifications.add(Not);
        
        SavingJSON.Save(FileName);
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void rbtnRate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnRate2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
            new DashBoardPatient(CurrentID, FileName).setVisible(true);
            this.setVisible(false);
            // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
            new DashBoardPatient(CurrentID, FileName).setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(DocFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocFeedBack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocFeedBack(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DocBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDocFeedback;
    private javax.swing.JLabel lblDocFeedback1;
    private javax.swing.JLabel lblDocFeedback2;
    private javax.swing.JLabel lblDocFeedback3;
    private javax.swing.JLabel lblDocFeedback4;
    private javax.swing.JLabel lblDocFeedback5;
    private javax.swing.JLabel lblDocFeedback6;
    private javax.swing.JLabel lblDocFeedback7;
    private javax.swing.JLabel lblDocFeedback8;
    private javax.swing.JRadioButton rbtnRate1;
    private javax.swing.JRadioButton rbtnRate2;
    private javax.swing.JRadioButton rbtnRate3;
    private javax.swing.JRadioButton rbtnRate4;
    private javax.swing.JRadioButton rbtnRate5;
    private javax.swing.JTextField txtNotes;
    // End of variables declaration//GEN-END:variables
}
