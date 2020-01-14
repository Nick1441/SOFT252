package soft252.Admin;

//Importing Required Classes.
import soft252.JSONSaving.SavingJSON;
import soft252.Other.Notify;
import soft252.System.SystemDatabase;

public class ApproveDocFeedback extends javax.swing.JFrame {

    public static String FileName;
    public static String CurrentID = "";
    
    String DocID;
    
    //When Called, Sets Defualt String From Passing In. Sets Feedback Table Up.
    public ApproveDocFeedback(String ID, String FileName) {
        initComponents();
        this.CurrentID = ID;
        this.FileName = FileName;

        //Sets Doctors Name Inside Doctors Combo Box.
        for (int i = 0; i < SystemDatabase.DocFeed.size(); i++)
        {   
            String DocName = "";
            for (int j = 0; j < SystemDatabase.Users.size(); j++)
            {
                if (SystemDatabase.Users.get(j).getUserID().equals(SystemDatabase.DocFeed.get(i).getDocID()))
                {
                    DocName = SystemDatabase.Users.get(j).getUserLast();
                }
            }
            String Text = "Dr " + DocName + " - Rating " + SystemDatabase.DocFeed.get(i).getRating();
            DocBox.addItem(Text);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DocBox = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaFeedback = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtInfo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DocBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DocBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DocBoxItemStateChanged(evt);
            }
        });
        DocBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocBoxMouseClicked(evt);
            }
        });
        DocBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocBoxActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtAreaFeedback.setEditable(false);
        txtAreaFeedback.setColumns(20);
        txtAreaFeedback.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAreaFeedback.setRows(5);
        jScrollPane1.setViewportView(txtAreaFeedback);

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Send Feedback");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Send Feedback To Doctor");

        txtInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtInfo.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Select Feedback");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Feedback To Send");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DocBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnSave)
                        .addGap(47, 47, 47)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(DocBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DocBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocBoxMouseClicked

    }//GEN-LAST:event_DocBoxMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new DashBoardAdmin(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void DocBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DocBoxItemStateChanged
        //When the State Is Changed, Updates All Infomation to New Selected Item.
        txtAreaFeedback.setText(null);
        
        int Chosen = DocBox.getSelectedIndex();
        
        String ID = SystemDatabase.DocFeed.get(Chosen).getDocID();
        Integer Rating = SystemDatabase.DocFeed.get(Chosen).getRating();
        String DocName = "";
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().equals(ID))
            {
                DocName = SystemDatabase.Users.get(i).getUserLast();
            }
        }
        
        txtAreaFeedback.append("Dr "+ DocName + "\n");
        txtAreaFeedback.append("DocID - " + SystemDatabase.DocFeed.get(Chosen).getDocID() + "\n");
        txtAreaFeedback.append("Rating - " + Rating.toString() + "/5" + "\n");
        txtAreaFeedback.append("Notes - " + SystemDatabase.DocFeed.get(Chosen).getNotes() + "\n");
        txtAreaFeedback.append("\n");
        
        DocID = SystemDatabase.DocFeed.get(Chosen).getDocID();
        
        //Can Be Used Incase Want Admins To Approve Feedback Before Being Public.
        //checkApproved.setState(SystemDatabase.DocFeed.get(Chosen).getApproved());
    }//GEN-LAST:event_DocBoxItemStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        //Created Notification To Be Sent to Specific Doctor.
        String Info = "Feedback - " + txtInfo.getText() + "\n";
        Notify Not = new Notify(DocID, Info);
        
        //Adds Notification To Notification Array.
        SystemDatabase.Notifications.add(Not);
        
        //Saves File With New Notification Inside.
        SavingJSON.Save(FileName);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void DocBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocBoxActionPerformed
        
    }//GEN-LAST:event_DocBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ApproveDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApproveDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApproveDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApproveDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApproveDocFeedback(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DocBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaFeedback;
    private javax.swing.JTextField txtInfo;
    // End of variables declaration//GEN-END:variables
}
