package soft252.Patient;

//Imports Required Classes.
import soft252.System.SystemDatabase;
import static soft252.System.SystemDatabase.Users;

public class ViewDocFeedback extends javax.swing.JFrame {
    
    public static String CurrentID;
    public static String FileName;
    public ViewDocFeedback(String ID, String FileName) {
        initComponents();
        this.CurrentID = ID;
        this.FileName = FileName;
        
        
        //Adds All the Doctors to the ComboBox.
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

        DocBox = new javax.swing.JComboBox<>();
        lblDocFeedback9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaFeedback = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DocBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DocBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DocBox.setSelectedIndex(-1);
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

        lblDocFeedback9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDocFeedback9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDocFeedback9.setText("Select Doctor");

        txtAreaFeedback.setColumns(20);
        txtAreaFeedback.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtAreaFeedback.setRows(5);
        jScrollPane1.setViewportView(txtAreaFeedback);

        btnBack.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("View Doctor Feedback");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDocFeedback9, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DocBox, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDocFeedback9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DocBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DocBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocBoxMouseClicked

    }//GEN-LAST:event_DocBoxMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new DashBoardPatient(CurrentID, FileName).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void DocBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DocBoxItemStateChanged
        
        //gets updated info based on next Chosen option is Combobox.
        txtAreaFeedback.setText(null);
        int DocNumber = DocBox.getSelectedIndex() + 1;
        String DocID = "";
        String DocLast = "";
        
        //Finds Doctors ID.
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("D"))
            {
                DocNumber--;
                if (DocNumber == 0)
                {
                    DocID = SystemDatabase.Users.get(i).getUserID();
                    DocLast = SystemDatabase.Users.get(i).getUserLast();
                    
                }
            }
        }
        
        //Displays All the the Doctors Ratings.
        for (int i = 0; i < SystemDatabase.DocFeed.size(); i++)
        {
            // && SystemDatabase.DocFeed.get(i).getApproved().equals(true)
            //Can Be added With Other Lines to Have Admins Approve Feedback Before Being Shown
            if (SystemDatabase.DocFeed.get(i).getDocID().equals(DocID))
            {
                Integer Rating = SystemDatabase.DocFeed.get(i).getRating();
                txtAreaFeedback.append("Dr "+ DocLast + " - " +SystemDatabase.DocFeed.get(i).getDocID() + "\n");
                txtAreaFeedback.append("Rating - " + Rating.toString() + "/5" + "\n");
                //Not Required To Show To Patients, Only Admin Sees For Feedback.
                //txtAreaFeedback.append("Notes - " + SystemDatabase.DocFeed.get(i).getNotes() + "\n");
                txtAreaFeedback.append("\n");
                
            }
        }
    }//GEN-LAST:event_DocBoxItemStateChanged

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
            java.util.logging.Logger.getLogger(ViewDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDocFeedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDocFeedback(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DocBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDocFeedback9;
    private javax.swing.JTextArea txtAreaFeedback;
    // End of variables declaration//GEN-END:variables
}
