package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima; /*Mirar bien el tipo de dato*/
	private String nombre;
	private int precio; /*Mirar bien el tipo de dato*/
	private int peso; /*Mirar bien el tipo de dato*/
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	public static ArrayList<String> listado = new ArrayList<>();
	public static ArrayList<String> listado2 = new ArrayList<>();
	
	/*Constructores*/
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		CantidadVehiculos ++;
		listado.add(this.fabricante.getPais().getNombre());
		listado2.add(this.fabricante.getNombre());
	}

	/*Metodo vehiculosPorTipo*/
	public static String vehiculosPorTipo() {
		
		return "Automoviles: "+ Automovil.totalAutomoviles() +"\n"+
			   "Camionetas: "+ Camioneta.totalCamionetas() +"\n"+
			   "Camiones: "+ Camion.totalCamiones();
	}

	/*getters y setters*/
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		CantidadVehiculos = cantidadVehiculos;
	}
	
}
