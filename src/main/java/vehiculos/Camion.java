package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo {
	int ejes;
	private static ArrayList<Camion> listado = new ArrayList<>();
	/*Mirar la parte de crear*/
	
	/*Constructores*/
	public Camion(String placa, int puertas, int velocidadMaxima, float precio, float peso, String traccion,
			Fabricante fabricante, int ejes) {
		super(placa, puertas, velocidadMaxima, precio, peso, traccion, fabricante);
		this.ejes = ejes;
		listado.add(this);
	}
	public Camion(String placa, float precio, float peso, Fabricante fabricante, int ejes) {
    	this(placa, 2, 80, precio, peso, "4X2", fabricante, ejes);
	}
	
	/*getters y setters*/
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	/*Total Camiones*/
	public static int totalCamiones() {
		return listado.size();
	}

}
