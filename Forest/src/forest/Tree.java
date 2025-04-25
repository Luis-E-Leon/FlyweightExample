package forest;

public class Tree { 
	
	//Flyweight: estado compartido
	

	private String cortezaTextura;
	private String especie;
	private String colorHojas;
	
	public Tree(String especie, String cortezaTextura, String colorHojas) {
		this.cortezaTextura = cortezaTextura;
		this.especie = especie;
		this.colorHojas = colorHojas;
	}
	
	public void mostrarArbol(int x, int y) {
		System.out.println("Árbol de la especie "+ especie +" color de hojas "+ cortezaTextura + " y textura "+ colorHojas
				);
	}
	
	
}
