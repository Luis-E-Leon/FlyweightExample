package forest;

import java.util.HashMap;
import java.util.Map;

public class TreeFac { 
	
	// Flyweight factory: crea y gestiona flyweights
	
	private static Map<String, Tree> Tipos = new HashMap<>() ; 
	//Se inicializa con un HashMap, que permite acceder rápido por clave.
	
	public static Tree getTree(String especie,String cortezaTextura,String colorHojas ) {
		
		String clave = especie + "-" + colorHojas + "-" + cortezaTextura;
		if (!Tipos.containsKey(clave)) {
			Tipos.put(clave, new Tree(especie, colorHojas,cortezaTextura));
		}
		return Tipos.get(clave);
	}
	
		
}
