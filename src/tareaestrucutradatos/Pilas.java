/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestrucutradatos;


import javax.swing.JOptionPane;

/** MAYOR > MENOR<
 * En una rokola se puede escuhar musica, debido a que escoje el disco que
 * esta al inicio de una pila de otros discos.
 * dis3
 * dis2
 * dis1
 *Se hace una pila para escojer el disco (dis3 se aplila(agrega) -> dis3 se desapila (se quita para ponerlo en el toca discos))
 * @author ANDY
 */
public class Pilas {
private NodoPilas inicio;
int Tamano;

    public Pilas() {
        this.inicio = null;
        this.Tamano = 0;
    }
    //Metodo para saber si esta vacia 
    public boolean Vacia(){
        return inicio==null;
    }
    public int getTamano (){
        return Tamano;
    } 
    //agregar un elemento(Disco)
    public void Apilar(String Disco){
        NodoPilas nuevo = new NodoPilas();
        nuevo.setDisco(Disco);
        
        if(Vacia()){ //checa que la pila este vacia o no
            inicio = nuevo;
        }else{
            nuevo.setSiguiente(inicio);
            inicio=nuevo;
        }
        Tamano++;
    }
    //Eliminar un elemento(Disco) / en este caso el pop "reproduce" la cancion
    public void Desapilar(){
        if(!Vacia()){//checa que la pila este vacia o no
            inicio=inicio.getSiguiente();
            Tamano--;
        }
        
    }
    //Mostrar la PILA
    public void Mostra (){
        NodoPilas aux = inicio;
        String texto= "Demostracion de la Pila \n";
        while(aux !=null){
   
            texto += aux.getDisco()+"\n";
            aux = aux.getSiguiente();
           
        }
        JOptionPane.showMessageDialog(null, texto);
    }
}//Fin Clase
