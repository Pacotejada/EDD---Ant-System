/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafoa;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author KelvinCi
 */
public class GrafoA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setProperty("org.graphstream.ui", "swing");
        Inicio u=new Inicio();
        u.setVisible(true);

        /*Graph n = new SingleGraph("nuevo grafo");
        n.addNode("A").setAttribute("ui.label", "A");
        n.addNode("B").setAttribute("ui.label", "B");
        n.addNode("C").setAttribute("ui.label", "C");
        n.addNode("D").setAttribute("ui.label", "D");
        n.addNode("E").setAttribute("ui.label", "E");
        n.addNode("F").setAttribute("ui.label", "F");
        
        n.addNode("Z").setAttribute("ui.label", "Z");
        //Aristas
        n.addEdge("AB", "A", "B");
        n.addEdge("AD", "A", "D");
        n.addEdge("AE", "A", "E");       
        n.addEdge("BC", "B", "C");
        n.addEdge("EB", "E", "B");
        n.addEdge("BF","B","F");
        n.addEdge("FE", "F", "C");
        n.addEdge("DZ", "D", "Z");
        n.addEdge("ZC", "Z", "C");

       
        

        n.display();*/
    }

}
