
package userDashb;
import registrattion.*;


public class userDashboard extends javax.swing.JFrame {


    public userDashboard() {
        initComponents();
    }
    
    public void setUserData(String Fname,String Lname,String Email, String Address, String Age,String Contact, String Sex,String UserType){
        name_f.setText(Fname);
        name_l.setText(Lname);
        email.setText(Email);
        address.setText(Address);
        age.setText(Age);
        contact.setText(Contact);
        sex.setText(Sex);
        userType.setText(UserType);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        j_logout = new javax.swing.JButton();
        j_logout1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userType = new javax.swing.JLabel();
        name_l = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        name_f = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-profile-picture-80.png"))); // NOI18N

        j_logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j_logout.setText("Logout");
        j_logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        j_logout1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        j_logout1.setText("Admin");
        j_logout1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(j_logout1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(j_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(19, 19, 19))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(j_logout1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(j_logout)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 110, 370);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("User Dashboard");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(220, 0, 200, 60);

        userType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userType.setText("User Type:");
        jPanel1.add(userType);
        userType.setBounds(130, 240, 70, 20);

        name_l.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_l.setText("Last Name:");
        jPanel1.add(name_l);
        name_l.setBounds(130, 120, 70, 20);

        email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email.setText("Email:");
        jPanel1.add(email);
        email.setBounds(130, 140, 60, 20);

        address.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        address.setText("Address:");
        jPanel1.add(address);
        address.setBounds(130, 160, 60, 20);

        age.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        age.setText("Age:");
        jPanel1.add(age);
        age.setBounds(130, 180, 60, 20);

        contact.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contact.setText("Contact No. :");
        jPanel1.add(contact);
        contact.setBounds(130, 200, 100, 20);

        name_f.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name_f.setText("First Name:");
        jPanel1.add(name_f);
        name_f.setBounds(130, 100, 70, 20);

        sex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sex.setText("Sex:");
        jPanel1.add(sex);
        sex.setBounds(130, 220, 60, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//
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
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton j_logout;
    private javax.swing.JButton j_logout1;
    private javax.swing.JLabel name_f;
    private javax.swing.JLabel name_l;
    private javax.swing.JLabel sex;
    private javax.swing.JLabel userType;
    // End of variables declaration//GEN-END:variables

 
    }
