package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo {
	boolean volco;
	private static ArrayList<Camioneta> listado = new ArrayList<>();
	/*Mirar la parte de crear*/
	
	/*Constructores*/
	public Camioneta(String placa, int puertas, int velocidadMaxima, float precio, float peso, String traccion,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, velocidadMaxima, precio, peso, traccion, fabricante);
		this.volco = volco;
		listado.add(this);
	}
	public Camioneta(String placa,int puertas, float precio, float peso, Fabricante fabricante, boolean volco) {
    	this(placa, puertas, 90, precio, peso, "4X4", fabricante, volco);
	}
	
	/*getters y setters*/
	public boolean isVolco() {
		return volco;
	}

	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	/*Total Camionetas*/
	public static int totalCamionetas() {
		return listado.size();
	}
	
}
