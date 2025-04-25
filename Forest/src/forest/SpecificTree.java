package forest;

public class SpecificTree { //context: contiene el estado único y una 
							//referencia al flyweight


	private int x, y; // atributos extrínsecos
	private Tree arbol; // Estado compartido
	
	public SpecificTree(int x, int y, Tree arbol) {

		this.x = x; 
		this.y = y;
		this.arbol = arbol;
	}
	
	 public void mostrarArbol() {
	        arbol.mostrarArbol(x, y);
	}
	
	
}
