package ejercicio11;

import utilidades.Leer;

public class GestionDeNotas {

	private Alumno alumn;
	private String materias[];

	public GestionDeNotas(Alumno alumn, String materias[]) {
		super();
		this.alumn = alumn;
		this.materias = materias;
	}

	public GestionDeNotas() {
		super();
	}

	public Alumno getAlumn() {
		return alumn;
	}

	public void setAlumn(Alumno alumn) {
		this.alumn = alumn;
	}

	@Override
	public String toString() {
		return "GestionDeNotas [alumn=" + alumn + "]";
	}

	// CargarmateriasFor

	public void cargarMaterias() {

		for (int i = 0; i < materias.length; i++) {
			System.out.println("Diga el nombre de la materia " + (i + 1) + ":");
			materias[i] = Leer.dato();
		}
	}

	// CargarNotas

	public void cargarNotas() {

		for (int i = 0; i < materias.length; i++) {
			System.out.printf("Diga la nota de %s\n", materias[i]);
			alumn.getNotas()[i] = Leer.datoDouble();

		}
	}

	// mostrarNotas

	public void mostrarNotas() {

		for (int i = 0; i < materias.length && i < 10; i++) {

			System.out.printf("%s", materias[i], ": %.2f\n", alumn.getNotas()[i]);

		}
		
	//modificarNotas 
		
	public void modificar notas() {
		
		System.out.println("Diga ");
		
		
		
		
	}

	}

}
