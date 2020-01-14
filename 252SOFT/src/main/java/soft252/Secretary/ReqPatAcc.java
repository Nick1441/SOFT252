package soft252.Secretary;

import javax.swing.JOptionPane;

//Imports Required Classes.
import soft252.JSONSaving.SavingJSON;
import soft252.Patient.Patient;
import soft252.System.SystemDatabase;

public class ReqPatAcc extends javax.swing.JFrame {
    
    public static String CurrentID;
    public static String FileName;
    
    public ReqPatAcc(String CurrentID, String FileName) {
        initComponents();
        this.CurrentID = CurrentID;
        this.FileName = FileName;
        
        ResetList();
        
    }

    //Resets List of Account Requests in comboBox.
    public void ResetList()
    {
        cmbPat.removeAllItems();
        
        for (int i = 0; i < SystemDatabase.AccountReq.size(); i++)
        {
            cmbPat.addItem(SystemDatabase.AccountReq.get(i).getLastName().toString());
        }
    }
    
    //Resets Infomation based on Selected item in combo box.
    public void Reset()
    {
        txtAInfo.setText("");
        Integer Chosen = 0;
        try 
        {
            Chosen = cmbPat.getSelectedIndex();
            txtAInfo.append(SystemDatabase.AccountReq.get(Chosen).getFirstName() + "\n");
            txtAInfo.append(SystemDatabase.AccountReq.get(Chosen).getLastName()+ "\n");
            txtAInfo.append(SystemDatabase.AccountReq.get(Chosen).getAddress()+ "\n");
            txtAInfo.append(SystemDatabase.AccountReq.get(Chosen).getGender()+ "\n");
        }
        catch(Exception e)
        {
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAInfo = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbPat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbPat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPatItemStateChanged(evt);
            }
        });
        cmbPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPatActionPerformed(evt);
            }
        });

        txtAInfo.setColumns(20);
        txtAInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAInfo.setRows(5);
        jScrollPane1.setViewportView(txtAInfo);

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Select Rquested Patient");

        btnRemove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Requested Patient Accounts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmbPat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel2)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPatItemStateChanged
        Reset();
    }//GEN-LAST:event_cmbPatItemStateChanged

    
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        //Gets All infomation from Request and saves to string.
        int Number = cmbPat.getSelectedIndex();

        String First = SystemDatabase.AccountReq.get(Number).getFirstName();
        String Last = SystemDatabase.AccountReq.get(Number).getLastName();
        String Address = SystemDatabase.AccountReq.get(Number).getAddress();
        Integer Age = SystemDatabase.AccountReq.get(Number).getAge();
        String Gender = SystemDatabase.AccountReq.get(Number).getGender();
        String Password = SystemDatabase.AccountReq.get(Number).getPassword();

        //Creates new Patient with Requests infomation.
        Patient NewPat = new Patient(First, Last, Address, Age, Gender, Password);
        
        //Adds User to Database.
        SystemDatabase.Users.add(NewPat);
        SystemDatabase.AccountReq.remove(Number);

        //Visualy Shows user created and Created Users Login ID.
        JOptionPane.showMessageDialog(null, ("User Sucsessfully Added To Database.\nUserID - " + NewPat.getUserID()), "Notifications", JOptionPane.WARNING_MESSAGE);
        ResetList();
        Reset();
        
        //Saves Updated Database to JSON.
        SavingJSON.Save(FileName);
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new DashBoardSecretary(CurrentID, FileName).setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        
        //Removes Request from database.
        int Number = cmbPat.getSelectedIndex();
        SystemDatabase.AccountReq.remove(Number);
        
        //Visualy shows user has been removed.
        JOptionPane.showMessageDialog(null, "User Removed From Database.", "Notifications", JOptionPane.WARNING_MESSAGE);
        ResetList();
        Reset();
        
        //saves updated database to JSON file.
        SavingJSON.Save(FileName);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void cmbPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPatActionPerformed

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
            java.util.logging.Logger.getLogger(ReqPatAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReqPatAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReqPatAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReqPatAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReqPatAcc(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbPat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAInfo;
    // End of variables declaration//GEN-END:variables
}
