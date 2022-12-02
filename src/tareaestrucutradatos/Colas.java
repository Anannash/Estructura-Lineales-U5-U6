/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestrucutradatos;

import javax.swing.JOptionPane;

/**
 *Se crea una cola de espera para ser atendidos en una peluqueria, se hace por medio de turnos (1,2,3....)
 * en donde al ser ya atendidos se quita y pasa el siguietne
 * @author ANDY
 */
public class Colas {
private NodoCola inicio;
private NodoCola fin;
//Constructor
    public Colas() {
        inicio =  fin=null;
    }
    //Metodo para saber si esta vacia 
    public boolean Vacia(){
        return inicio==null;
    }
  //Agregar cliente
    public void encolar(Object Cliente){
        NodoCola nuevo = new NodoCola(Cliente);

        if (Vacia()){//checa que la cola este vacia o no
            inicio = nuevo;
            
        }else{
            fin.siguiente=nuevo;
            
        }   
        fin=nuevo;
    }
    //Quitar cliente
    public Object desencolar() throws Exception {
       Object aux;
        
        if(!Vacia()){//checa que la cola este vacia o no
           aux = inicio.Cliente;
            inicio=inicio.siguiente;   
        }else
            throw new Exception ("Eliminar de una cola vacia");
            return aux;
        }
    
   
    //imprimir 
    public Object mostrar (){
         NodoCola aux= inicio;
        String dato="Turno: \n";
       
            while(aux!=null){
         
                dato+=aux.Cliente+"\n";
                aux=aux.siguiente;
            }
           return dato;
    }
    
    
}//Fin de la clase colas
