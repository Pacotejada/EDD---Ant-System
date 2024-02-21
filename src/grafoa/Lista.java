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
    
    public void recorriido(){
        Nodo Aux = cabeza;
        while (Aux != null){
            System.out.println(Aux.getCuerpo());
            Aux = Aux.getPointer();
        }
        
    }
    
    
    
    
    
}
