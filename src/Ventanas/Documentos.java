/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Metodos.Correo;
import Metodos.Destino;
import Metodos.Guadar;
import Metodos.Pago;
import Metodos.Paquete;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Documentos extends javax.swing.JFrame {
           String gmail = "";
           String name = "";
    /**
     * Creates new form Documentos
     */
    public Documentos() {
        initComponents();
        this.setLocationRelativeTo(null);
        Productos producto = new Productos();
        gmail = producto.correo;
        sesion Sesion = new sesion();
        name = Sesion.nombre;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelDocumentos = new javax.swing.JLabel();
        jLabelTamaño = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabelDestino = new javax.swing.JLabel();
        jLabelPais = new javax.swing.JLabel();
        jTextFieldPais = new javax.swing.JTextField();
        jLabelCiudad = new javax.swing.JLabel();
        jTextFieldCiudad = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jButtonEnviar = new javax.swing.JButton();
        jComboBoxTamaño = new javax.swing.JComboBox();
        jButtonTotalPagar = new javax.swing.JButton();
        jLabelTotalPagar = new javax.swing.JLabel();
        jLabelKg = new javax.swing.JLabel();
        jLabelFoando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDocumentos.setBackground(new java.awt.Color(155, 250, 155));
        jLabelDocumentos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabelDocumentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDocumentos.setText("DOCUMENTOS");
        getContentPane().add(jLabelDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, 30));

        jLabelTamaño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTamaño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTamaño.setText("Tamaño");
        getContentPane().add(jLabelTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 90, 20));

        jLabelCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCantidad.setText("Cantidad");
        getContentPane().add(jLabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 20));

        jTextFieldCantidad.setBackground(new java.awt.Color(153, 250, 153));
        jTextFieldCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCantidadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 210, 20));

        jLabelPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPeso.setText("Peso");
        getContentPane().add(jLabelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 20));

        jTextFieldPeso.setBackground(new java.awt.Color(153, 250, 153));
        jTextFieldPeso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPesoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 210, -1));

        jLabelDestino.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabelDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDestino.setText("DESTINO");
        getContentPane().add(jLabelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 140, 30));

        jLabelPais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPais.setText("Pais");
        getContentPane().add(jLabelPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 80, 20));

        jTextFieldPais.setBackground(new java.awt.Color(153, 250, 153));
        jTextFieldPais.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldPais.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextFieldPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPaisKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 200, -1));

        jLabelCiudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCiudad.setText("Ciudad");
        getContentPane().add(jLabelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, 20));

        jTextFieldCiudad.setBackground(new java.awt.Color(153, 250, 153));
        jTextFieldCiudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCiudadActionPerformed(evt);
            }
        });
        jTextFieldCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiudadKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, -1));

        jLabelDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDireccion.setText("Direccion");
        getContentPane().add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 70, 20));

        jTextFieldDireccion.setBackground(new java.awt.Color(153, 250, 153));
        jTextFieldDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldDireccion.setToolTipText("");
        getContentPane().add(jTextFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 200, -1));

        jButtonEnviar.setBackground(new java.awt.Color(153, 250, 153));
        jButtonEnviar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 90, 30));

        jComboBoxTamaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-Seleccionar-", "Grande", "Pequeño" }));
        getContentPane().add(jComboBoxTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 140, 30));

        jButtonTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonTotalPagar.setText("Aceptar");
        jButtonTotalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalPagarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 90, 30));

        jLabelTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 160, 30));

        jLabelKg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelKg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelKg.setText("Kg");
        getContentPane().add(jLabelKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, 20));

        jLabelFoando.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabelFoando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/documentos.jpg"))); // NOI18N
        getContentPane().add(jLabelFoando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Guadar guardar = new Guadar();
    Paquete obj1 = new Paquete();
    Destino destino = new Destino();
    Pago pago1 = new Pago();
    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:
        
        
        obj1.setCantidad(this.jTextFieldCantidad.getText());
        obj1.setPeso(this.jTextFieldPeso.getText());
        obj1.setTamaño(this.jComboBoxTamaño.getSelectedItem().toString());
        
       
        destino.setPais(this.jTextFieldPais.getText());
        destino.setCiudad(this.jTextFieldCiudad.getText());
        destino.setDireccion(this.jTextFieldDireccion.getText());
        
        if(this.jComboBoxTamaño.getSelectedItem().equals("-Seleccionar-")|| this.jTextFieldPeso.getText().isEmpty() || this.jTextFieldCantidad.getText().isEmpty() || this.jTextFieldPais.getText().isEmpty() ||this.jTextFieldCiudad.getText().isEmpty()||this.jTextFieldDireccion.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos");
        }else{
        guardar.guardarDatosPaquete(obj1.getTamaño(),obj1.getCantidad(), obj1.getPeso());
        guardar.guardarDestino(destino.getPais(),destino.getCiudad(), destino.getDireccion());
        
        Correo correo = new Correo();
        correo.Correo(gmail,mensaje());
        JOptionPane.showMessageDialog(null,"Datos guardado con exito");
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jTextFieldPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesoKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter)){
          evt.consume();
        }  
    }//GEN-LAST:event_jTextFieldPesoKeyTyped

    private void jButtonTotalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalPagarActionPerformed
        // TODO add your handling code here:
        if(this.jComboBoxTamaño.getSelectedItem().equals("-Seleccionar-")|| this.jTextFieldPeso.getText().isEmpty() || this.jTextFieldCantidad.getText().isEmpty() || this.jTextFieldPais.getText().isEmpty()||this.jTextFieldCiudad.getText().isEmpty()|this.jTextFieldDireccion.getText().isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos");
        }else{
        this.jLabelTotalPagar.setText(pago1.Pago(this.jTextFieldCantidad.getText(), this.jTextFieldPeso.getText()));
        this.jLabelTotalPagar.setVisible(true);
        }
    }//GEN-LAST:event_jButtonTotalPagarActionPerformed

    private void jTextFieldCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCantidadKeyTyped
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if(!Character.isDigit(caracter)){
          evt.consume();
        }  
    }//GEN-LAST:event_jTextFieldCantidadKeyTyped

    private void jTextFieldPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPaisKeyTyped
        // TODO add your handling code here:
        int caracter = evt.getKeyChar();
        if(Character.isDigit(caracter)){
          evt.consume();
        }  
    }//GEN-LAST:event_jTextFieldPaisKeyTyped

    private void jTextFieldCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCiudadActionPerformed

    private void jTextFieldCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiudadKeyTyped
        // TODO add your handling code here:
        int caracter = evt.getKeyChar();
        if(Character.isDigit(caracter)){
          evt.consume();
        }  
    }//GEN-LAST:event_jTextFieldCiudadKeyTyped

    public String mensaje(){
        return "Señor(a) "+name +" usted ha realizado un envio de Documentos la cual su Destino es "+destino.getPais()
                +" la ciudad es " +destino.getCiudad() +" y su direccion es " +destino.getDireccion() +" " +this.jLabelTotalPagar.getText();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Documentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Documentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonTotalPagar;
    private javax.swing.JComboBox jComboBoxTamaño;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCiudad;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDocumentos;
    private javax.swing.JLabel jLabelFoando;
    private javax.swing.JLabel jLabelKg;
    private javax.swing.JLabel jLabelPais;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelTamaño;
    private javax.swing.JLabel jLabelTotalPagar;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldPeso;
    // End of variables declaration//GEN-END:variables
}
