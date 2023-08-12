package ec.edu.espe.HOManagment.view;

import ec.edu.espe.HOManagment.controller.Connection;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author  Code Warriors, DCCO-ESPE
 */
public class FrmHardwareStoreMenu extends javax.swing.JFrame {

    public class centerFrame extends javax.swing.JFrame {

        public centerFrame() {
            initComponents();

            setLocationRelativeTo(null);
        }
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/menu_bg.png"));
        return retValue;
    }

    /**
     * Creates new form frmStylesirelia
     */
    public FrmHardwareStoreMenu() {
        initComponents();
        Connection.connectionDataBase();

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        txtStyles = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuAddCustomer = new javax.swing.JMenuItem();
        menuUpdateCustomer = new javax.swing.JMenuItem();
        menuDeleteCustomer = new javax.swing.JMenuItem();
        itmTableCustomer = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itmProduct = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuDeleteProduct = new javax.swing.JMenuItem();
        itmTableProduct = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itemAddSuppliers = new javax.swing.JMenuItem();
        itemUpdateSuppliers = new javax.swing.JMenuItem();
        itemDeleteSuppliers = new javax.swing.JMenuItem();
        itmTableSupllier = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        txtStyles.setText("S&O Ferretería");
        txtStyles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStylesActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Acerca");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        txtStyles.add(jMenuItem1);

        jMenuBar1.add(txtStyles);

        jMenu1.setText("Clientes");
        jMenu1.setEnabled(false);

        menuAddCustomer.setText("Agregar cliente");
        menuAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(menuAddCustomer);

        menuUpdateCustomer.setText("Actualizar cliente");
        menuUpdateCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(menuUpdateCustomer);

        menuDeleteCustomer.setText("Eliminar cliente");
        menuDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(menuDeleteCustomer);

        itmTableCustomer.setText("Tabla de clientes");
        itmTableCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableCustomerActionPerformed(evt);
            }
        });
        jMenu1.add(itmTableCustomer);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Productos");

        itmProduct.setText("Agregar productos");
        itmProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProductActionPerformed(evt);
            }
        });
        jMenu4.add(itmProduct);

        jMenuItem2.setText("Actualizar productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        menuDeleteProduct.setText("Eliminar productos");
        menuDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteProductActionPerformed(evt);
            }
        });
        jMenu4.add(menuDeleteProduct);

        itmTableProduct.setText("Tabla de productos");
        itmTableProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableProductActionPerformed(evt);
            }
        });
        jMenu4.add(itmTableProduct);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Proveedor");
        jMenu6.setEnabled(false);

        itemAddSuppliers.setText("Agregar proveedor");
        itemAddSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddSuppliersActionPerformed(evt);
            }
        });
        jMenu6.add(itemAddSuppliers);

        itemUpdateSuppliers.setText("Actualizar proveedor");
        itemUpdateSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUpdateSuppliersActionPerformed(evt);
            }
        });
        jMenu6.add(itemUpdateSuppliers);

        itemDeleteSuppliers.setText("Eliminar proveedor");
        itemDeleteSuppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDeleteSuppliersActionPerformed(evt);
            }
        });
        jMenu6.add(itemDeleteSuppliers);

        itmTableSupllier.setText("Tabla de proveedores");
        itmTableSupllier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmTableSupllierActionPerformed(evt);
            }
        });
        jMenu6.add(itmTableSupllier);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Ayuda");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Ayuda de la aplicación");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStylesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStylesActionPerformed
        FrmHardwareStoreMenu frmHardwareStore;
        frmHardwareStore = new FrmHardwareStoreMenu();
        frmHardwareStore.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtStylesActionPerformed

    private void itmProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProductActionPerformed
        FrmProduct frmProduct;
        frmProduct = new FrmProduct();
        frmProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmProductActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmAbout frmAbout;
        frmAbout = new FrmAbout();
        frmAbout.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void itmTableProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableProductActionPerformed
        FrmTableProduct frmTableProduct;
        frmTableProduct = new FrmTableProduct();
        frmTableProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmTableProductActionPerformed

    private void itmTableCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableCustomerActionPerformed
        FrmTableCustomer frmTableCustomer;
        frmTableCustomer = new FrmTableCustomer();
        frmTableCustomer.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_itmTableCustomerActionPerformed

    private void itmTableSupllierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmTableSupllierActionPerformed

        FrmTableSupplier frmTableSupplier;
        frmTableSupplier = new FrmTableSupplier();
        frmTableSupplier.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_itmTableSupllierActionPerformed

    private void itemAddSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddSuppliersActionPerformed
        FrmSupplier frmSupplier;
        frmSupplier = new FrmSupplier();
        frmSupplier.setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_itemAddSuppliersActionPerformed

    private void itemUpdateSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUpdateSuppliersActionPerformed
        FrmUpdateSupplier frmUpdateSupplier;
        frmUpdateSupplier = new FrmUpdateSupplier();
        frmUpdateSupplier.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_itemUpdateSuppliersActionPerformed

    private void itemDeleteSuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDeleteSuppliersActionPerformed
        FrmDeleteSupplier frmDeleteSupplier;
        frmDeleteSupplier = new FrmDeleteSupplier();
        frmDeleteSupplier.setVisible(true);
        this.setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_itemDeleteSuppliersActionPerformed

    private void menuAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddCustomerActionPerformed
        FrmCustomer frmCustomer = new FrmCustomer();
        frmCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuAddCustomerActionPerformed

    private void menuUpdateCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateCustomerActionPerformed
        FrmUpdateCustomer frmUpdateCustomer = new FrmUpdateCustomer();
        frmUpdateCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuUpdateCustomerActionPerformed

    private void menuDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteCustomerActionPerformed
        FrmDeleteCustomer frmDeleteCustomer = new FrmDeleteCustomer();
        frmDeleteCustomer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuDeleteCustomerActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        FrmUpdateProduct frmUpdateProduct = new FrmUpdateProduct();
        frmUpdateProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteProductActionPerformed
        FrmDeleteProduct frmDeleteProduct = new FrmDeleteProduct();
        frmDeleteProduct.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_menuDeleteProductActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed


    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmHelp frmlHelp = new FrmHelp();
        frmlHelp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHardwareStoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHardwareStoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHardwareStoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHardwareStoreMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHardwareStoreMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAddSuppliers;
    private javax.swing.JMenuItem itemDeleteSuppliers;
    private javax.swing.JMenuItem itemUpdateSuppliers;
    private javax.swing.JMenuItem itmProduct;
    private javax.swing.JMenuItem itmTableCustomer;
    private javax.swing.JMenuItem itmTableProduct;
    private javax.swing.JMenuItem itmTableSupllier;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menuAddCustomer;
    private javax.swing.JMenuItem menuDeleteCustomer;
    private javax.swing.JMenuItem menuDeleteProduct;
    private javax.swing.JMenuItem menuUpdateCustomer;
    private javax.swing.JMenu txtStyles;
    // End of variables declaration//GEN-END:variables
}
