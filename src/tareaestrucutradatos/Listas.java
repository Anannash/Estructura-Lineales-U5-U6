/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestrucutradatos;

import javax.swing.JOptionPane;

/**
 * --Se crea una lista 
 * @author ANDREA MORALES CHAVEZ
 */
public class Listas  {

     private NodoLista cabeza,cola;

    public Listas() {
        cabeza=cola=null;
    }
    //Metodo para buscar
     public void Busqueda (){
    NodoLista  Actual = new NodoLista();
          Actual=cabeza;
          boolean Encontrado = false;
          
       int nodo=Integer.parseInt( JOptionPane.showInputDialog(null,"Ingresa el Nodo a buscar: "));
       
       if(cabeza != null){
           while(Actual != null && Encontrado != true){
               if(Actual.dato == nodo){
                   JOptionPane.showMessageDialog(null, nodo,"Nodo en contrado: ",JOptionPane.INFORMATION_MESSAGE);
                   Encontrado=true;
               }
             Actual=Actual.siguiente;
           }
           if(!Encontrado){
               JOptionPane.showMessageDialog(null, "Nodo no encontrado");
           }
       }else{
           JOptionPane.showMessageDialog(null, "La lista esta vacia");
       }
          
      }
    //Saber cuando la lista esta vacia
    public boolean vacio(){
    return cabeza==null;
    }
    //agregar nodos al final
    public void addFinal(int dato){
        
    if(!vacio()){
        cola= new NodoLista (dato,null,cola);
        cola.anterior.siguiente=cola;
   
    }else{
        cabeza=cola=new NodoLista(dato);
    }
    
}
     //agregar nodos al inicio
    public void addInicio(int dato){
        
    if(!vacio()){
        cabeza= new NodoLista (dato,cabeza,null);
        cabeza.anterior.siguiente=cabeza;
   
    }else{
        cabeza=cola=new NodoLista(dato);
    }
    
}
  //MOSTRAR DATOS de INICIO A FINA
    public void mostrarIaF(){
       if(!vacio()){ 
           String datos= "<=>";
           NodoLista auxiliar=cabeza;
           while(auxiliar!=null){
               datos=datos+"["+auxiliar.dato+"]<=>";
               auxiliar=auxiliar.siguiente;
           }
           JOptionPane.showMessageDialog(null, datos,"Mostrando lista de INICIO A FIN",JOptionPane.INFORMATION_MESSAGE);
       }
    
}
      //MOSTRAR DATOS de FIN A INICIO
    public void mostrarFaI(){
       if(!vacio()){ 
           String datos= "<=>";
           NodoLista auxiliar=cola;
           while(auxiliar!=null){
               datos=datos+"["+auxiliar.dato+"]<=>";
               auxiliar=auxiliar.anterior;
           }
           JOptionPane.showMessageDialog(null, datos,"Mostrando lista de INICIO A FIN",JOptionPane.INFORMATION_MESSAGE);
       }
    
}
    //Eliminar INICIO
      public int QuitarInicio() {
     int elemento=cabeza.dato;
     if(cabeza==cola){
         cabeza=cola=null;
         
     }else{
         cabeza=cabeza.siguiente;
         cabeza.anterior=null;
     }
     return elemento;
    }
       //Eliminar FIN
      public int QuitarFin() {
     int elemento=cola.dato;
     if(cabeza==cola){
         cabeza=cola=null;
         
     }else{
         cola=cola.anterior;
         cola.siguiente=null;
     }
     return elemento;
    }
     
    
}
