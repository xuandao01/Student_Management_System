/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BTL;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
/**
 *
 * @author txdao
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(400,330);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        UserText = new javax.swing.JTextField();
        PassText = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        NoAcc = new javax.swing.JLabel();
        UserMess = new javax.swing.JLabel();
        Passmess = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        Create = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        UserLabel.setText("User:");

        jLabel2.setFont(new java.awt.Font("KG Red Hands", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOGIN");

        PassLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        PassLabel.setText("Password:");
        PassLabel.setToolTipText("");

        UserText.setToolTipText("");
        UserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTextActionPerformed(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        NoAcc.setText("No account?");
        NoAcc.setToolTipText("");
        NoAcc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoAcc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                NoAccMouseDragged(evt);
            }
        });
        NoAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoAccMouseClicked(evt);
            }
        });

        UserMess.setForeground(new java.awt.Color(255, 0, 0));

        Passmess.setForeground(new java.awt.Color(255, 0, 0));

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        Create.setText("Create");
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(UserLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PassLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PassText)
                                        .addComponent(Passmess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(LoginButton)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(CancelButton))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(NoAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(UserMess, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserMess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Passmess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(CancelButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoAcc)
                    .addComponent(Create))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NoAccMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoAccMouseDragged
        CreateForm Create = new CreateForm();
        Create.setVisible(true);
    }//GEN-LAST:event_NoAccMouseDragged

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String User;
        String Pass="";
        boolean checkUser = false;
        boolean checkPass = false;
        DBEngine db = new DBEngine();
        String fileName = "taikhoan.txt";
        String fileName2 = "taikhoangv.txt";
        String fileName3 = "taikhoanqtv.txt";
        ArrayList<TaiKhoan> dstk = new ArrayList<TaiKhoan>();
        ArrayList<TaiKhoan> dstkgv = new ArrayList<TaiKhoan>();
        ArrayList<TaiKhoan> dstkqtv = new ArrayList<TaiKhoan>();

        try{
            dstk = (ArrayList<TaiKhoan>)db.docFile(fileName);
            dstkgv = (ArrayList<TaiKhoan>)db.docFile(fileName2);
            dstkqtv = (ArrayList<TaiKhoan>)db.docFile(fileName3);

        }
        catch(Exception E){
            JOptionPane.showMessageDialog(rootPane, E.toString());
        }
        char[] PW = PassText.getPassword();
        for(int i=0;i<PW.length;i++){
            Pass+=PW[i];
        }
        User = UserText.getText();
        if(User.length()<1 || Pass.length()<1){
            JOptionPane.showMessageDialog(rootPane, "Ban phai dien day du thong tin!");
            return;
        }
        for(int i=0;i<dstk.size();i++){
            TaiKhoan a = dstk.get(i);
            if(a.user.compareTo(User) == 0){
                checkUser = true;
                UserMess.setVisible(false);
                if(a.pass.compareTo(Pass)==0){
                    JOptionPane.showMessageDialog(rootPane, "Login thanh cong");
                    MainFrame frame = new MainFrame();
                    frame.user = User;
                    frame.userKind = a.kind;
                    frame.setVisible(true);
                    this.setVisible(false);
                    MainFrame frame2 = new MainFrame();
                    frame.setVisible(false);
                    frame2.setVisible(true);
                    break;
                }
                else{
                    Passmess.setText("Password khong dung!");
                    return;
                }
            }
        }
        //Giang vien
        for(int i=0;i<dstkgv.size();i++){
            TaiKhoan a = dstkgv.get(i);
            if(a.user.compareTo(User) == 0){
                checkUser = true;
                UserMess.setVisible(false);
                if(a.pass.compareTo(Pass)==0){
                    JOptionPane.showMessageDialog(rootPane, "Login thanh cong");
                    MainFrame frame = new MainFrame();
                    frame.user = User;
                    frame.userKind = a.kind;
                    frame.setVisible(true);
                    this.setVisible(false);
                    MainFrame frame2 = new MainFrame();
                    frame.setVisible(false);
                    frame2.setVisible(true);
                    break;
                }
                else{
                    Passmess.setText("Password khong dung!");
                    return;
                }
            }
        }
        //QTV
        for(int i=0;i<dstkqtv.size();i++){
            TaiKhoan a = dstkqtv.get(i);
            if(a.user.compareTo(User) == 0){
                checkUser = true;
                UserMess.setVisible(false);
                if(a.pass.compareTo(Pass)==0){
                    JOptionPane.showMessageDialog(rootPane, "Login thanh cong");
                    MainFrame frame = new MainFrame();
                    frame.user = User;
                    frame.userKind = a.kind;
                    frame.setVisible(true);
                    this.setVisible(false);
                    MainFrame frame2 = new MainFrame();
                    frame.setVisible(false);
                    frame2.setVisible(true);
                    break;
                }
                else{
                    Passmess.setText("Password khong dung!");
                    return;
                }
            }
        }
        
        UserMess.setText("User khong ton tai!");
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.setVisible(false);
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void NoAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoAccMouseClicked
        CreateForm Create = new CreateForm();
        Create.setVisible(true);
    }//GEN-LAST:event_NoAccMouseClicked

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
        CreateForm Create = new CreateForm();
        Create.setVisible(true);
    }//GEN-LAST:event_CreateActionPerformed

    private void UserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTextActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    private javax.swing.JOptionPane Pane;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton Create;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel NoAcc;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JPasswordField PassText;
    private javax.swing.JLabel Passmess;
    private javax.swing.JLabel UserLabel;
    private javax.swing.JLabel UserMess;
    private javax.swing.JTextField UserText;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}