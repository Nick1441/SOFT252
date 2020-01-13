/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252.Admin;

import soft252.JSONSaving.SavingJSON;
import soft252.System.SystemDatabase;
import static soft252.System.SystemDatabase.Users;

/**
 *
 * @author Nick1
 */
public class RemoveDocSec extends javax.swing.JFrame {

    /**
     * Creates new form RemoveDocSec
     */
    
    public static String CurrentID;
    public static String FileName;
    public RemoveDocSec(String ID, String FileName) {
        initComponents();
        this.CurrentID = ID;
        this.FileName = FileName;
        
        ListBoxUpdate();
        
        
    }

    public void ListBoxUpdate()
    {
        cmbUsers.removeAllItems();
        
        for (int i = 0; i < SystemDatabase.Users.size(); i ++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("D") || SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("S"))
            {
                String Name = Users.get(i).getUserLast();
                String Rank = Users.get(i).getUserID().substring(0, 1);
                if (Rank.equals("S"))
                {
                    Rank = "Secretary";
                }
                else
                {
                    Rank = "Doctor";
                }
                
                cmbUsers.addItem(String.format(Name + " - " + Rank));
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbUsers = new javax.swing.JComboBox<>();
        btnRemove = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Delete Secretary/Doctor");

        cmbUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUsers.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsersItemStateChanged(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(cmbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnRemove)
                        .addGap(93, 93, 93)
                        .addComponent(btnBack)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnRemove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnBack)))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsersItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsersItemStateChanged

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new DashBoardAdmin(CurrentID, FileName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        //Find User Based On Selected Index
        
        int DocNumber = cmbUsers.getSelectedIndex() + 1;
        String DocID = "";
        
        for (int i = 0; i < SystemDatabase.Users.size(); i++)
        {
            if (SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("D") || SystemDatabase.Users.get(i).getUserID().substring(0, 1).equals("S"))
            {
                DocNumber--;
                if (DocNumber == 0)
                {
                    SystemDatabase.Users.remove(i);
                    //DocID = SystemDatabase.Users.get(i).getUserID();
                    
                }
            }
        }
        
        ListBoxUpdate();
        
        SavingJSON.Save(FileName);
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveDocSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveDocSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveDocSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveDocSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveDocSec(CurrentID, FileName).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cmbUsers;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
