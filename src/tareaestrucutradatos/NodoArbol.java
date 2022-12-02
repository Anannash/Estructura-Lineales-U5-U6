package tareaestrucutradatos;
public class NodoArbol {
	private String dato;  
	// estos nos ayudaran a poder insertar los numeros al la derecha o izquierdadel arbol
        private NodoArbol izquierda; 
	private NodoArbol derecha; 
        
	// constructor
	public NodoArbol(String dato) {
		this.dato=dato; 
		this.izquierda=null; 
		this.derecha=null; 
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public NodoArbol getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(NodoArbol izquierda) {
		this.izquierda = izquierda;
	}
	public NodoArbol getDerecha() {
		return derecha;
	}
	public void setDerecha(NodoArbol derecha) {
		this.derecha = derecha;
	}
}
