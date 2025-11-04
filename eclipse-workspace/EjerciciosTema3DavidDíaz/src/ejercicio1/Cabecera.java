package ejercicio1;

public class Cabecera {

	// Atributos
	private String nombreAsignatura;
	private String aula;
	private String fecha;

	// Vamos a crear varios constructores con diferentes parámetros
	// Con todos los parametros
	// El orden dentro de los constructores debe de respetarse
	public Cabecera(String nombreAsignatura, String aula, String fecha) {
		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;
		this.fecha = fecha;

	}

	// Vacío
	public Cabecera() {

	}

	// Solo con dos los parametros
	public Cabecera(String nombreAsignatura, String aula) {
		this.nombreAsignatura = nombreAsignatura;
		this.aula = aula;

	}

	// método
	// Como tengo los valores como atributos no los tengo que pasar
	// como parámetros a este método
	public void rellenar() {
		System.out.println(
				"Asignatura: " + this.nombreAsignatura + "\t\tAula: " + this.aula + "\t\tfecha: " + this.fecha);

	}

	// v2
	public void rellenarv2(String nombreProfe) {
		System.out.println("Asignatura: " + this.nombreAsignatura + "\t\tAula: " + this.aula + "\t\tfecha: "
				+ this.fecha + "El profesor es: " + nombreProfe);
	}
}
