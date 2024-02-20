/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafoa;

/**
 *
 * @author pedro
 */
public class Arco {
    private int destino;
    private double longitud;
    private Arco Pointer;

    public Arco(int destino, double longitud) {
        this.destino = destino;
        this.longitud = longitud;
        this.Pointer = null;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Arco getPointer() {
        return Pointer;
    }

    public void setPointer(Arco Pointer) {
        this.Pointer = Pointer;
    }
    
    
    
}
