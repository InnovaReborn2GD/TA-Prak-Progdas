package id.pajerosportdakar.carsale.test;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoginFrame extends javax.swing.JFrame {
    
    /**
     * Creates new form LoginFrame
     * @param userList
     */
    
    public LoginFrame(ArrayList<User> userList) {
        this.userList = userList;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogin1 = new javax.swing.JLabel();
        lbLogin3 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lbLogin4 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        tbDaftar = new javax.swing.JButton();
        tbLogin = new javax.swing.JButton();
        chbShowPass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lbLogin1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbLogin1.setText("Selamat Datang!");

        lbLogin3.setText("Nama Pengguna");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        lbLogin4.setText("Kata Sandi");

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        tbDaftar.setText("Belum punya akun? Klik disini!");
        tbDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDaftarActionPerformed(evt);
            }
        });

        tbLogin.setText("Loginkan...");
        tbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbLoginActionPerformed(evt);
            }
        });

        chbShowPass.setText("Tampilkan Sandi");
        chbShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbShowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogin1)
                            .addComponent(lbLogin3)
                            .addComponent(lbLogin4)
                            .addComponent(tbLogin)
                            .addComponent(chbShowPass)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pfPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(tfUsername, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(180, 180, 180))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tbDaftar)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lbLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLogin3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLogin4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbShowPass)
                .addGap(31, 31, 31)
                .addComponent(tbLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(tbDaftar)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void tbDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDaftarActionPerformed
        // TODO add your handling code here:
        new RegistrationFrame(userList).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tbDaftarActionPerformed

    private void tbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbLoginActionPerformed
        // TODO add your handling code here:
        loginUser();
    }//GEN-LAST:event_tbLoginActionPerformed

    private void chbShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbShowPassActionPerformed
        // TODO add your handling code here:
        if (chbShowPass.isSelected()) {
            pfPassword.setEchoChar((char)0);
        } else {
            pfPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_chbShowPassActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed
    
    private void loginUser() {  
        String username = tfUsername.getText();  
        String password = new String(pfPassword.getPassword());  

        for (User user : userList) {  
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {   
                new MainFrame(username, Main.carList).setVisible(true);
                this.dispose();
                return;  
            }  
        }  
        JOptionPane.showMessageDialog(this, "Gagal Masuk. \nNama pengguna atau kata sandi tidak sah.", "Galat", JOptionPane.ERROR_MESSAGE);  
    }        
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chbShowPass;
    private javax.swing.JLabel lbLogin1;
    private javax.swing.JLabel lbLogin3;
    private javax.swing.JLabel lbLogin4;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JButton tbDaftar;
    private javax.swing.JButton tbLogin;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
    private ArrayList<User> userList;
}
