package Hospital_Mgt_System;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import Hospital_Mgt_System.Admin;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tech Ninjaz
 */
public class LoginPharmacist extends javax.swing.JFrame {
sahidb dbobj=new sahidb();
    /**
     * Creates new form login
     */
    public LoginPharmacist() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        reset2 = new javax.swing.JButton();
        login2 = new javax.swing.JButton();
        juserName2 = new javax.swing.JTextField();
        exit2 = new javax.swing.JButton();
        jf2 = new javax.swing.JLabel();
        jfg2 = new javax.swing.JLabel();
        jpassword2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(62, 71, 86));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(183, 183, 183));
        jLabel3.setText("Pharmacist");

        reset2.setText("Reset");
        reset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        login2.setText("Login");
        login2.setMaximumSize(new java.awt.Dimension(61, 23));
        login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        juserName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juserNameMouseClicked(evt);
            }
        });
        juserName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserNameActionPerformed(evt);
            }
        });
        juserName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                juserNameKeyTyped(evt);
            }
        });

        exit2.setText(" Exit ");
        exit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jf2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jf2.setForeground(new java.awt.Color(183, 183, 183));
        jf2.setText("User Name");

        jfg2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jfg2.setForeground(new java.awt.Color(183, 183, 183));
        jfg2.setText("Password");

        jpassword2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpasswordMouseClicked(evt);
            }
        });
        jpassword2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfg2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(reset2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(exit2))
                            .addComponent(juserName2)
                            .addComponent(jpassword2))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(131, 131, 131))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jf2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfg2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset2)
                    .addComponent(exit2))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpasswordKeyTyped
        char f=evt.getKeyChar();
        if (f==' '||jpassword.getText().length()>9){
            evt.consume();
            getToolkit().beep();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordKeyTyped

    private void jpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpasswordMouseClicked

    }//GEN-LAST:event_jpasswordMouseClicked

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        First_Page pg=new First_Page();
        pg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void juserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_juserNameKeyTyped
        char c=evt.getKeyChar();
        if(Character.isDigit(c)||c=='_'||c=='!'|| c=='"' || c=='#' || c=='$' || c=='%' || c=='&'|| c=='\''|| c=='('|| c==')'|| c=='*'|| c=='+'|| c=='.'|| c==','|| c=='-'|| c=='='|| c==';'|| c==':'|| c=='"'||c=='/'||c=='?'||c=='>'||c=='<'||c=='@'||c==']'||c=='['||c=='\\'||c=='~'||c=='`'||c=='^'||c=='|'||c=='{'||c=='}'||juserName.getText().length()>=11){
            evt.consume();
            getToolkit().beep(); }
    }//GEN-LAST:event_juserNameKeyTyped

    private void juserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserNameActionPerformed

    private void juserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juserNameMouseClicked

    }//GEN-LAST:event_juserNameMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        check();
    }//GEN-LAST:event_loginActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        userName=juserName.getText();
        password=jpassword.getText();
        if (password.length()==0||userName.length()==0){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Nothing to Reset.","Error",JOptionPane.ERROR_MESSAGE);
        }
        else {
            juserName.setText(null);
            jpassword.setText(null);
        }
    }//GEN-LAST:event_resetActionPerformed
 static String userName;
 static String password;
 static String passwordRegex="^(?=[^\\d_].*?\\d)\\w(\\w|[!@#$%]){7,20}";
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
            java.util.logging.Logger.getLogger(LoginPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPharmacist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPharmacist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton exit1;
    private javax.swing.JButton exit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jf;
    private javax.swing.JLabel jf1;
    private javax.swing.JLabel jf2;
    private javax.swing.JLabel jfg;
    private javax.swing.JLabel jfg1;
    private javax.swing.JLabel jfg2;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JPasswordField jpassword1;
    private javax.swing.JPasswordField jpassword2;
    private javax.swing.JTextField juserName;
    private javax.swing.JTextField juserName1;
    private javax.swing.JTextField juserName2;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    private javax.swing.JButton login2;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JButton reset2;
    // End of variables declaration//GEN-END:variables

private void systemExit(){
WindowEvent windowClosing = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
}
public void check(){
    try{
        Connection con=dbobj.getConnection();
        PreparedStatement st=con.prepareStatement("SELECT name,password FROM pharmacists WHERE name=? AND password=?");
        st.setString(1,juserName.getText());
        st.setString(2,jpassword.getText());
        ResultSet rs=st.executeQuery();
        if(rs.next()){
            Pharmacist pharma=new Pharmacist();
            pharma.setVisible(true);
            this.dispose();
        } else{
            System.out.println("wrong password or username");
        }
        
    }catch(Exception e){
        System.out.println(e);
    }
}


}
