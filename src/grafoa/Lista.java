/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafoa;

/**
 *
 * @author pedro
 */
public class Lista {
    private Nodo cabeza;
    private Nodo ultimo;
    private int size;
    private Nodo next;

    public Lista() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
        this.next = null;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    /// esto hace que aagreguemos los nodos
    public void AggNodo (String cuerpo){
        Nodo nuevoNodo = new Nodo(cuerpo);
        if (size == 0){
            this.ultimo = nuevoNodo;
            this.cabeza = nuevoNodo;
        }else{
            this.ultimo.setPointer(nuevoNodo);
            this.ultimo = nuevoNodo;
            }
        size ++;
    }
    
    ///recorridos de nodos
    public void recorrido(){
        Nodo Aux = cabeza;
        while (Aux != null){
            System.out.println(Aux.getCuerpo());
            Aux.getListainterna().recorridoInterno();
            System.out.println(">");
            Aux = Aux.getPointer();
        }
        
    }
    
    /// agregar no nodos internos de cada ciudad haciendolo con el nombre de arquitos
    public void AggArcoInterno(String ciudad, String destino, double longitud){
        Nodo Aux = cabeza;
        while (Aux != null){
            if (ciudad.equals(Aux.getCuerpo())){
                
                Aux.getListainterna().AggArco(destino, longitud);
            }
            Aux = Aux.getPointer();
        }
        
        Aux = cabeza;
        while (Aux != null){
            if (destino.equals(Aux.getCuerpo())){
                Aux.getListainterna().AggArco(ciudad, longitud);
            }
            Aux = Aux.getPointer();
        }
        
    }

    public void EliminarCiudad(String x) {
        Nodo temp = cabeza;
        Nodo prev = null; // Mantenemos una referencia al nodo anterior

        if (cabeza != null) {
            if (x.equals(cabeza.getCuerpo())) {
                cabeza = cabeza.getPointer();
                temp.setPointer(null);
                size--;
            } else {
                while (temp != null && !temp.getCuerpo().equals(x)) {
                    prev = temp; // Actualizamos el nodo anterior
                    temp = temp.getPointer();
                }
                if (temp != null) { // Verificamos si encontramos el nodo
                    Nodo deleter = temp;
                    prev.setPointer(deleter.getPointer()); // Enlazamos el nodo anterior al siguiente
                    deleter.setPointer(null); // Liberamos el nodo eliminado
                    size--;
                }
            }
        }
        
        Nodo Aux = cabeza;
        while (Aux != null){
            Aux.getListainterna().EliminarArco(x);
            Aux = Aux.getPointer();
        }
    }
    
    ///eliminacion del nodo interno osea lo arquitos
    public void EliminarCiudadInterna (String cuerpo){
        Nodo Aux = cabeza;
        while (Aux != null){
            Arco Aux2 = Aux.getListainterna().getCabeza();
            while (Aux2 != null ){
                if (Aux2.getDestino().equals(cuerpo));
                    Aux2 = Aux2.getPointer();
                    size --;
                Aux2 = Aux2.getPointer();
            }
            Aux = Aux.getPointer();
        }
    }
    
    
}
