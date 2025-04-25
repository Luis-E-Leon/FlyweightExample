package forest;

import java.util.ArrayList;
import java.util.List;

public class Main {

	private List<SpecificTree> arboles = new ArrayList<>();

	public void plantarArbol(int x, int y, String especie, String colorHojas, String cortezaTextura) {
		Tree tipo = TreeFac.getTree(especie, cortezaTextura, colorHojas);
		SpecificTree NewArbol = new SpecificTree(x, y, tipo);
		arboles.add(NewArbol);
	}

	public void mostratBosque() {
		for (SpecificTree t : arboles) {
			t.mostrarArbol();
		}
	}

	public static void main(String[] args) {

		Main bosque = new Main();

		bosque.plantarArbol(1, 2, "Pino", "Verde Oscuro", "Aspera");
		bosque.plantarArbol(2, 4, "Palmera", "Verde Claro", "Lisa");
		bosque.plantarArbol(1, 3, "Roble", "Amarillo", "Aspera");
		bosque.plantarArbol(1, 7, "Pino", "Verde Oscuro", "Aspera");
		bosque.plantarArbol(1, 4, "Pino", "Verde Oscuro", "Aspera");

		bosque.mostratBosque();

	}

}
