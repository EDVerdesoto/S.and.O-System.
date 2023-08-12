
package ec.edu.espe.HOManagment.view;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.toedter.calendar.JDateChooser;
import ec.edu.espe.HOManagment.controller.Connection;
import ec.edu.espe.HOManagment.controller.ProductController;
import ec.edu.espe.HOManagment.model.Product;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Tipan Leonel, Code Warriors, DCCO-ESPE
 */
public class FrmUpdateProduct extends javax.swing.JFrame {

    public class centerFrame extends javax.swing.JFrame {

        public centerFrame() {
            initComponents();

            setLocationRelativeTo(null);
        }
    }

    SimpleDateFormat formDate = new SimpleDateFormat("dd-MM-yyyy");
    ProductController productController;

    public String getDate(JDateChooser jdDate) {
        if (jdDate.getDate() != null) {
            return formDate.format(jdDate.getDate());
        } else {
            return null;
        }

    }

    /**
     * Creates new form FrmUpdateProduct
     */
    public FrmUpdateProduct() {
        initComponents();
        Connection.connectionDataBase();
        productController = new ProductController();
        loadProductComboBox();
    }
    
    public void loadProductComboBox() {
        CodecRegistry codecRegistry = MongoClientSettings.getDefaultCodecRegistry();
        codecRegistry = fromRegistries(codecRegistry, fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Product> collectionProducts = db.getCollection("products", Product.class);
        List<Product> products = collectionProducts.find().into(new ArrayList<>());

        comboBoxProducts.removeAllItems(); // Limpiar los elementos actuales del combo box

        for (Product product : products) {
            comboBoxProducts.addItem(product.getName());
        }
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
        btnUpdate = new javax.swing.JButton();
        comboBoxProducts = new javax.swing.JComboBox<>();
        btnBackMenu = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtExpirationDate = new com.toedter.calendar.JDateChooser();
        Appoiment = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBackMenu.setText("Volver");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });

        btnFind.setText("Editar");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Nombre:");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Precio:");

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Fecha de modificacion");

        Appoiment.setForeground(new java.awt.Color(0, 51, 51));
        Appoiment.setText("Stock");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Actualizar Producto");

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Nombre del Producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Appoiment, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(comboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnFind))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnUpdate)
                        .addGap(117, 117, 117)
                        .addComponent(btnBackMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(comboBoxProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Appoiment))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnBackMenu))
                .addContainerGap(14, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        try {
            Document doc = productController.read(comboBoxProducts.getSelectedItem().toString(), "name");
            Product product = productController.parseDocumentToClass(doc);
            txtStock.setText(product.getIncome());
            txtName.setText(product.getName());
            txtPrice.setText(String.valueOf(product.getPrice()));
            txtExpirationDate.setDate(formDate.parse(product.getIncome()));
            txtStock.setText(String.valueOf(product.getStock()));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error, reintente");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se encontro");
        }

    }//GEN-LAST:event_btnFindActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");}        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros \n Enter only numbers");}   // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceKeyTyped

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros \n Enter only numbers");}  // TODO add your handling code here:
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Product product = new Product(txtName.getText(),Float.parseFloat(txtPrice.getText()),formDate.format(txtExpirationDate.getDate()),Integer.parseInt(txtStock.getText()));
        Document doc = productController.read(comboBoxProducts.getSelectedItem().toString(), "name");

        productController.update(doc, productController.buildDocument(product));
        Document result = productController.read(productController.buildDocument(product));
        if (result!=null) {

            JOptionPane.showMessageDialog(null, "Actualizado correctamente");

        }else{
            JOptionPane.showMessageDialog(null, "Hubo un problema, reintente");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed
        FrmHardwareStoreMenu frmStylesIreliaMenu = new FrmHardwareStoreMenu();
        frmStylesIreliaMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackMenuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appoiment;
    private javax.swing.JButton btnBackMenu;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser txtExpirationDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
