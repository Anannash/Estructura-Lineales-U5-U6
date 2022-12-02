package tareaestrucutradatos;
// esta calse llevara el rol de construccion de nuestro arbol 
public class Arbol {
      // es objecto nodo raiz servira para la construccion del arbol
	private NodoArbol raiz;
        //imprime la interfaz grafica 
        private String cad="";
        private int cont=0;
        // constructor nos ayudara a agregar nuestra raiz del arbol
	public Arbol(String dato) {
		raiz=new NodoArbol(dato);
		raiz.setIzquierda(null);
		raiz.setDerecha(null);
	}
        // nos ayuda a insertar los datos a la izquierda y derecha con ayuda de la referncia en caso de no a ver un dato
	public void insertarIzquierda(String dato, NodoArbol ref) {
		if(ref!=null) {
			NodoArbol nuevo=new NodoArbol(dato);
			ref.setIzquierda(nuevo);
		}
	 }
	 public void insertarDerecha(String dato, NodoArbol ref) {
		 if(ref!=null) {
				NodoArbol nuevo=new NodoArbol(dato);
				ref.setDerecha(nuevo);
		 }
	 }
         //nos ayuda a obtener los ordenes dependiendo de cual sea elegido por elusuario
	 public String preOrden(NodoArbol ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                     	cad=cad+" "+ref.getDato(); 
                        preOrden(ref.getIzquierda());
			preOrden(ref.getDerecha());
		 }
                 return cad; 
	 }
	 public String inOrden(NodoArbol ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
			inOrden(ref.getIzquierda());
			cad=cad+" "+ref.getDato(); 
                        inOrden(ref.getDerecha());
		 }
            return cad; 
	 }
	 public String posOrden(NodoArbol ref) {
		 if(ref!=null) {
			if(ref==raiz){
                            cad="";
                        }
			
                        posOrden(ref.getIzquierda());
			posOrden(ref.getDerecha());
			cad=cad+" "+ref.getDato(); 
		 }
                 return cad; 
	 }
         
        public String invPreOrden(NodoArbol ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                     	cad=cad+" "+ref.getDato(); 
                        invPreOrden(ref.getDerecha());
                        invPreOrden(ref.getIzquierda());
		 }
                 return cad; 
	}
        
        public String invInOrden(NodoArbol ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
			invInOrden(ref.getDerecha());
			cad=cad+" "+ref.getDato(); 
                        invInOrden(ref.getIzquierda());
		 }
            return cad; 
	 }
        
        public String invPosOrden(NodoArbol ref) {
		 if(ref!=null) {
			if(ref==raiz){
                            cad="";
                        }
			
			invPosOrden(ref.getDerecha());
                        invPosOrden(ref.getIzquierda());
			cad=cad+" "+ref.getDato(); 
		 }
                 return cad; 
	 }
        
        public String grado(NodoArbol ref) {
		 if(ref!=null) {
                        if(ref==raiz){
                            cad="";
                        }
                        int cont=0;
                        if(ref.getDerecha()!=null){
                            cont++;
                        }
                        if(ref.getIzquierda()!=null){
                            cont++;
                        }
                     	cad=cad+"Nodo: "+ref.getDato()+"\nGrado: "+cont+"\n=====================\n"; 
                        grado(ref.getIzquierda());
			grado(ref.getDerecha());
		 }
                 return cad; 
	 }
        
        public String peso(NodoArbol ref) {
		if(ref!=null) {
                    if(ref==raiz){
                        cad="";
                    }
			
                    peso(ref.getIzquierda());
                    peso(ref.getDerecha());
                    
                    cont=pesoAux(ref);
                    cad=cad+"Nodo: "+ref.getDato()+"\nPeso: "+cont+"\n=====================\n";
                    cont=0;
		}
                return cad; 
        }
        public int pesoAux(NodoArbol ref){
            
            if(ref!=null){
                
                pesoAux(ref.getIzquierda());
                pesoAux(ref.getDerecha());
            
                if(ref.getDerecha()!=null){
                    cont++;
                }
                if(ref.getIzquierda()!=null){
                    cont++;
                }
            }
            return cont;
        }
	 
	 public NodoArbol getRaiz() {
		 return raiz; 
	 }
}
