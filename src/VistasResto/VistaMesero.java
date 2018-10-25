package VistasResto;

import atenciondelresto.Conexion;
import atenciondelresto.Mesero;
import atenciondelresto.MeseroData;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class VistaMesero extends javax.swing.JInternalFrame {
    //declaro Variables de mi clase
    private int id;
    private MeseroData meseroData;
    private Conexion conexion;
    /**
     * Creates new form VistaMesero
     */
    public VistaMesero() {
        initComponents();
        try {
            //Creo una conexion y le paso la ruta de mi base de datos
            conexion = new Conexion("jdbc:mysql://localhost/resto", "root", "");
            //Instancio la clase mesroData y le paso la conexion
            meseroData = new MeseroData(conexion);
       
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaMesero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VistaMesero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setForeground(new java.awt.Color(0, 153, 153));
        setTitle("REGISTRO DE MESERO");

        btnGuardar.setText("Guardar");
        btnGuardar.setMaximumSize(new java.awt.Dimension(79, 23));
        btnGuardar.setMinimumSize(new java.awt.Dimension(79, 23));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setMaximumSize(new java.awt.Dimension(79, 23));
        btnBuscar.setMinimumSize(new java.awt.Dimension(79, 23));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setMaximumSize(new java.awt.Dimension(79, 23));
        btnEliminar.setMinimumSize(new java.awt.Dimension(79, 23));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nombre y Apellido");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //**********Metodo Boton Eliminar************
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombre=txtNombre.getText();
        if (!(nombre.equalsIgnoreCase(""))){
            int confirma = JOptionPane.showConfirmDialog(rootPane, "Confirma  Eliminar");
            if (confirma==0){
                meseroData.borrarMesero(nombre);
                JOptionPane.showMessageDialog(null, "Se Borro el Mesero : "+nombre);
                txtNombre.setText("");
                txtDni.setText("");
            }
        }else{JOptionPane.showMessageDialog(null, "Primero debe Buscar el Mesero a Eliminar");}
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    //******** Metodo del Boton Guardar***********
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //creo una variable de tipo string y una de tipo int y en ellas
        //guardo lo que me devuelve los campos de texto, previa conversión del campo txtDni a entero.
        String nombre=txtNombre.getText();
        int dni=Integer.parseInt(txtDni.getText());        
        //creo una instancia nueva de mesero y se lo paso al método guardar mesero de meseroData.
        Mesero mesero=new Mesero(nombre, dni);
        meseroData.guardarMesero(mesero);
        //creo una ventana emergente que me informa que se  Guardo Correctamente el Mesero
        JOptionPane.showMessageDialog(null, "Se Guardo Correctamente el Mesero : "+nombre);
        //limpio los campos de texto.
        txtNombre.setText("");
        txtDni.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    //*********Metodo del Boton Buscar**************
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre=JOptionPane.showInputDialog("Ingrese Nombre y Apellido a Buscar");
        Mesero mesero=meseroData.buscarMesero(nombre);
        if(mesero!=null){
                txtNombre.setText(mesero.getNombre());
                txtDni.setText(mesero.getDni()+"");
                id=mesero.getId_mesero();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    //*******Metodo del Boton Actualizar************
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
      //actualiza datos del mesero
        String nombre=txtNombre.getText();
        int dni=Integer.parseInt(txtDni.getText());
        if (!(nombre.equalsIgnoreCase(""))){
            Mesero mesero=new Mesero(id,nombre, dni);
            int confirma = JOptionPane.showConfirmDialog(rootPane, "Desea Actualizar?");
            if (confirma==0){
                meseroData.actualizarMesero(mesero);
                JOptionPane.showMessageDialog(null, "Se Actualizo el Mesero : "+mesero.getNombre());
                txtNombre.setText("");
                txtDni.setText("");
            }
        }else{JOptionPane.showMessageDialog(null, "Primero debe Buscar el Mesero a Actualizar");}
    }//GEN-LAST:event_btnActualizarActionPerformed
    //*******Metodo del Boton Salir***************
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try {
            //desbloque los botones, entrar y registrar, de la vista principal
            VistaPrincipal.btnEntrar.setEnabled(true);
            VistaPrincipal.btnRegistrar.setEnabled(true);
            this.setClosed(true);//cierra la ventana, vista mesero.
        } catch (PropertyVetoException ex) {
            Logger.getLogger(VistaMesero.class.getName()).log(Level.SEVERE, null, " error al cerrar ventana"+ex);
        }
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
