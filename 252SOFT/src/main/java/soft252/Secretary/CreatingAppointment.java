package soft252.Secretary;

import javax.swing.JOptionPane;

//Importing Requred Classes.
import soft252.JSONSaving.SavingJSON;
import soft252.Other.Appointment;
import soft252.Other.Notify;
import soft252.System.SystemDatabase;

public class CreatingAppointment extends javax.swing.JFrame {

    public static String CurrentID;
    public static String FileName;
    
    String Patient;
    String Doctor;
    
    public CreatingAppointment(String ID, String Name) {
        initComponents();
        this.CurrentID = ID;
        this.FileName = Name;
        
        //Loads Lists and Patient/Doc lists.
        ResetList();
        LoadDocPat();
        
    }
    
    //Updated Text Box of Chosen Infomation. Try is for issue with Combobox Changed Event.
    public void UpdateInfo()
    {
       try
        {
            Patient = cmbPat.getSelectedItem().toString();
            Doctor = cmbDoc.getSelectedItem().toString();

            txtaInfoBack.setText("");
            txtaInfoBack.append("Doctors Appointment.\n");
            txtaInfoBack.append("For " + Patient + "\n");
            txtaInfoBack.append("With " + Doctor + "\n");
            txtaInfoBack.append("On " + txtDate.getText());
        }
        catch (Exception e)
        {
              
        }
    }
    
    //Loads Doctors and Patients into ComboBoxes.
    public void LoadDocPat()
    {
        cmbPat.removeAllItems();
        cmbDoc.removeAllItems();
        
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("P"))
            {
                String User = SystemDatabase.Users.get(i).getUserID();
                cmbPat.addItem(User);
            }
            else if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("D"))
            {
                String Doc = SystemDatabase.Users.get(i).getUserID();
                cmbDoc.addItem(Doc);
            }
        }
    }
    
    //Resets Combo Box Of Appointments.
    public void ResetList()
    {
        cmbAppointments.removeAllItems();
        int n = 0;
        for (int i = 0; i < SystemDatabase.AppRequest.size(); i++)
        {
            n = i + 1;
            String ID = n + ". " + SystemDatabase.AppRequest.get(i).getPatientID();
            cmbAppointments.addItem(ID);
        }
    }
    
    //Resert Text Box for Infomation.
    public void Reset()
    {
        txtaInfo.setText("");
        Integer Chosen = 0;
        
        try
        {
            Chosen = cmbAppointments.getSelectedIndex();
            txtaInfo.append("Patient - " + SystemDatabase.AppRequest.get(Chosen).getPatientID() + "\n");
            txtaInfo.append("Doctor - " + SystemDatabase.AppRequest.get(Chosen).getDocID() + "\n");
            txtaInfo.append("Potential Dates - " + SystemDatabase.AppRequest.get(Chosen).getDates());
            
        }
        catch (Exception e)
        {
                 System.out.println("NOT WORKED");   
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPat = new javax.swing.JComboBox<>();
        cmbDoc = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaInfo = new javax.swing.JTextArea();
        cmbAppointments = new javax.swing.JComboBox<>();
        btnDelRequest = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaInfoBack = new javax.swing.JTextArea();
        btnSetDate = new javax.swing.JButton();
        cbDeleteRequest = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbPat.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbPat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPatItemStateChanged(evt);
            }
        });

        cmbDoc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDocItemStateChanged(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtaInfo.setEditable(false);
        txtaInfo.setColumns(20);
        txtaInfo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtaInfo.setRows(5);
        jScrollPane1.setViewportView(txtaInfo);

        cmbAppointments.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbAppointments.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbAppointments.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAppointmentsItemStateChanged(evt);
            }
        });
        cmbAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbAppointmentsMouseClicked(evt);
            }
        });

        btnDelRequest.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnDelRequest.setText("Delete Request");
        btnDelRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnDelRequest)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnDelRequest)
                .addContainerGap())
        );

        txtDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDate.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtDateInputMethodTextChanged(evt);
            }
        });
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtaInfoBack.setEditable(false);
        txtaInfoBack.setColumns(20);
        txtaInfoBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtaInfoBack.setRows(5);
        jScrollPane2.setViewportView(txtaInfoBack);

        btnSetDate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSetDate.setText("Set Date");
        btnSetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetDateActionPerformed(evt);
            }
        });

        cbDeleteRequest.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbDeleteRequest.setText("Delete Selected Request");

        btnSave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSave.setText("Save");
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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Create Appointment");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Select Patient");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Select Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cbDeleteRequest))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBack)
                                        .addGap(35, 35, 35))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSetDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbPat, 0, 96, Short.MAX_VALUE)
                                            .addComponent(cmbDoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSetDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cbDeleteRequest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAppointmentsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAppointmentsItemStateChanged
        Reset();
    }//GEN-LAST:event_cmbAppointmentsItemStateChanged

    private void cmbAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbAppointmentsMouseClicked
        //Reset();
    }//GEN-LAST:event_cmbAppointmentsMouseClicked

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void cmbPatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPatItemStateChanged
        UpdateInfo();
    }//GEN-LAST:event_cmbPatItemStateChanged

    private void cmbDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDocItemStateChanged
        UpdateInfo();
    }//GEN-LAST:event_cmbDocItemStateChanged

    private void txtDateInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtDateInputMethodTextChanged
        
    }//GEN-LAST:event_txtDateInputMethodTextChanged

    private void btnSetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetDateActionPerformed
        UpdateInfo();
    }//GEN-LAST:event_btnSetDateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new DashBoardSecretary(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        //Sees if Delete Request is pressesed
        //Deletes Request for Appointment.
        if (cbDeleteRequest.isSelected())
        {
            int ReqNum = cmbAppointments.getSelectedIndex();
            SystemDatabase.AppRequest.remove(ReqNum); 
        }
        
        //Created New Appointment & Puts it into Database.
        Appointment NewApp = new Appointment(Doctor, Patient, txtDate.getText(), true);
        SystemDatabase.Appointments.add(NewApp);
        
        //Created New Notification and Adds To Database, for Doctor & Patient.
        Notify DocNot = new Notify(Doctor, "New Appointment Created. Check Appointments.");
        Notify PatNot = new Notify(Patient, "New Appointment Created. Check Appointments.");
        SystemDatabase.Notifications.add(DocNot);
        SystemDatabase.Notifications.add(PatNot);
        
        //Saves Updated Database to JSON File.
        SavingJSON.Save(FileName);
        
        //Visualy Show User Appointment is created.
        JOptionPane.showMessageDialog(null, ("Appointment Created For " + Patient + "\nWith " + Doctor), "Notifications", JOptionPane.WARNING_MESSAGE);
        ResetList();
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDelRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelRequestActionPerformed
        //Finds Appointment, removes from database.
        int ReqNum = cmbAppointments.getSelectedIndex();
        SystemDatabase.AppRequest.remove(ReqNum);
        
        //Saves Updated Database to JSON File.
        SavingJSON.Save(FileName);
        
        ResetList();
    }//GEN-LAST:event_btnDelRequestActionPerformed


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
            java.util.logging.Logger.getLogger(CreatingAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatingAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatingAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatingAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatingAppointment(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelRequest;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSetDate;
    private javax.swing.JCheckBox cbDeleteRequest;
    private javax.swing.JComboBox<String> cmbAppointments;
    private javax.swing.JComboBox<String> cmbDoc;
    private javax.swing.JComboBox<String> cmbPat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextArea txtaInfo;
    private javax.swing.JTextArea txtaInfoBack;
    // End of variables declaration//GEN-END:variables
}
