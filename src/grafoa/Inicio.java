/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafoa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

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
        add = new javax.swing.JButton();
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

        add.setText("Agregar ciudad");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        eliminar.setText("Eliminar ciudad");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        guardar.setText("Crear archivo");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 120, -1));

        cargar.setText("Cargar grafo");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });
        jPanel1.add(cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, 60));

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        txtinfo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtinfoCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txtinfo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 160, 230));

        buscarchivo.setText("Buscar Archivo");
        buscarchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarchivoActionPerformed(evt);
            }
        });
        jPanel1.add(buscarchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel1.setText("txtinfo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        IAgregar nAgregar = new IAgregar();
        nAgregar.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

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
        if (txtinfo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede dejar espacios en blanco\n lee un archivo con informacion");
        } else {
            Graph nuevoGrafo = new SingleGraph("El gran Grafo");
            /*int hormiga=10; implementacion de hormigas con puntos rojos
            for(int i=0;i<hormiga;i++){
                Node hormigas=nuevoGrafo.addNode("Hormiga"+i);
                hormigas.setAttribute("ui.style", "shape:circle;fill-color:red;size:5;");
            }*/
            JFrame frame = new JFrame("Cuadro de carga");
            JTextField textField = new JTextField("Presiona enter para ver el grafo");

            // Agregar el JTextField al JFrame
            frame.getContentPane().add(textField);

            // Agregar un ActionListener al JTextField
            textField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Obtener el texto del JTextField
                    String contenido = txtinfo.getText();

                    // Dividir el contenido en líneas
                    String[] lineas = contenido.split("\n");

                    // Variables para almacenar nodos y aristas
                    StringBuilder nodos = new StringBuilder();
                    StringBuilder aristas = new StringBuilder();

                    // Bandera para determinar si estamos leyendo nodos o aristas
                    boolean leyendoNodos = true;

                    // Procesar cada línea
                    for (String linea : lineas) {
                        if (linea.equals("aristas")) {

                            leyendoNodos = false;
                            continue;
                        }
                        if (linea.equals("ciudad")) {
                            continue;
                        }

                        if (leyendoNodos) {
                            //Aqui esta agregando el nodo al grafico

                            Node nuevo = nuevoGrafo.addNode(linea);

                            nuevo.setAttribute("ui.label", linea);
                            nuevo.setAttribute("ui.label", linea);
                            nuevo.setAttribute("ui.style", "text-size: 30; size-mode: fit; text-alignment: center; text-color: red; text-background-mode: rounded-box; text-padding: 20; fill-color: rgb(100,255,0);stroke-color: rgb(0,100,255); stroke-width: 20;");

                            //nuevo.setAttribute("ui.style", "text-size:100;");
                            //nuevo.setAttribute("ui.style", "text-size:100; fill-color: rgb(0,100,255);");
                            // Si estamos leyendo nodos, añadir la linea al StringBuilder de nodos                       
                            nodos.append(linea).append("\n");
                        } else {
                            //Aqui se busca de agregar las aristas(conexiones de los nodos)
                            String[] partes = linea.split(",");
                            String nodoOrigen = partes[0];
                            System.out.println("Esto es el nodo origen" + nodoOrigen);
                            String nodoDestino = partes[1];
                            System.out.println("Esto es el nodo Destino:" + nodoDestino);
                            double peso = Double.parseDouble(partes[2]);
                            System.out.println("Esto es el peso:" + peso);

                            Edge nuevaArista = nuevoGrafo.addEdge(nodoOrigen + nodoDestino, nodoOrigen, nodoDestino);
                            nuevaArista.setAttribute("ui.label", peso);
                            nuevaArista.setAttribute("ui.style", "text-size:25;");

                            // Si estamos leyendo aristas, añadir la línea al StringBuilder de aristas
                            aristas.append(linea).append("\n");
                        }
                    }
                    //for(Node ant:nuevoGrafo){

                    //}
                    // Imprimir nodos y aristas por separado
                    System.out.println("Nodos:");
                    System.out.println(nodos.toString());
                    System.out.println("Aristas:");
                    System.out.println(aristas.toString());
                    nuevoGrafo.display();
                }
            });

            // Configuraciones del JFrame
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.setVisible(true);
        }


    }//GEN-LAST:event_cargarActionPerformed

    private void buscarchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarchivoActionPerformed
        // TODO add your handling code here:

        JFileChooser fc = new JFileChooser();//Abre el cuadro de dialogo para que el usuario seleccione los archivos 
        fc.showOpenDialog(null);//Aqui se abre la ventana y se marca null para especificar que no tenga nada seleccionado
        File archivo = fc.getSelectedFile();//Almacena el archivo elegido por el usuario 
        if (archivo != null) {
            //Se pasa a usar try-catch porque puede que marque algun error 
            try {
                FileReader elquelee = new FileReader(archivo);//El encargado de leer los archivos
                BufferedReader memoryspace = new BufferedReader(elquelee);//El bufferedReader se encarga de hacer un espacio de memoria
                //para que la informacion que lea la tenga en la memoria y luego la presente donde se quiere mostrar
                String texto = "";
                String linea = "";
                while (((linea = memoryspace.readLine()) != null)) {

                    /*if (linea.equals("aristas")) {//este metodo es para que imprima todo hasta que diga arista

                    break;
                }*/
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
        }


    }//GEN-LAST:event_buscarchivoActionPerformed
    /*
    public static void CrearArchivo(String ruta) {
        String filename = JOptionPane.showInputDialog("Ingresa el nombre del archivo: ");
        File archivo;

        try {
            archivo = new File(ruta, filename + ".txt");
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
    }*/
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        IguardarInfo nueva = new IguardarInfo();
        nueva.setVisible(true);
        nueva.setLocationRelativeTo(null);
        /*String direccioncompleta =ruta.getText();
        
        String nuevotexto = txtinfo.getText();
        CrearArchivo(direccioncompleta);
        escribirEntxt(nuevotexto, direccioncompleta);*/

    }//GEN-LAST:event_guardarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton buscarchivo;
    private javax.swing.JButton cargar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtinfo;
    // End of variables declaration//GEN-END:variables
}
