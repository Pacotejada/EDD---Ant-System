/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafoa;

import javax.swing.JOptionPane;

/**
 *
 * @author KelvinCi
 */
public class IAgregar extends javax.swing.JFrame {

    /**
     * Creates new form IAgregar
     */
    public IAgregar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        crearciudadtext = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        conexionestext = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bienvenido a la seccion de agregar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));
        jPanel1.add(crearciudadtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 71, -1));

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 30));

        jLabel2.setText("Ciudad a crear");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jLabel3.setText("Identificar de la siguiente manera:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 20));

        conexionestext.setColumns(20);
        conexionestext.setRows(5);
        conexionestext.setText("Ej:\nc  d \n4,3\n6,5");
        jScrollPane1.setViewportView(conexionestext);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setText("Conexiones a conectar (en numeros), distancia (en numeros) ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 320, 30));

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        if (!crearciudadtext.getText().isEmpty()) {
            String textcity = crearciudadtext.getText();
            Nodo newcity = new Nodo(textcity);
            
            System.out.println(newcity.getCuerpo());// demostracion de que si imprime el valor agregado
            
            if (!conexionestext.getText().isEmpty()) {
                String completetext = conexionestext.getText();
                String[] lineas = completetext.split("\n");
                String valoruno = "";
                String valordos = "";

                for (String linea : lineas) {//de esta forma se recorre linea por linea o dato por dato
                    String[] valores = linea.split(",");
                    //valoruno = Integer.parseInt(valores[0]);
                    //valordos = Integer.parseInt(valores[1]);
                    valoruno=valores[0];
                    valordos=valores[1];
                    

                }
                /*Lista nuevalista=Inicio.ciudades;//se crea la lista usando el parametro del archivo inicio
                
                nuevalista.AggNodo(valoruno);//agrego valores a las listas 
                nuevalista.AggNodo(valordos);
                String[] nueva=valordos.split("\n");
                for(int i=0;i<nueva.length;i++){
                    String[] nuevaInterna = nueva[i].split(",");
                    double distance;
                    nuevalista.AggArco(ciudad,nuevaInterna[i][0],distance);
                }
                
                // se recorre la lista para obtener cada valor
                System.out.println(valoruno);
                System.out.println(valordos);
                //String invaluelist=String.valueOf(conexionestext.getText());
                //newcity.setListainterna(listainterna);
                
                
                
                this.setVisible(false);
                Inicio nueva = new Inicio();
                nueva.setVisible(true);*/
            }
            else{
                JOptionPane.showMessageDialog(null, "No puede haber campos vacios");

            }
              
        } 
        else {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios");
        }


    }//GEN-LAST:event_aceptarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Inicio nueva = new Inicio();
        nueva.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextArea conexionestext;
    private javax.swing.JTextField crearciudadtext;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
