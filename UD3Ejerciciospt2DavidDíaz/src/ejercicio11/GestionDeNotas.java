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

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	@Override
	public String toString() {
		return "GestionDeNotas [alumn=" + alumn + "]";
	}

	// CargarmateriasFor

	public void cargarMaterias(String nombre) {
		for (int i = 0; i < materias.length; i++) {

		}
	}

	// CargarNotas

	public void cargarNotas(double nota) {

	}

	// mostrarNotas

	public void mostrarNotas() {

		for (int i = 0; i < materias.length && i < 10; i++) {

			System.out.printf("%s: %.2f\n", materias[i], alumn.getNotas()[i]);

		}
	}

	// mostrarNotasModificas
	public void modificarNotas() {

		int pos;
		double nuevaNota;

		System.out.println("Diga la nota que desea modificar");
		for (int i = 0; i < materias.length; i++) {
			System.out.printf("Pulsar %d: %s", (1 + i), materias[i]);

		}
		pos = Leer.datoInt();
		System.out.println("Diga la nueva nota que quieres introducir");
		nuevaNota = Leer.datoDouble();
		// modificarLaNota
		alumn.modificarNotas(pos, nuevaNota);

		System.out.println("Notas: ");
		mostrarNotas();
	}

	// Media

	public double calcularMedia() {

		double suma = 0;

		for (int i = 0; i < alumn.getNotas().length; i++) {

			suma += alumn.getNotas()[i];
		}

		return suma / alumn.getNotas().length;

	}

	// contarSuspenso
	public int contarSuspenso() {

		int cont = 0;
		int cinco = 5;

		for (int i = 0; i < alumn.getNotas().length; i++) {

			if (alumn.getNotas()[i] < cinco) {
			}
		}
		return cont;
	}

	// modificarNombre

	public void modificarNombre(String nuevoNombre) {

		for (int j = 0; j < materias.length; j++) {
			materias[j] = nuevoNombre;
		}

	}

}
