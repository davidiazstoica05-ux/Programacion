package ejercicio14;

public class Movil {
	
	private int id;
	private String marca; 
	private String modelo; 
	boolean vendido; 
	boolean nuevo; 
	double precio;
	
	
	
	public Movil(int id, String marca, String modelo, boolean vendido, boolean nuevo, double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.nuevo = nuevo;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Movil [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", nuevo="
				+ nuevo + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}
