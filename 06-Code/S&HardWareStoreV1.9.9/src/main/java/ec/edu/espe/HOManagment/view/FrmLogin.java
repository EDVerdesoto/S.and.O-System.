
package ec.edu.espe.HOManagment.view;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.HOManagment.controller.UserController;
import ec.edu.espe.HOManagment.controller.Connection;
import ec.edu.espe.HOManagment.model.Product;
import ec.edu.espe.HOManagment.model.User;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
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
public class FrmLogin extends javax.swing.JFrame {

    public class centerFrame extends javax.swing.JFrame {
        
        public centerFrame() {
            initComponents();
            
            this.setLocationRelativeTo(null);
        }
    }
    int xMouse, yMouse;
    private UserController userController;
    
    
    public FrmLogin() {
        
        
        Connection.connectionDataBase();
        
        initComponents();
        userController = new UserController();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        String path = System.getProperty("user.dir");
        
        this.setTitle("Login Window");
        setLocationRelativeTo(null);
        
    }
    
    public void showAlertProducts() {
        CodecRegistry codecRegistry = MongoClientSettings.getDefaultCodecRegistry();
        codecRegistry = fromRegistries(codecRegistry, fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoDatabase db = Connection.mongodb.withCodecRegistry(codecRegistry);
        MongoCollection<Product> collectionProducts = db.getCollection("products", Product.class);
        List<Product> products = collectionProducts.find().into(new ArrayList<>());

        for (Product product : products) {
            if (product.getStock() <= 5) {
                JOptionPane.showMessageDialog(null, "El stock de los productos " + product.getName() + " es " + product.getStock() + ". Por favor rellene.");
            }
        }
    }
    
    public void loginVerification() {
        User user;
        user = new User(textFieldUser.getText(), new String(passwordField.getPassword()));
        Document userDoc = userController.buildDocument(user);
        Document doc = userController.read(userDoc);
        
        if (doc != null) {
            FrmHardwareStoreMenu frmHardwareStoreMenu = new FrmHardwareStoreMenu();
            JOptionPane.showMessageDialog(null, "Bienvenido al sistema.");
            this.setVisible(false);
            frmHardwareStoreMenu.setVisible(true);
            showAlertProducts();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos, vuelva a intentar.");
            emptyFields();
        }
    }
    
    private void emptyFields() {
        
        textFieldUser.setText("");
        passwordField.setText("");
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitButton = new javax.swing.JPanel();
        lbBtnExit = new javax.swing.JLabel();
        txtInfo = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        txtUsername = new javax.swing.JLabel();
        textFieldUser = new javax.swing.JTextField();
        sptUsn = new javax.swing.JSeparator();
        txtPsd = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        sptPsd = new javax.swing.JSeparator();
        btnEnterLogin = new javax.swing.JButton();
        btnGuest = new javax.swing.JButton();
        btnLeaveLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAlignmentX(0.0F);
        jPanel3.setAlignmentY(0.0F);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 255, 255));

        lbBtnExit.setBackground(new java.awt.Color(105, 145, 172));
        lbBtnExit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbBtnExit.setText("X");
        lbBtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBtnExit.setEnabled(false);
        lbBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBtnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBtnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbBtnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitButtonLayout = new javax.swing.GroupLayout(exitButton);
        exitButton.setLayout(exitButtonLayout);
        exitButtonLayout.setHorizontalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBtnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitButtonLayout.setVerticalGroup(
            exitButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbBtnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtInfo.setBackground(new java.awt.Color(105, 145, 172));
        txtInfo.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        txtInfo.setText(" T06-Code Warriors- Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(txtInfo)
                .addGap(0, 240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelWelcome.setFont(new java.awt.Font("Freestyle Script", 0, 65)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(69, 91, 118));
        labelWelcome.setText("Bienvenido a S&O Ferretería");

        txtUsername.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(69, 91, 118));
        txtUsername.setText("Usuario");

        textFieldUser.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textFieldUser.setForeground(new java.awt.Color(204, 204, 204));
        textFieldUser.setBorder(null);
        textFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldUserMousePressed(evt);
            }
        });
        textFieldUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldUserActionPerformed(evt);
            }
        });
        textFieldUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldUserKeyTyped(evt);
            }
        });

        sptUsn.setBackground(new java.awt.Color(0, 0, 0));
        sptUsn.setForeground(new java.awt.Color(0, 0, 0));

        txtPsd.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        txtPsd.setForeground(new java.awt.Color(69, 91, 118));
        txtPsd.setText("Contraseña");

        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.setText("*********");
        passwordField.setActionCommand("<Not Set>");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordFieldKeyTyped(evt);
            }
        });

        sptPsd.setBackground(new java.awt.Color(0, 0, 0));
        sptPsd.setForeground(new java.awt.Color(0, 0, 0));

        btnEnterLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnEnterLogin.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        btnEnterLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnEnterLogin.setText("Entrar");
        btnEnterLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnterLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterLoginActionPerformed(evt);
            }
        });
        btnEnterLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnEnterLoginKeyReleased(evt);
            }
        });

        btnGuest.setBackground(new java.awt.Color(51, 51, 51));
        btnGuest.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        btnGuest.setForeground(new java.awt.Color(242, 242, 242));
        btnGuest.setText("Invitado");
        btnGuest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestActionPerformed(evt);
            }
        });

        btnLeaveLogin1.setBackground(new java.awt.Color(51, 51, 51));
        btnLeaveLogin1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        btnLeaveLogin1.setForeground(new java.awt.Color(242, 242, 242));
        btnLeaveLogin1.setText("Salir");
        btnLeaveLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLeaveLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEnterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLeaveLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPsd)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sptPsd, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sptUsn, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername)
                                    .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtUsername)
                .addGap(12, 12, 12)
                .addComponent(textFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sptUsn, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPsd)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(sptPsd, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnterLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuest, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeaveLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbBtnExitMouseClicked

    private void lbBtnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnExitMouseEntered
        exitButton.setBackground(Color.red);
        lbBtnExit.setForeground(Color.white);
    }//GEN-LAST:event_lbBtnExitMouseEntered

    private void lbBtnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBtnExitMouseExited
        exitButton.setBackground(Color.white);
        lbBtnExit.setForeground(Color.black);
    }//GEN-LAST:event_lbBtnExitMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void textFieldUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldUserMousePressed
        if (textFieldUser.getText().equals("Use your username")) {
            textFieldUser.setText("");
            textFieldUser.setForeground(Color.black);
        }
        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("*********");
            passwordField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_textFieldUserMousePressed

    private void textFieldUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldUserActionPerformed
        if (textFieldUser.getText().equals("Usuario")) {
            textFieldUser.setText("");
            textFieldUser.setForeground(Color.black);
        }
        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("*********");
            passwordField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_textFieldUserActionPerformed

    private void textFieldUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUserKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean validCharacters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key == 32) || (key >= 48 && key <= 57);
        if (!validCharacters) {
            evt.consume();
        }
    }//GEN-LAST:event_textFieldUserKeyTyped

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        if (String.valueOf(passwordField.getPassword()).equals("*********")) {
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }
        if (textFieldUser.getText().isEmpty()) {
            textFieldUser.setText("Use your username");
            textFieldUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordFieldMousePressed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        if (String.valueOf(passwordField.getPassword()).equals("*********")) {
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }
        if (textFieldUser.getText().isEmpty()) {
            textFieldUser.setText("Use your username");
            textFieldUser.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean validCharacters = (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || (key == 32) || (key >= 48 && key <= 57);
        if (!validCharacters) {
            evt.consume();
        }
    }//GEN-LAST:event_passwordFieldKeyTyped

    private void btnEnterLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterLoginActionPerformed
        loginVerification();
    }//GEN-LAST:event_btnEnterLoginActionPerformed

    private void btnLeaveLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveLogin1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLeaveLogin1ActionPerformed

    private void textFieldUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUserKeyReleased

    }//GEN-LAST:event_textFieldUserKeyReleased

    private void btnEnterLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEnterLoginKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnterLoginKeyReleased

    private void btnGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuestActionPerformed
        FrmHardwareStoreMenu frmHardwareStoreMenu = new FrmHardwareStoreMenu();
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema.");
        this.setVisible(false);
        frmHardwareStoreMenu.setVisible(true);
        showAlertProducts();
    }//GEN-LAST:event_btnGuestActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnterLogin;
    private javax.swing.JButton btnGuest;
    private javax.swing.JButton btnLeaveLogin1;
    private javax.swing.JPanel exitButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelWelcome;
    private javax.swing.JLabel lbBtnExit;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JSeparator sptPsd;
    private javax.swing.JSeparator sptUsn;
    private javax.swing.JTextField textFieldUser;
    private javax.swing.JLabel txtInfo;
    private javax.swing.JLabel txtPsd;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables
}
