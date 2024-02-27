/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafoa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class IguardarInfo extends javax.swing.JFrame {

    /**
     * Creates new form IguardarInfo
     */
    public IguardarInfo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        fieldname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        rute = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INSTRUCCIONES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 17, -1, -1));

        jLabel2.setText("Ingresar el nombre de la carpeta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 45, -1, -1));

        jLabel3.setText("Ingresar el contenido en \"Contenido a agregar\"");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, -1, -1));

        jLabel4.setText("Presiona \"Guardar\" para guardar los cambios");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 107, -1, -1));

        jLabel5.setText("Nombre de la carpeta");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 147, -1, -1));

        jLabel6.setText("Contenido agregar");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 147, -1, -1));

        contenido.setColumns(20);
        contenido.setRows(5);
        jScrollPane1.setViewportView(contenido);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 169, 139, 106));
        getContentPane().add(fieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 110, 50));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 40));

        rute.setText("C:\\Users\\pedro\\Documents");
        rute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruteActionPerformed(evt);
            }
        });
        getContentPane().add(rute, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 9, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 17, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void CrearArchivo(String name, String ruta) {
//        String filename = JOptionPane.showInputDialog("Ingresa el nombre del archivo: ");
        File archivo;

        try {
            archivo = new File(ruta, name + ".txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "Se ha creado correctamente");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se ha podido crear el archivo");

        }
    }

    public static void escribirEntxt(String contenido, String ruta) {

        try {
            PrintWriter escritor = new PrintWriter(new FileWriter(ruta, true));
            escritor.println(contenido);
            escritor.close();
            JOptionPane.showMessageDialog(null, "Se ha escrito correctamente el mensaje");

        } catch (IOException e) {
            String mensaje = "Hubo un error: " + e.getMessage();
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!fieldname.getText().isEmpty() || !contenido.getText().isEmpty()) {
            CrearArchivo(fieldname.getText(), rute.getText());
            String contenidoCondirec = rute.getText() + "\\" + fieldname.getText() + ".txt";
            escribirEntxt(contenido.getText(), contenidoCondirec);
            this.setVisible(false);
            Inicio nueva = new Inicio();
            nueva.setVisible(true);
            nueva.setLocationRelativeTo(null);
        } else {
            JOptionPane.showMessageDialog(null, "No puede haber espacios en blanco");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ruteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruteActionPerformed

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
            java.util.logging.Logger.getLogger(IguardarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IguardarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IguardarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IguardarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IguardarInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea contenido;
    private javax.swing.JTextField fieldname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rute;
    // End of variables declaration//GEN-END:variables
}