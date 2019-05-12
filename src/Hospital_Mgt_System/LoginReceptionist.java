package Hospital_Mgt_System;

import java.sql.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
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
public class LoginReceptionist extends javax.swing.JFrame {
sahidb dbobj=new sahidb();
    /**
     * Creates new form login
     */
    public LoginReceptionist() {
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        login = new javax.swing.JButton();
        juserName = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        jf = new javax.swing.JLabel();
        jfg = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(62, 71, 86));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(183, 183, 183));
        jLabel1.setText("Receptionist");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.setMaximumSize(new java.awt.Dimension(61, 23));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        juserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                juserNameMouseClicked(evt);
            }
        });
        juserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserNameActionPerformed(evt);
            }
        });
        juserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                juserNameKeyTyped(evt);
            }
        });

        exit.setText(" Exit ");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jf.setForeground(new java.awt.Color(183, 183, 183));
        jf.setText("User Name");

        jfg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jfg.setForeground(new java.awt.Color(183, 183, 183));
        jfg.setText("Password");

        jpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpasswordMouseClicked(evt);
            }
        });
        jpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jf, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                .addComponent(exit))
                            .addComponent(juserName)
                            .addComponent(jpassword))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(123, 123, 123))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(juserName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jfg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset)
                    .addComponent(exit))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 static String userName;
 static String password;
 static String passwordRegex="^(?=[^\\d_].*?\\d)\\w(\\w|[!@#$%]){7,20}";
    private void juserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserNameActionPerformed

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

    private void juserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juserNameMouseClicked
 // TODO add your handling code here:
    }//GEN-LAST:event_juserNameMouseClicked

    private void jpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpasswordMouseClicked
// TODO add your handling code here:
    }//GEN-LAST:event_jpasswordMouseClicked

    private void jpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpasswordKeyTyped
        char f=evt.getKeyChar();
        if (f==' '||jpassword.getText().length()>9){
        evt.consume();
        getToolkit().beep();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordKeyTyped

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
            java.util.logging.Logger.getLogger(LoginReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jf;
    private javax.swing.JLabel jfg;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField juserName;
    private javax.swing.JButton login;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

private void systemExit(){
WindowEvent windowClosing = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
}
public void check(){
    try{
        Connection con=dbobj.getConnection();
        PreparedStatement st=con.prepareStatement("SELECT name,password FROM receptionists WHERE name=? AND password=?");
        st.setString(1,juserName.getText());
        st.setString(2,jpassword.getText());
        ResultSet rs=st.executeQuery();
        if(rs.next()){
            Receptionist recept=new Receptionist();
            recept.setVisible(true);
            this.dispose();
        } else{
            System.out.println("wrong password or username");
        }
        
    }catch(Exception e){
        System.out.println(e);
    }
}

}
