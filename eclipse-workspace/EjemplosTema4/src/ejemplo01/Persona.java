package ejemplo01;

public class Persona {
	private String nombre; 
	private String apellidos;
	private String dni; 
	private int id; 
	private int edad;
	
	public Persona(String nombre, String apellidos, String dni, int id, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.id = id;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", id=" + id + ", edad="
				+ edad + "]";
	} 
	
	
	
	
}
