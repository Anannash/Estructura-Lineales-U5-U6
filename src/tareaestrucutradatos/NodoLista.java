/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestrucutradatos;

/**
 *
 * @author ANDY
 */
public class NodoLista {
      public int dato;
    NodoLista siguiente,anterior;
    //costrucor cuando hay nodos
    public NodoLista(int dato, NodoLista siguiente, NodoLista anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    //construcor cunado NO hay nodos
    public NodoLista(int dato){
        this(dato,null,null);
    }

    public NodoLista() {
    }
    
}
