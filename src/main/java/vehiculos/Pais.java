package vehiculos;
import java.util.HashMap;

public class Pais {
	private String nombre;
	private static HashMap<String, Integer> mapa = new HashMap<>();//Crear por fuera 
	
	/*Constructores*/
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	/*Pais mas vendedor*/
	public static String paisMasVendedor() {
		
		for(String pais:Vehiculo.listado) {
			if (mapa.containsKey(pais)) {
				mapa.put(pais, mapa.get(pais) + 1);
			} else {
				mapa.put(pais, 1);
			}
		}
		int mayor = 0;
		String moda = null;
		for (HashMap.Entry<String, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor = entry.getValue();
				moda = entry.getKey();
			}
		}
		return moda;
	}
	
	/*getters y setters*/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
