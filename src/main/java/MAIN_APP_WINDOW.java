
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niyi
 */
public class MAIN_APP_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form MAIN_APP_WINDOW
     */
    public MAIN_APP_WINDOW() {
        initComponents();
        // set the logo image
       // jLabel_APP_ICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("./images/logo.jpg")));
      
       // set the logo borders
       //Border logo_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
       //jLabel_APP_ICON.setBorder(logo_border);
       
       // set border to the app name label
       Border appName_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.white);
       jLabel_AppName.setBorder(appName_border);
       
       //set borders for the menu item of the main app
       Border  menu_items_border = BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(255,153,0));
       jLabel_Property.setBorder(menu_items_border);
       jLabel_Client.setBorder(menu_items_border);
       jLabel_Owner.setBorder(menu_items_border);
       jLabel_PropType.setBorder(menu_items_border);
       jLabel_PropertyImage.setBorder(menu_items_border);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_APP_ICON = new javax.swing.JLabel();
        jLabel_AppName = new javax.swing.JLabel();
        jLabel_PropType = new javax.swing.JLabel();
        jLabel_PropertyImage = new javax.swing.JLabel();
        jLabel_Client = new javax.swing.JLabel();
        jLabel_Property = new javax.swing.JLabel();
        jLabel_Owner = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel_APP_ICON.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_APP_ICON.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_APP_ICON.setText("  LOGO");
        jLabel_APP_ICON.setAutoscrolls(true);
        jLabel_APP_ICON.setOpaque(true);

        jLabel_AppName.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel_AppName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AppName.setText("MyAPP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_APP_ICON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_AppName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_AppName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_APP_ICON, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel_PropType.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_PropType.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_PropType.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PropType.setText(" Property-Type");
        jLabel_PropType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropType.setOpaque(true);
        jLabel_PropType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropTypeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropTypeMouseExited(evt);
            }
        });

        jLabel_PropertyImage.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_PropertyImage.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_PropertyImage.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_PropertyImage.setText(" Property-Image");
        jLabel_PropertyImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_PropertyImage.setOpaque(true);
        jLabel_PropertyImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyImageMouseExited(evt);
            }
        });

        jLabel_Client.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Client.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Client.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Client.setText(" Client");
        jLabel_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Client.setOpaque(true);
        jLabel_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_ClientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_ClientMouseExited(evt);
            }
        });

        jLabel_Property.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Property.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Property.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Property.setText(" Property");
        jLabel_Property.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Property.setOpaque(true);
        jLabel_Property.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_PropertyMouseExited(evt);
            }
        });

        jLabel_Owner.setBackground(new java.awt.Color(102, 102, 102));
        jLabel_Owner.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel_Owner.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Owner.setText(" Owner");
        jLabel_Owner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Owner.setOpaque(true);
        jLabel_Owner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_OwnerMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_PropType, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_PropertyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Property, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel_PropType, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_PropertyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel_Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 796, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // set MouseEntered and MouseExited actions for the menu
    private void jLabel_PropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseEntered
        jLabel_Property.setBackground(Color.white);
        jLabel_Property.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_PropertyMouseEntered

    private void jLabel_PropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyMouseExited
        jLabel_Property.setBackground(new Color(102,102,102));
        jLabel_Property.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_PropertyMouseExited

    private void jLabel_PropTypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropTypeMouseEntered
        jLabel_PropType.setBackground(Color.white);
        jLabel_PropType.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_PropTypeMouseEntered

    private void jLabel_PropTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropTypeMouseExited
        jLabel_PropType.setBackground(new Color(102,102,102));
        jLabel_PropType.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_PropTypeMouseExited

    private void jLabel_PropertyImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImageMouseEntered
        jLabel_PropertyImage.setBackground(Color.white);
        jLabel_PropertyImage.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_PropertyImageMouseEntered

    private void jLabel_PropertyImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_PropertyImageMouseExited
        jLabel_PropertyImage.setBackground(new Color(102,102,102));
        jLabel_PropertyImage.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_PropertyImageMouseExited

    private void jLabel_OwnerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseEntered
        jLabel_Owner.setBackground(Color.white);
        jLabel_Owner.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_OwnerMouseEntered

    private void jLabel_OwnerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_OwnerMouseExited
        jLabel_Owner.setBackground(new Color(102,102,102));
        jLabel_Owner.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_OwnerMouseExited

    private void jLabel_ClientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientMouseEntered
        jLabel_Client.setBackground(Color.white);
        jLabel_Client.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jLabel_ClientMouseEntered

    private void jLabel_ClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ClientMouseExited
        jLabel_Client.setBackground(new Color(102,102,102));
        jLabel_Client.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_ClientMouseExited

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
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN_APP_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN_APP_WINDOW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_APP_ICON;
    private javax.swing.JLabel jLabel_AppName;
    private javax.swing.JLabel jLabel_Client;
    private javax.swing.JLabel jLabel_Owner;
    private javax.swing.JLabel jLabel_PropType;
    private javax.swing.JLabel jLabel_Property;
    private javax.swing.JLabel jLabel_PropertyImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
