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
	// Getter and set
	
	//Get asignatura
	public String getNombreAsignatura() {

		return this.nombreAsignatura;
	}
	//set asignatura

	public void setnombreAsignatura(String nombreAsignatura) {

		this.nombreAsignatura = nombreAsignatura;

	}
	//get aula
	
	public String getAula() {
		
		return this.aula;
	}
	
	//set aula
	public void setAula(String aula) {

		this.aula = aula;

	}
	//get fecha
	
	public String getfecha() {
		
		return this.fecha;
	}
	
	//set fecha
	public void setfecha(String fecha) {

		this.fecha = fecha;

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
