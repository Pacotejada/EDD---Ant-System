/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafoa;

/**
 *
 * @author pedro
 */
public class Nodo {
    private String Cuerpo;
    private Nodo Pointer;
    private Lista listainterna;

    public Nodo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
        this.Pointer = null;
        this.listainterna = null;
    }

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
    }

    public Nodo getPointer() {
        return Pointer;
    }

    public void setPointer(Nodo Pointer) {
        this.Pointer = Pointer;
    }

    public Lista getListainterna() {
        return listainterna;
    }

    public void setListainterna(Lista listainterna) {
        this.listainterna = listainterna;
    }
    
    
    
    
    
    
}
