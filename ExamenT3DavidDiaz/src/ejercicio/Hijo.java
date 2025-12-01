package ejercicio;

public class Hijo {
	
	
	private String nombre;
	private int id; 
	private int edad; 
	private int horasEstudias;
	public Hijo(String nombre, int id, int edad, int horasEstudias) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.horasEstudias = horasEstudias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getHorasEstudias() {
		return horasEstudias;
	}
	public void setHorasEstudias(int horasEstudias) {
		this.horasEstudias = horasEstudias;
	}
	@Override
	public String toString() {
		return "Hijo [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", horasEstudias=" + horasEstudias + "]";
	} 

	
	
 //calcularPaga
	
	public double calcularPorcentaje(double porcentaje) {
		int den=100; 
		double botePizza= porcentaje/den;
		return botePizza;
	}
	
	public double calcularPaga(double cant,double porcentaje) {
		return horasEstudias*cant-calcularPorcentaje(porcentaje);
		
	}
	
}
