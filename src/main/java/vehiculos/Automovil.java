package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo {
	private int puestos;
	private static ArrayList<Automovil> listado = new ArrayList<>();
	/*Mirar la parte de crear*/
	
	/*Constructores*/
    public Automovil(String placa, String nombre,int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre,precio ,peso, "FWD", fabricante);
		this.puestos = puestos;
		listado.add(this);
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
