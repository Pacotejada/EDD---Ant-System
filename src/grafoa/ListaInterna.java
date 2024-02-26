/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafoa;

/**
 *
 * @author pedro
 */
public class ListaInterna {

    private Arco Cabeza;
    private Arco ultimo;
    private int size;

    public ListaInterna() {
        this.Cabeza = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Arco getCabeza() {
        return Cabeza;
    }

    public void setCabeza(Arco Cabeza) {
        this.Cabeza = Cabeza;
    }

    public Arco getUltimo() {
        return ultimo;
    }

    public boolean isEmpty() {
        return getCabeza() == null;
    }

    public void setUltimo(Arco ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    /// agregar arcos
    public void AggArco (String destino, double longitud){
        Arco nuevoArco = new Arco (destino, longitud);
        if (isEmpty()){
            this.ultimo =nuevoArco;
            this.Cabeza = nuevoArco;
        }else{
            this.ultimo.setPointer(nuevoArco);
            this.ultimo = nuevoArco;
        }
        size ++;
    }
    
    /// recorrido de los arquitos
    public void recorridoInterno(){
        Arco Aux = Cabeza;
        
        while (Aux != null){
            System.out.println(Aux.getDestino());
            Aux = Aux.getPointer();
        }
    }
    
    /// eliminacion de los arquitos
    public void EliminarArco(String x) {
        Arco temp = Cabeza;
        Arco prev = null; // Mantenemos una referencia al nodo anterior

        if (Cabeza != null) {
            if (x.equals(Cabeza.getDestino())) {
                Cabeza = Cabeza.getPointer();
                temp.setPointer(null);
                size--;
            } else {
                while (temp != null && !temp.getDestino().equals(x)) {
                    prev = temp; // Actualizamos el nodo anterior
                    temp = temp.getPointer();
                }
                if (temp != null) { // Verificamos si encontramos el nodo
                    Arco deleter = temp;
                    prev.setPointer(deleter.getPointer()); // Enlazamos el nodo anterior al siguiente
                    deleter.setPointer(null); // Liberamos el nodo eliminado
                    size--;
                }
            }
        }
    }
    
}
