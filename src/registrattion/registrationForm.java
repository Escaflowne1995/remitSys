package registrattion;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import log.login_form;
import userDashb.*;


public class registrationForm extends javax.swing.JFrame {


    public registrationForm() {
        initComponents();
    }
    public static String email, username;
    
         public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String sql = "SELECT * FROM `tbl_users` WHERE u_username = '"+j_username.getText()+"'OR u_email = '"+j_email.getText()+"'";
            ResultSet rs = dbc.getData(sql);
            
            if(rs.next()){
                email = rs.getString("u_email");
                if(email.equals(j_email.getText())){
                    JOptionPane.showMessageDialog(null, "Email is Already Used.");
                    j_email.setText("");
                }
                username = rs.getString("u_username");
                if(username.equals(j_username.getText())){
                    JOptionPane.showMessageDialog(null, "Username is Already Used.");
                    j_username.setText("");
                }
                return true;
            }else{
                return false;
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
        }
    }
    public boolean isPhoneNumberValid(String phoneNumber) {
    for (char c : phoneNumber.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false; 
        }
    }
    return true;
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        j_email = new javax.swing.JTextField();
        j_username = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        u_register = new javax.swing.JButton();
        userT = new javax.swing.JComboBox<>();
        u_cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        j_contact = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        j_password = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        j_address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        j_sex = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Email:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 150, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 190, 70, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("User Type:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 390, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Last Name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 110, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("First Name:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 70, 80, 30);
        jPanel1.add(lname);
        lname.setBounds(160, 110, 200, 30);
        jPanel1.add(j_email);
        j_email.setBounds(160, 150, 200, 30);
        jPanel1.add(j_username);
        j_username.setBounds(160, 190, 200, 30);
        jPanel1.add(fname);
        fname.setBounds(160, 70, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("Registration Form");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 20, 350, 44);

        u_register.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        u_register.setText("Register");
        u_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_registerActionPerformed(evt);
            }
        });
        jPanel1.add(u_register);
        u_register.setBounds(260, 430, 90, 23);

        userT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel1.add(userT);
        userT.setBounds(160, 390, 200, 30);

        u_cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        u_cancel.setText("Cancel");
        u_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(u_cancel);
        u_cancel.setBounds(160, 430, 71, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Contact No:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 350, 80, 30);
        jPanel1.add(j_contact);
        j_contact.setBounds(160, 350, 200, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Sex:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 310, 70, 30);
        jPanel1.add(j_password);
        j_password.setBounds(160, 230, 200, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Password:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 230, 70, 30);
        jPanel1.add(j_address);
        j_address.setBounds(160, 270, 200, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Address:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 270, 70, 30);
        jPanel1.add(j_sex);
        j_sex.setBounds(160, 310, 200, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//Register
    private void u_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_registerActionPerformed
 
        if(fname.getText().isEmpty()||lname.getText().isEmpty()||j_email.getText().isEmpty()||j_username.getText().isEmpty()||j_password.getText().isEmpty()||j_address.getText().isEmpty()||j_sex.getText().isEmpty()||j_contact.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required");
        }else if(j_password.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above");
            j_password.setText("");
        }else if(!isPhoneNumberValid(j_contact.getText())){
            JOptionPane.showMessageDialog(null, "Phone number should only be contained numbers.");
            j_contact.setText("");
            
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
           
        }
        
                
    }//GEN-LAST:event_u_registerActionPerformed

    private void u_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_cancelActionPerformed
        login_form ako = new login_form();
        ako.setVisible(true);
        ako.pack();
        ako.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_u_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField j_address;
    private javax.swing.JTextField j_contact;
    private javax.swing.JTextField j_email;
    private javax.swing.JTextField j_password;
    private javax.swing.JTextField j_sex;
    private javax.swing.JTextField j_username;
    private javax.swing.JTextField lname;
    private javax.swing.JButton u_cancel;
    private javax.swing.JButton u_register;
    private javax.swing.JComboBox<String> userT;
    // End of variables declaration//GEN-END:variables
}
