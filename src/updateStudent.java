
import dao.ConnectionProvider;

import java.text.SimpleDateFormat;
import java.sql.*;
import javax.swing.JOptionPane;

import java.util.Date;


    




public class updateStudent extends javax.swing.JFrame {
private String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
   
   private String username="";
   
  
    
     
    /**
     * Creates new form updateStudent
     */
    public updateStudent() {
        initComponents();
        
        setLocationRelativeTo(null);
    }
    public updateStudent(String tempUsername){
       
    initComponents();
     username = tempUsername;
            setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        comboUser = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dateDOB = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date of Birth");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 226, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 150, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 316, -1, -1));

        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 79, 260, 32));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 80, 90, 30));

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 184, 250, 36));

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 184, 240, 36));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, 36));

        txtAddress.setBackground(new java.awt.Color(255, 255, 255));
        txtAddress.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 0, 0));
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 350, 240, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 425, 120, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 41, 750, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SRS-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 76, 72));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 426, 120, 40));

        comboUser.setBackground(new java.awt.Color(255, 255, 255));
        comboUser.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        comboUser.setForeground(new java.awt.Color(0, 0, 0));
        comboUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Students" }));
        comboUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 0));
        jPanel1.add(comboUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 351, 250, 40));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Role");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        dateDOB.setBackground(new java.awt.Color(255, 255, 255));
        dateDOB.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jPanel1.add(dateDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 260, 240, 34));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 153));
        jButton4.setText("X");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update User");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      new adminDashboard(username).setVisible(true);
      this.dispose();
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int checkUserExist = 0;
String username = txtUsername.getText();

if (username.equals("")) {
    JOptionPane.showMessageDialog(null, "Username field is required.");
} else {
    SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
    try {
        Connection con = ConnectionProvider.getCon();
        Statement st = con.createStatement();

        // Fixed SQL query syntax by adding proper spacing and equals condition
        String query = "SELECT * FROM addStudents WHERE username = '" + username + "'";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
           
            checkUserExist = 1;
            txtName.setText(rs.getString("name"));
            txtID.setText(rs.getString("id"));
            txtEmail.setText(rs.getString("email"));
            txtAddress.setText(rs.getString("address"));
            String dob = rs.getString("dob");

           
            if (dob != null && !dob.isEmpty()) {
                try {
                    dateDOB.setDate(dFormat.parse(dob));
                } catch (Exception e) {
                   
                }
            }

            // Populate user role combo box based on the user role
           
            if ("admin".equals(rs.getString("userRole"))) {
                comboUser.removeAllItems();
                comboUser.addItem("admin");
                comboUser.addItem("student");
            } else {
                comboUser.removeAllItems();
                comboUser.addItem("student");
                comboUser.addItem("admin");
            }
        }

        // Check if user exists and show appropriate message
        if (checkUserExist == 0) {
            JOptionPane.showMessageDialog(null, "Username does not exist.");
        }

   
    }    catch (SQLException ex) {
            
         }
}

     
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String userRole = (String) comboUser.getSelectedItem();
        String name = txtName.getText();
       
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = (Date) dateDOB.getDate();
        String dob = "";
        if (date != null) {
            dob = dFormat.format(dateDOB.getDate());
        }
        String id = txtID.getText();
        String email = txtEmail.getText();
        String usname = txtUsername.getText();
        String address = txtAddress.getText();

        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is required.");
       
        } else if (dob.equals("")) {
            JOptionPane.showMessageDialog(null, "Date of Birth field is required.");
        
        
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is required.");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Email field is invalid.");
        } else if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Username field is required.");
        } else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address field is required.");
        } else {
            try {
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update addStudents set userRole=?, id=?,email=?, name=?, dob=?, address=?  where username=?");
                ps.setString(1, userRole);                                            
                ps.setString(2, id);
                ps.setString(3, email);
                 ps.setString(4, name);
                ps.setString(5, dob);
                ps.setString(6, address);
                ps.setString(7, usname);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User updated successfully");
                setVisible(false);
                new updateStudent(username).setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(updateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboUser;
    private com.toedter.calendar.JDateChooser dateDOB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    
}
