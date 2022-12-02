/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestrucutradatos;

/**
 *
 * @author ANDY
 */
public class NodoPilas {
    //variables
    String Disco;
    NodoPilas siguiente;
//constructor
    public NodoPilas() {
        Disco="";
        siguiente=null;
    }
    //get y set

    public String getDisco() {
        return Disco;
    }

    public void setDisco(String Disco) {
        this.Disco = Disco;
    }

    public NodoPilas getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPilas siguiente) {
        this.siguiente = siguiente;
    }
    
}//fin de class
