package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo {
	int puestos;
	private static ArrayList<Automovil> listado = new ArrayList<>();
	/*Mirar la parte de crear*/
	
	/*Constructores*/
    public Automovil(String placa, int puertas, int velocidadMaxima, float precio, float peso, String traccion,
			Fabricante fabricante, int puestos) {
		super(placa, puertas, velocidadMaxima, precio, peso, traccion, fabricante);
		this.puestos = puestos;
		listado.add(this);
	}
    public Automovil(String placa, float precio, float peso, Fabricante fabricante, int puestos) {
    	this(placa, 4, 100, precio, peso, "FWD", fabricante, puestos);
    }

	/*getters y setters*/
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	/*Total de Automoviles*/
	public static int totalAutomoviles() {
		return listado.size();
	}
	
}