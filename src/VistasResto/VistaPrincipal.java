package VistasResto;

import atenciondelresto.Conexion;
import atenciondelresto.Mesero;
import atenciondelresto.MeseroData;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Exabyte
 */
public class VistaPrincipal extends javax.swing.JFrame {
    Toolkit miPantalla=Toolkit.getDefaultToolkit();
    Dimension tamaño=miPantalla.getScreenSize();
    MeseroData meseroData;
    Conexion conexion;
    /**
     * Creates new form Prueba
     */
    public VistaPrincipal() {
        initComponents();
        try {
            //Creo una nueva conexion, y le paso la ruta de mi base de datos.
            conexion = new Conexion("jdbc:mysql://localhost/resto", "root", "");
            //Creo una instancia de mesero data y la paso la conexion.
            meseroData = new MeseroData(conexion);
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaMesero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VistaMesero.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setLocation(tamaño.width/3,tamaño.height/4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio2 = new javax.swing.JDesktopPane();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio2.setBackground(new java.awt.Color(0, 102, 102));

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Apellido y Nombre");

        jLabel2.setText("Ingrese DNI");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        escritorio2.setLayer(btnEntrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(txtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(txtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(btnRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorio2Layout = new javax.swing.GroupLayout(escritorio2);
        escritorio2.setLayout(escritorio2Layout);
        escritorio2Layout.setHorizontalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel1))
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2))
                            .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellido)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        escritorio2Layout.setVerticalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        //Creo una instancia de vistaMesero, la hago visible y la agrego al escritorio.
        VistaMesero vm = new VistaMesero();
        vm.setVisible(true);
        escritorio2.add(vm);
        vm.toFront();
        //seguido de eso, bloqueo los botones, registrar y entrar.
        btnRegistrar.setEnabled(false);
        btnEntrar.setEnabled(false);

    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                            
    //********Metodo del Boton Entrar******************
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //En este metodo comprobamos si el mesero se encuentra en la base 
        //de datos de lo contrario le pedimos que se registre.
        int i = 0;
        String dnis;
        String nombre=txtApellido.getText();
        System.out.println("hasta aca");
        List<Mesero> meseros=meseroData.obtenerMesero();
        System.out.println("aca ...");
        for(Mesero m:meseros){
            dnis=m.getDni()+"";
            if(m.getNombre().equalsIgnoreCase(nombre)&&dnis.equalsIgnoreCase(txtDni.getText()) ){
                System.out.println("o aca...");
                JOptionPane.showMessageDialog(null, nombre);
                VistaMenu vm=new VistaMenu();
                vm.setVisible(true);
                //hace que la ventana se cierre.
                this.dispose();
                i=1;
            }
        }
        if (i==0){
            JOptionPane.showMessageDialog(null, "Debe Registrarse Para Ingresar Al Sistema");
            txtApellido.setText("");
            txtDni.setText("");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnEntrar;
    public static javax.swing.JButton btnRegistrar;
    private javax.swing.JDesktopPane escritorio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
