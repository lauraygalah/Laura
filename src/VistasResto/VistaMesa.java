
package VistasResto;

import atenciondelresto.Conexion;
import atenciondelresto.Mesa;
import atenciondelresto.MesaData;
import atenciondelresto.MeseroData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lorei
 */
public class VistaMesa extends javax.swing.JInternalFrame {
    private int id;
    private MesaData mesaData;
    private Conexion conexion;
    /**
     * Creates new form VistaMesa
     */
    public VistaMesa() {
        initComponents();
           
       try {
            conexion = new Conexion("jdbc:mysql://localhost/resto", "root", "");
            mesaData = new MesaData(conexion);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaMesa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(VistaMesa.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNroMesa = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        jrOcupada = new javax.swing.JRadioButton();
        jrDesocupada = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Mesa");

        jLabel1.setText("Nro Mesa");

        jLabel2.setText("Capacidad");

        txtNroMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroMesaActionPerformed(evt);
            }
        });

        txtCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadActionPerformed(evt);
            }
        });

        jrOcupada.setText("Ocupada");
        jrOcupada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOcupadaActionPerformed(evt);
            }
        });

        jrDesocupada.setText("Desocupada");
        jrDesocupada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDesocupadaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        jLabel3.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCapacidad))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jrDesocupada))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrOcupada)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnConsulta)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrDesocupada)
                    .addComponent(jrOcupada)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar)
                    .addComponent(btnConsulta))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroMesaActionPerformed

    private void jrDesocupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDesocupadaActionPerformed
        
        jrOcupada.setSelected(false);
    }//GEN-LAST:event_jrDesocupadaActionPerformed
    
    // ******** BOTON GUARDAR *********
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       boolean estado=false;
       int capacidad=Integer.parseInt(txtCapacidad.getText());
       int nroMesa=Integer.parseInt(txtNroMesa.getText());
       if (jrOcupada.isSelected()){
           estado=true;
       }
       if (jrDesocupada.isSelected()){
           estado=false;
       }    
       
       Mesa mesa=new Mesa(nroMesa, capacidad,estado);
       mesaData.guardarMesa(mesa);
       JOptionPane.showMessageDialog(null, "Se Guardo Correctamente la mesa!!!");
       txtNroMesa.setText("");
       txtCapacidad.setText("");
       jrOcupada.setSelected(false);
       jrDesocupada.setSelected(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jrOcupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOcupadaActionPerformed
        jrDesocupada.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jrOcupadaActionPerformed

    private void txtCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCapacidadActionPerformed

    // ******** BOTON BORRAR *********
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       if(!txtNroMesa.getText().equals("")){
            int confirma = JOptionPane.showConfirmDialog(rootPane, "Seguro que desea Borrar la mesa?");
            if (confirma==0){
                int numero=Integer.parseInt(txtNroMesa.getText());
                mesaData.borrarMesa(numero);
                JOptionPane.showMessageDialog(null, "Se Borro la mesa Nro: "+numero);
                txtNroMesa.setText("");
                txtCapacidad.setText("");
                jrOcupada.setSelected(false);
                jrDesocupada.setSelected(false);
            }
       }else{JOptionPane.showMessageDialog(null, "Debe buscar una mesa para borrarla");}
       
    }//GEN-LAST:event_btnBorrarActionPerformed

    //******** BOTON CONSULTAR ******
    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        int numero=Integer.parseInt(JOptionPane.showInputDialog("INGRESE NRO DE MESA"));
        Mesa mesa=mesaData.buscarMesa(numero);
        txtNroMesa.setText(mesa.getNro_mesa()+"");
        txtCapacidad.setText(mesa.getCapacidad()+"");
        id=mesa.getId_mesa();
        if (mesa.getEstado()){
            jrOcupada.setSelected(true);
            jrDesocupada.setSelected(false);
        }else{jrDesocupada.setSelected(true);jrOcupada.setSelected(false);}
    }//GEN-LAST:event_btnConsultaActionPerformed

    //******* BOTON MODIFICAR ******
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if(!txtNroMesa.getText().equals("")){
            boolean estado=false;
            int capacidad=Integer.parseInt(txtCapacidad.getText());
            int nroMesa=Integer.parseInt(txtNroMesa.getText());
            if (jrOcupada.isSelected()){
                estado=true;
            }
            if (jrDesocupada.isSelected()){
                estado=false;
            }
            Mesa mesa=new Mesa(id, nroMesa, capacidad, estado);
            mesaData.actualizarMesa(mesa);
            JOptionPane.showMessageDialog(null, "La mesa se actualizo!!!");
            txtNroMesa.setText("");
            txtCapacidad.setText("");
            jrOcupada.setSelected(false);
            jrDesocupada.setSelected(false);
        }else{JOptionPane.showMessageDialog(null, "Debe buscar una mesa para Modificar");}
    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JRadioButton jrDesocupada;
    private javax.swing.JRadioButton jrOcupada;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtNroMesa;
    // End of variables declaration//GEN-END:variables
}
