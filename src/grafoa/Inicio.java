/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafoa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author KelvinCi
 */
public class Inicio extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    public Inicio() {
        initComponents();
    }

    public String AbrirArchivo(File archivo) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caract = (char) ascci;
                documento += caract;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error de: " + e);

        }
        return documento;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        buscarchivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Agregar ciudad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        eliminar.setText("Eliminar ciudad");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, -1, -1));

        guardar.setText("Guardar grafo");
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        cargar.setText("Cargar grafo");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, -1, -1));

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        txtinfo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtinfoCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtinfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 160, 140));

        buscarchivo.setText("Buscar Archivo");
        buscarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarchivoActionPerformed(evt);
            }
        });
        jPanel1.add(buscarchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel1.setText("txtinfo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        IAgregar nAgregar = new IAgregar();
        nAgregar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        IEliminar neEliminar = new IEliminar();
        neEliminar.setVisible(true);
    }//GEN-LAST:event_eliminarActionPerformed

    private void txtinfoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtinfoCaretUpdate
        // TODO add your handling code here:

        //nueTemporal.setTexto(aTexto);
    }//GEN-LAST:event_txtinfoCaretUpdate
    
    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        // TODO add your handling code here:
        
        if(txtinfo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"No se puede dejar espacios en blanco\n lee un archivo con informacion");
        }
    }//GEN-LAST:event_cargarActionPerformed

    private void buscarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarchivoActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();//Abre el cuadro de dialogo para que el usuario seleccione los archivos 
        fc.showOpenDialog(null);//Aqui se abre la ventana y se marca null para especificar que no tenga nada seleccionado
        File archivo = fc.getSelectedFile();//Almacena el archivo elegido por el usuario 
        //Se pasa a usar try-catch porque puede que marque algun error 
        try {
            FileReader elquelee = new FileReader(archivo);//El encargado de leer los archivos
            BufferedReader memoryspace = new BufferedReader(elquelee);//El bufferedReader se encarga de hacer un espacio de memoria
            //para que la informacion que lea la tenga en la memoria y luego la presente donde se quiere mostrar
            String texto = "";
            String linea = "";
            while (((linea = memoryspace.readLine()) != null)) {
                if (linea.equals("aristas")){
                    break;
                }
                texto += linea + "\n";

            }
            if (texto.isEmpty()) {
                System.out.println(texto);
                txtinfo.setText(texto);
            } else {
                System.out.println(texto);
                txtinfo.setText(texto);
                JOptionPane.showMessageDialog(null, "Archivo leído con éxito");
            }

        } catch (IOException e) {
            String mensaje = "Se obtuvo un error: " + e.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }

    }//GEN-LAST:event_buscarchivoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarchivo;
    private javax.swing.JButton cargar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtinfo;
    // End of variables declaration//GEN-END:variables
}
