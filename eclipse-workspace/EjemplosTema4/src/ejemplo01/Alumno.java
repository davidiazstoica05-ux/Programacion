package ejemplo01;

import java.util.Arrays;

public class Alumno extends Persona {
	// Extends sirve para decir que una clase es hija de otra.
	// Alumno es extensión de Persona, es decir, es una ampliación de persona
	private String[] matriculado;
	private String clase;
	private double notaMedia;
	
	public Alumno(String nombre, String apellidos, String dni, int id, int edad, String[] matriculado, String clase,
			double notaMedia) {
		super(nombre, apellidos, dni, id, edad);
		this.matriculado = matriculado;
		this.clase = clase;
		this.notaMedia = notaMedia;
	}
	
	//Se hace así.De esta forma se llama al toString de la SuperClase 
	@Override
	public String toString() {
		return super.toString() + "Alumno [matriculado=" + Arrays.toString(matriculado) + ", clase=" + clase + ", notaMedia=" + notaMedia
				+ "]";
	}

	/*@Override
	public String toString() {
		return "Alumno [matriculado=" + Arrays.toString(matriculado) + ", clase=" + clase + ", notaMedia=" + notaMedia
				+ "]";
	} */
	//El toString sin darle a inherited solo muestra los atributos de alumno. Los de la madre no
	
	
	
}
