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

    public Lista() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
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
    
    public void recorrido(){
        Nodo Aux = cabeza;
        while (Aux != null){
            System.out.println(Aux.getCuerpo());
            Aux = Aux.getPointer();
        }
        
    }
    
    public void AggArcoInterno(String ciudad, String destino, double longitud){
        Nodo Aux = cabeza;
        while (Aux != null){
            if (ciudad.equals(Aux.getCuerpo())){
                Aux.getListainterna().AggArco(destino, longitud);
            }
            Aux = Aux.getPointer();
        }
        
    }
    
    public void EliminarCiudad (String cuerpo){
        Nodo Aux = cabeza;
        while ( Aux != null){
            if ( Aux.getCuerpo() == cuerpo ){
                Aux = Aux.getPointer();
                size --;
            }
            Aux = Aux.getPointer();
        }
    }
    
    public void EliminarCiudadInterna (String cuerpo){
        Nodo Aux = cabeza;
        while (Aux != null){
            Arco Aux2 = Aux.getListainterna().getCabeza();
            while (Aux2 != null ){
                if (Aux2.getDestino() == cuerpo);
                    Aux2 = Aux2.getPointer();
                    size --;
                Aux2 = Aux2.getPointer();
            }
            Aux = Aux.getPointer();
        }
    }
    
    
    
    
}
