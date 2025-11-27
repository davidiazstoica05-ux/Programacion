package ejercicio13;

public class Habitacion {

	private int numHabitacion;
	private  int tipo;
	private double precioBase;
	private String nombreCliente;
	private boolean limpieza;
	private boolean ocupada;

	public Habitacion(int numHabitacion, int tipo, double precioBase,boolean ocupada) {
		super();
		this.numHabitacion = numHabitacion;
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.ocupada=ocupada;
	}


	
	
	

	public int getNumHabitacion() {
		return numHabitacion;
	}




	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}




	public int getTipo() {
		return tipo;
	}




	public void setTipo(int tipo) {
		this.tipo = tipo;
	}




	public double getPrecioBase() {
		return precioBase;
	}




	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}




	public String getNombreCliente() {
		return nombreCliente;
	}




	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}




	public boolean isLimpieza() {
		return limpieza;
	}




	public void setLimpieza(boolean limpieza) {
		this.limpieza = limpieza;
	}




	public boolean isOcupada() {
		return ocupada;
	}




	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [numHabitacion=" + numHabitacion + ", tipo=" + tipo + ", precioBase=" + precioBase
				+ ", nombreCliente=" + nombreCliente + ", limpieza=" + limpieza + ", ocupada=" + ocupada + "]";
	}



	
	public boolean comprobar(int x) {

		if (x==1) {
			
			return ocupada= true; 
			
		} else {

			return ocupada= false;

		}

	}

		public boolean comprobarLimpia(int x) {

			if (x==1) {
				
				return limpieza= true; 
				
			} else {

				return limpieza=  false;

			}

		}
}