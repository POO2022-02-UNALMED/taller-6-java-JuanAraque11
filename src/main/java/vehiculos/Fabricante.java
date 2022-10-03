package vehiculos;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static Map<Fabricante, Integer> mapaFabri = new HashMap<Fabricante, Integer>();//Crear por fuera 
	
	/*Constructores*/
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	/*Fabricante mas vendedor*/
	public static Fabricante fabricaMayorVentas() {
		int max= -1;
		Fabricante fabricaMayorVentas = null;
		
		for(Entry<Fabricante, Integer> entry : mapaFabri.entrySet()) {
			final int actual = entry.getValue();
			
			if (actual > max) {
				max = actual;
				fabricaMayorVentas = entry.getKey();
			}
		}
		return fabricaMayorVentas;
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
