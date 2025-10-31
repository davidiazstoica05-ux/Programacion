package ejercicio1;

public class Cabecera {

	// Atributos
	private String nombreAsignatura;
	private String aula;
	private String fecha;

	// metodo

	public void rellenar(String nombre, String aula1, String fecha) {

		nombreAsignatura = nombre;
		aula = aula1;
		this.fecha=fecha;
		System.out.println("Asignatura: "+nombre+"\t\tAula: "+aula1+"\t\tfecha: "+fecha);

	}
}
