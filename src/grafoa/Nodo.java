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
<<<<<<< HEAD
    private ListaInterna listainterna;
=======
    private Lista listainterna;
    
>>>>>>> 6684689031aceb5d0f2c22a308fcdb34aac61593

    public Nodo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
        this.Pointer = null;
        this.listainterna = new ListaInterna();
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

    public ListaInterna getListainterna() {
        return listainterna;
    }

    public void setListainterna(ListaInterna listainterna) {
        this.listainterna = listainterna;
    }
    
    
    
    
    
    
}
