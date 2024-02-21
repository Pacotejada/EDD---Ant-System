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
    private String destino;
    private double longitud;
    private Arco Pointer;

    public Arco(String destino, double longitud) {
        this.destino = destino;
        this.longitud = longitud;
        this.Pointer = null;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
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
