
package log;

import ad.adminDashb;
import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import registrattion.registrationForm;
import userDashb.userDashboard;


public class login_form extends javax.swing.JFrame {

  
    public login_form() {
        initComponents();
    }
    static String name_f,name_l;
    public static boolean loginAcc(String j_username, String j_password){
        dbConnector connector = new dbConnector();
        try{
            String query = "SELECT * FROM `tbl_users`  WHERE u_username = '" + j_username + "' AND u_password = '" + j_password + "'AND u_status = 'Active'";
            ResultSet resultSet = connector.getData(query);
            return resultSet.next();
        }catch (SQLException ex) {
            return false;
        }

    }
    public static String getRole(String j_username, String j_password){
        dbConnector connect = new dbConnector();
        try{
            String sql = "SELECT u_userT FROM `tbl_users` WHERE u_username = '"+j_username+"'AND u_password = '"+j_password+"'";
            ResultSet rs= connect.getData(sql);
            if(rs.next()){
                name_f = rs.getString("u_fname");
                name_l= rs.getString("u_lname");
                return rs.getString("u_userT");
            }else{
                return null;
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
            return null;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        j_password = new javax.swing.JTextField();
        j_username = new javax.swing.JTextField();
        j_exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        j_login = new javax.swing.JButton();
        r_create = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/business (2).jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 400));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Username:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 110, 80, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 170, 110, 14);
        jPanel1.add(j_password);
        j_password.setBounds(110, 190, 200, 30);
        jPanel1.add(j_username);
        j_username.setBounds(110, 130, 200, 30);

        j_exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_exit.setText("Exit");
        j_exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_exitActionPerformed(evt);
            }
        });
        jPanel1.add(j_exit);
        j_exit.setBounds(110, 250, 80, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Mavi Money Remittance");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(140, 30, 230, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bank-100.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 20, 100, 80);

        j_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        j_login.setText("Login");
        j_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_loginActionPerformed(evt);
            }
        });
        jPanel1.add(j_login);
        j_login.setBounds(230, 250, 80, 30);

        r_create.setText("Create Account?");
        r_create.setBorder(null);
        r_create.setBorderPainted(false);
        r_create.setContentAreaFilled(false);
        r_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r_createMouseClicked(evt);
            }
        });
        jPanel1.add(r_create);
        r_create.setBounds(120, 300, 180, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/business (2).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 0, 400, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void j_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_loginActionPerformed
                 if(loginAcc(j_username.getText(),j_password.getText())){
                String userType = getRole(j_username.getText(),j_password.getText()); 

            if (userType.equals("Admin")) {
                JOptionPane.showMessageDialog(null,"Admin Login Success!");
                adminDashb adminDashb = new adminDashb();
                adminDashb.setVisible(true);
                this.dispose();
            } else if (userType.equals("User")) {
                JOptionPane.showMessageDialog(null,"User Login Success!");
                userDashboard userDashboard = new userDashboard();
                userDashboard.setVisible(true);
                this.dispose();          
            } else {
                JOptionPane.showMessageDialog(null,"Unknown Role! Cannot login."); 
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null,"Login Failed!");
        }

                
    }//GEN-LAST:event_j_loginActionPerformed

    private void r_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r_createMouseClicked
        registrationForm ads = new registrationForm();
        ads.setVisible(true);
        ads.pack();
        ads.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_r_createMouseClicked

    private void j_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_exitActionPerformed

        int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Select an option...",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
        System.exit(0);
        }
        
    }//GEN-LAST:event_j_exitActionPerformed

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
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton j_exit;
    private javax.swing.JButton j_login;
    private javax.swing.JTextField j_password;
    private javax.swing.JTextField j_username;
    private javax.swing.JButton r_create;
    // End of variables declaration//GEN-END:variables
}
