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
    
    public void AggArco (String destino, double longitud){
        Arco nuevoArco = new Arco ( destino, longitud);
        if (isEmpty()){
            this.ultimo =nuevoArco;
            this.Cabeza = nuevoArco;
        }else{
            this.ultimo.setPointer(nuevoArco);
            this.ultimo = nuevoArco;
            }
    }
    
    public void recorriido(){
        Arco Aux = Cabeza;
        while (Aux != null){
            System.out.println(Aux.getPointer());
            Aux = Aux.getPointer();
        }
    }
    
}
