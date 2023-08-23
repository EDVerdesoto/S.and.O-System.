
package ec.edu.espe.HOManagment.view;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.HOManagment.controller.CustomerController;
import ec.edu.espe.HOManagment.controller.Connection;
import ec.edu.espe.HOManagment.model.Customer;
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
public class FrmUpdateCustomer extends javax.swing.JFrame {

     public class centerFrame extends javax.swing.JFrame {

        public centerFrame() {
            initComponents();

            setLocationRelativeTo(null);
        }
    }

    private CustomerController customerController;

    /**
     * Creates new form FrmUpdateCustomer
     */
    public FrmUpdateCustomer() {
        initComponents();
        Connection.connectionDataBase();
        customerController = new CustomerController();
        loadCustomerComboBox();
        setLocationRelativeTo(null);
    }
    
    public void loadCustomerComboBox() {
        CodecRegistry codecRegistry = MongoClientSettings.getDefaultCodecRegistry();
        codecRegistry = fromRegistries(codecRegistry, fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Customer> collectionCustomers = db.getCollection("customers", Customer.class);
        List<Customer> customers = collectionCustomers.find().into(new ArrayList<>());

        comboBoxCustomers.removeAllItems(); // Limpiar los elementos actuales del combo box

        for (Customer customer : customers) {
            comboBoxCustomers.addItem(customer.getIdentificationCard());
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
        cmbPayment = new javax.swing.JComboBox<>();
        Appoiment = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAppoiment = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBoxCustomers = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        txtUpdate1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnBackMenu = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pay", "Need to pay" }));
        cmbPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaymentActionPerformed(evt);
            }
        });

        Appoiment.setForeground(new java.awt.Color(0, 51, 51));
        Appoiment.setText("Fecha");

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Actualizar Cliente");

        txtAppoiment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppoimentActionPerformed(evt);
            }
        });
        txtAppoiment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAppoimentKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Cedula");

        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Dirección");

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });

        btnFind.setText("Editar");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        txtUpdate1.setText("Actualizar");
        txtUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpdate1ActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Nombre");

        btnBackMenu.setText("Volver");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Número");

        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Pagado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Appoiment, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtAppoiment, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(comboBoxCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnFind))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(cmbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(txtUpdate1)
                        .addGap(117, 117, 117)
                        .addComponent(btnBackMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(comboBoxCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cmbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Appoiment))
                    .addComponent(txtAppoiment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpdate1)
                    .addComponent(btnBackMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        try {
            Document doc = customerController.read(comboBoxCustomers.getSelectedItem().toString(),"identificationCard");
            Customer customer = customerController.parseDocumentToClass(doc);

            txtAppoiment.setText(customer.getAppointment());
            txtName.setText(customer.getName());
            txtAddress.setText(customer.getAddress());
            txtNumber.setText(String.valueOf(customer.getNumber()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique bien los datos, no se encontro.");
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");} // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros \n Enter only numbers");} // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberKeyTyped

    private void cmbPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPaymentActionPerformed

    private void txtAppoimentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppoimentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppoimentActionPerformed

    private void txtAppoimentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAppoimentKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");} // TODO add your handling code here:
    }//GEN-LAST:event_txtAppoimentKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");} // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpdate1ActionPerformed

        Document doc = customerController.read(comboBoxCustomers.getSelectedItem().toString(),"identificationCard");
        Customer customer = new Customer(comboBoxCustomers.getSelectedItem().toString(),
            txtName.getText(),
            Integer.parseInt(txtNumber.getText()),
            false, txtAppoiment.getText(), txtAddress.getText());
        customerController.update(doc, customerController.buildDocument(customer));
        Document result = customerController.read(customerController.buildDocument(customer));
        if (result!=null) {

            JOptionPane.showMessageDialog(null, "Actualizado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Hubo un problema, intente de nuevo");
        }
    }//GEN-LAST:event_txtUpdate1ActionPerformed

    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed
        FrmHardwareStoreMenu1 frmHardwareStoreMenu = new FrmHardwareStoreMenu1();
        frmHardwareStoreMenu.setVisible(true);
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
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Appoiment;
    private javax.swing.JButton btnBackMenu;
    private javax.swing.JButton btnFind;
    private javax.swing.JComboBox<String> cmbPayment;
    private javax.swing.JComboBox<String> comboBoxCustomers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAppoiment;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JButton txtUpdate1;
    // End of variables declaration//GEN-END:variables
}
