package examenB;

public class Profesor {
	
	private String nombre; 
	private String apellido; 
	private int id; 
	private int anyosAntiguedad; 
	private int numerosHoras;
	
	
	
	public Profesor(String nombre, String apellido, int id, int anyosAntiguedad, int numerosHoras) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.anyosAntiguedad = anyosAntiguedad;
		this.numerosHoras = numerosHoras;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAnyosAntiguedad() {
		return anyosAntiguedad;
	}
	public void setAnyosAntiguedad(int anyosAntiguedad) {
		this.anyosAntiguedad = anyosAntiguedad;
	}
	public int getNumerosHoras() {
		return numerosHoras;
	}
	public void setNumerosHoras(int numerosHoras) {
		this.numerosHoras = numerosHoras;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", anyosAntiguedad="
				+ anyosAntiguedad + ", numerosHoras=" + numerosHoras + "]";
	}
	
	public double calcularSueldo (double cantidad, double porcentaje) {
		
		int den= 100; 
		double resul;
		
		resul=porcentaje/den;
		
		return numerosHoras*cantidad-resul;
	}
	
	
	
	

}
