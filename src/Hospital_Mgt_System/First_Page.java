/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital_Mgt_System;

import java.awt.Color;
import Hospital_Mgt_System.LoginAdmin;
import Hospital_Mgt_System.LoginDoctor;
import Hospital_Mgt_System.LoginPharmacist;
import Hospital_Mgt_System.LoginReceptionist;

/**
 *
 * @author Saad
 */
public class First_Page extends javax.swing.JFrame {

    /**
     * Creates new form Front_Page
     */
    public First_Page() {
        initComponents();
        setResizable(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        jAdmin = new javax.swing.JButton();
        jReceptionist = new javax.swing.JButton();
        jDoctor = new javax.swing.JButton();
        jPharmacist = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(267, 11, 0, 0);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Page");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 157, 107, 27);

        jAdmin.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jAdmin.setText("Admin");
        jAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jAdmin);
        jAdmin.setBounds(390, 211, 115, 36);

        jReceptionist.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jReceptionist.setText("Receptionist");
        jReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReceptionistActionPerformed(evt);
            }
        });
        getContentPane().add(jReceptionist);
        jReceptionist.setBounds(390, 277, 115, 38);

        jDoctor.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jDoctor.setText("Doctor");
        jDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDoctorActionPerformed(evt);
            }
        });
        getContentPane().add(jDoctor);
        jDoctor.setBounds(390, 342, 115, 38);

        jPharmacist.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jPharmacist.setText("Pharmacist");
        jPharmacist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPharmacistActionPerformed(evt);
            }
        });
        getContentPane().add(jPharmacist);
        jPharmacist.setBounds(390, 398, 115, 38);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\me\\Documents\\NetBeansProjects\\oop2\\src\\Logo.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 10, 450, 150);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\me\\Documents\\NetBeansProjects\\oop2\\src\\back.jpg")); // NOI18N
        jLabel3.setText("jkasdfhkasdhfkah");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 900, 650);

        setSize(new java.awt.Dimension(914, 525));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAdminActionPerformed
LoginAdmin admin=new LoginAdmin();
admin.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jAdminActionPerformed

    private void jReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReceptionistActionPerformed
LoginReceptionist recept=new LoginReceptionist();
recept.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jReceptionistActionPerformed

    private void jDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDoctorActionPerformed
LoginDoctor doctor=new LoginDoctor();
doctor.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jDoctorActionPerformed

    private void jPharmacistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPharmacistActionPerformed
LoginPharmacist pharma=new LoginPharmacist();
pharma.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jPharmacistActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
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
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAdmin;
    private javax.swing.JButton jDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jPharmacist;
    private javax.swing.JButton jReceptionist;
    // End of variables declaration//GEN-END:variables
}
