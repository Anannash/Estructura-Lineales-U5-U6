/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestrucutradatos;

/**
 *
 * @author ANDY
 */
public class Nodo {
   public String Nombre;
   public int numControl;
   public char Asistencia;
   public Nodo siguiente;


//Metdoo insertar
    public Nodo(String Nombre, int numControl, char Asistencia) {
        this.Nombre = Nombre;
        this.numControl = numControl;
        this.Asistencia = Asistencia;
        this.siguiente = null;
    }


   
   
}
