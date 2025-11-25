package ejercicio12;

public class Producto {

	private String nombre;
	private double precioFabrica;
	private boolean fragil;
	private int cantidad;
	private int id;

	public Producto(String nombre, double precioFabrica, boolean fragil, int cantidad, int id) {
		super();
		this.nombre = nombre;

		this.precioFabrica = precioFabrica;
		this.fragil = fragil;
		this.cantidad = cantidad;
		this.id = id;
	}

	public Producto(String nombre, double precioFabrica, int cantidad, int id) {
		super();
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.cantidad = cantidad;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioFabrica() {
		return precioFabrica;
	}

	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", fragil=" + fragil + ", cantidad="
				+ cantidad + ", id=" + id + "]";
	}

	// fragil

	public boolean comprobar(int opcion1) {

		if (opcion1 == 1) {
			return this.fragil = true;

		} else {
			return this.fragil = false;
		}

	}
	
	

}
