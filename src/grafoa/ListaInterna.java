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

    public ListaInterna() {
        this.Cabeza = null;
        this.ultimo = null;
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
    public boolean isEmpty(){
        return getCabeza()==null;
    }
    public void setUltimo(Arco ultimo) {
        this.ultimo = ultimo;
    }
    
        public void AggArco (int destino, double longitud){
        Arco nuevoArco = new Arco ( destino, longitud);
        if (isEmpty()){
            Arco ultimo =nuevoArco;
            Arco cabeza = nuevoArco;
        }else{
            ultimo.setPointer(nuevoArco);
            ultimo = nuevoArco;
            }
        }
        
    
}
