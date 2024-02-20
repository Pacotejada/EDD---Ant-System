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

    public Lista(Nodo cabeza, Nodo ultimo) {
        this.cabeza = cabeza;
        this.ultimo = ultimo;
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
    
    public void AggNodo (Object cuerpo){
        Nodo nuevoNodo = new Nodo(cuerpo);
        if (size == 0){
            Nodo ultimo =nuevoNodo;
            Nodo cabeza = nuevoNodo;
        }else{
            ultimo.setPointer(nuevoNodo);
            ultimo = nuevoNodo;
            }
        size ++;
    }
    
    
    
    
    
}
