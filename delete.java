
package csc304;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class delete extends javax.swing.JFrame {
Connection con;
   
    public delete() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Deletebill_frame = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jFrame1 = new javax.swing.JFrame();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel11.setText("Enter the bill number you want to delete");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Deletebill_frameLayout = new javax.swing.GroupLayout(Deletebill_frame.getContentPane());
        Deletebill_frame.getContentPane().setLayout(Deletebill_frameLayout);
        Deletebill_frameLayout.setHorizontalGroup(
            Deletebill_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Deletebill_frameLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Deletebill_frameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(36, 36, 36))
        );
        Deletebill_frameLayout.setVerticalGroup(
            Deletebill_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Deletebill_frameLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(Deletebill_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11))
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel13.setText("Enter the Order Number you want to delete");

        jButton14.setText("DELETE");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton14)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton14)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton8.setText("Bill");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setText("Order");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       //Code for delete BILL!!!!!!
        String bill =jTextField11.getText(); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
     
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
try { 
    connecation();
            String orderNum=jTextField13.getText(); 
        con.setAutoCommit(false); 
 
        //  ةفلتخم لوادج يف بلطلا دوجو نم ققحتلا 
        String checkSQL = "SELECT COUNT(*) FROM BILL WHERE BOrderNum = ? UNION ALL " + 
                          "SELECT COUNT(*) FROM ASSIGNED_TO WHERE OrderNum = ? UNION ALL " + 
                          "SELECT COUNT(*) FROM HAS WHERE Order_Num = ? UNION ALL " + 
                          "SELECT COUNT(*) FROM `ORDER` WHERE OrderNumber = ?"; 
         
        boolean orderExists = false; 
        try (PreparedStatement checkStmt = con.prepareStatement(checkSQL)) { 
            checkStmt.setString(1, orderNum); 
            checkStmt.setString(2, orderNum); 
            checkStmt.setString(3, orderNum); 
            checkStmt.setString(4, orderNum); 
             
            try (ResultSet rs = checkStmt.executeQuery()) { 
                while (rs.next()) { 
                    if (rs.getInt(1) > 0) { 
                        orderExists = true; 
                        break; 
                    } 
                } 
            } 
        } 
 
        if (orderExists) { 
            //  ذح ف  لودج نم BILL 
            String deleteBillSQL = "DELETE FROM BILL WHERE BOrderNum = ?"; 
            try (PreparedStatement deleteBillStmt = con.prepareStatement(deleteBillSQL)) { 
                deleteBillStmt.setString(1, orderNum); 
                deleteBillStmt.executeUpdate(); 
            } 
 
            String deleteAssignedToSQL = "DELETE FROM ASSIGNED_TO WHERE OrderNum = ?"; 
            try (PreparedStatement deleteAssignedToStmt = 
con.prepareStatement(deleteAssignedToSQL)) { 
                deleteAssignedToStmt.setString(1, orderNum); 
                deleteAssignedToStmt.executeUpdate(); 
            } 
 
            //  فذح لودج نم HAS 
            String deleteHasSQL = "DELETE FROM HAS WHERE Order_Num = ?"; 
            try (PreparedStatement deleteHasStmt = con.prepareStatement(deleteHasSQL)) { 
                deleteHasStmt.setString(1, orderNum); 
                deleteHasStmt.executeUpdate(); 
            } 
 
             
            String deleteOrderSQL = "DELETE FROM `ORDER` WHERE OrderNumber = ?"; 
            try (PreparedStatement deleteOrderStmt = con.prepareStatement(deleteOrderSQL)) { 
                deleteOrderStmt.setString(1, orderNum); 
                deleteOrderStmt.executeUpdate(); 
            } 
 
            con.commit();  
              javax.swing.JOptionPane.showMessageDialog(this, "Delete succssfully"); 
        } else { 
              javax.swing.JOptionPane.showMessageDialog(this, "Order DOESN'T exist!"); 
        } 
 
    } catch (SQLException | ClassNotFoundException ex) { 
        try { 
            con.rollback();  
        } catch (SQLException rollbackEx) { 
        } 
          javax.swing.JOptionPane.showMessageDialog(this, "Error deleting order" + ex.getMessage()); 
    } finally { 
        try { 
            con.setAutoCommit(true);  
        } catch (SQLException ex) { 
            ex.printStackTrace(); 
        }       
}     
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         Deletebill_frame.setSize(400,300);
       Deletebill_frame.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jFrame1.setSize(400,300);
        jFrame1.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
    
   void connecation() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema", "root", "1234");
}
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
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Deletebill_frame;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    // End of variables declaration//GEN-END:variables
}
