package vehiculos;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pais {
	private String nombre;
	public static Map<Pais, Integer> mapaPais = new HashMap<Pais, Integer>();//Crear por fuera 
	
	/*Constructores*/
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	/*Pais mas vendedor*/
	public static Pais paisMasVendedor(){
		int max = -1;
		Pais paisMasVendedor = null;
		
		for (Entry<Pais, Integer> entry : mapaPais.entrySet()) {
			final int actual = entry.getValue();
			
			if (actual > max) {
				max = actual;
				paisMasVendedor = entry.getKey();
			}
		}
		return paisMasVendedor;
	}
	
	/*getters y setters*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
