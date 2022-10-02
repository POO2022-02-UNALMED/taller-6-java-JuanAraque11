package vehiculos;
import java.util.HashMap;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static HashMap<String, Integer> mapa = new HashMap<>();//Crear por fuera 
	
	/*Constructores*/
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	/*Fabricante mas vendedor*/
	public static String fabricaMayorVentas() {
		
		for(String fabri:Vehiculo.listado2) {
			if (mapa.containsKey(fabri)) {
				mapa.put(fabri, mapa.get(fabri) + 1);
			} else {
				mapa.put(fabri, 1);
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
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
