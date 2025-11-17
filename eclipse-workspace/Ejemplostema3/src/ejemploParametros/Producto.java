package ejemploParametros;

public class Producto {

	
	
	private String nombre; 
	private boolean refrigerado; 
	private double precio;
	
	
	public Producto(String nombre, boolean refrigerado, double precio) {
		super();
		this.nombre = nombre;
		this.refrigerado = refrigerado;
		this.precio = precio;
	}

	public Producto() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", refrigerado=" + refrigerado + ", precio=" + precio + "]";
	}
	
	
 //precio base + un 10% (Solo si el producto es refrigerado)
	
	//Suma al precio base un porcentaje por ser refrigerado
	public double calcularPvp(double porcentaje) {
		
		
		int den=100;
		
		if (refrigerado) {
			
			
			return precio+precio*porcentaje/den;
			
		} else {
			
			return precio;

		}
		
		
		
	}
	
}

