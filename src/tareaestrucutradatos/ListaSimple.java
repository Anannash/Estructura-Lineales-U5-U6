/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaestrucutradatos;

import javax.swing.JOptionPane;



/**
 *
 * @author ANDY
 */
public class ListaSimple {
    
    public Nodo inicio,fin;
    public ListaSimple (){
        inicio=null;
        fin= null;
    }
    //metodo vacio
    public boolean Vacio (){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    //metodo para agregar 
    public void Agregar(String Nombre, int numControl, char Asistencia){
       
        if(!Vacio()){
                fin.siguiente= new Nodo (Nombre,numControl,Asistencia);
                fin=fin.siguiente;
    }else{
            inicio=fin=new Nodo (Nombre,numControl,Asistencia);
        }
}
    //metodo para mostrar
    public void Mostrar (){
        Nodo recorrer=inicio;
        String texto;
        while(recorrer!=null){
            /*
             -----------------------------------
            |Alumno: Oscar Lopez        |  
            |Num de Control: 12385     |
            |Asistencia: S                      |
             ------------------------------------
            */
            texto="Alumno: "+recorrer.Nombre+"\nNum.Control: "+recorrer.numControl+"\nAsistencia: "+recorrer.Asistencia;  
            JOptionPane.showMessageDialog(null,texto);
            recorrer=recorrer.siguiente;
        }
    }
    //metodo eliminar fin
    public void EliminarF(){
        String elemento ="Nombre: "+fin.Nombre+"\nNum. Control: "+ fin.numControl+"\nAsistencia: "+fin.Asistencia;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            Nodo temp=inicio;
            while(temp.siguiente!=fin){
                temp=temp.siguiente;
        }
            fin=temp;
            fin.siguiente=null;
    } 
        JOptionPane.showMessageDialog(null, elemento,"Elemento eliminado",JOptionPane.INFORMATION_MESSAGE);
}
    //metodo eliminar inicio
    public void EliminarI(){
        String elemento ="Nombre: "+inicio.Nombre+"\nNum. Control: "+ inicio.numControl+"\nAsistencia: "+inicio.Asistencia;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            inicio=inicio.siguiente;
        }
        JOptionPane.showMessageDialog(null, elemento,"Elemento eliminado",JOptionPane.INFORMATION_MESSAGE);     
    } 
    //metodo para buscar 
    public boolean Buscar(String nombre,int numControl,char Asistencia){
         
        Nodo temp=inicio;
        while (temp!=null && temp.Nombre != nombre && temp.numControl!=numControl && temp.Asistencia!=Asistencia){
            temp=temp.siguiente;
        }
        return temp !=null;
    }
      
}//fin de la clase


