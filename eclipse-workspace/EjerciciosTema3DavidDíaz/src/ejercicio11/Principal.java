package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, tam = 0, suspensos = 0, notaMod, diez = 10;
		double notas[], notasLeer;
		String materias[];
		String nombre, curso;
		double notaMedia, primeraNota;
		Alumno almn;
		GestionDeNotas gn;

		System.out.println("Bienvenido al gestor de notas");
		System.out.println("Diga el curso");
		curso = Leer.dato();
		System.out.println("Diga el nombre del Alumno");
		nombre = Leer.dato();
		System.out.println("Cuántas materias son las evaluadas?");
		tam = Leer.datoInt();
		notas = new double[tam];
		almn = new Alumno(nombre, curso, notas);
		materias = new String[tam];
		gn = new GestionDeNotas(almn, materias);

		// Se puede cargar en el main
		// Cargar nombreMaterias
		for (int i = 0; i < materias.length; i++) {
			System.out.println("Diga el nombre de la materia " + (i + 1) + ":");
			materias[i] = Leer.dato();
		}

		// cargarNotas

		for (int i = 0; i < almn.getNotas().length; i++) {
			System.out.printf("Diga la nota de %s \n", gn.getMaterias()[i]);
			notasLeer = Leer.datoDouble();
				if (notasLeer < diez) {
					notas[i] = notasLeer;
				}else {
					
					System.out.println("El número no puede ser mayor de diez");
					notasLeer=Leer.datoDouble();					
				}
		}

		do {
			System.out.printf("\nPulse 1 para mostrar todas las notas de %s\n", almn.getNombre());
			System.out.println("Pulse 2 para modificar una nota");
			System.out.println("Pulse 3 para calcular la media");
			System.out.println("Pulse 4 para ver el número de suspensos");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				gn.mostrarNotas();
				break;
			case 2:
				gn.modificarNotas();
				break;
			case 3:
				// Separar el set media y hacerlo en un metodo diferente
				almn.setNotaMedia(gn.calcularMedia());
				System.out.printf("La nota media del alumno es: %.2f", almn.getNotaMedia());

				break;
			case 4:

				System.out.printf("Número de suspensos del alumno: %d", gn.contarSuspenso());

				break;
			case 0:

				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Número erroneo");
				break;
			}
		} while (opcion != 0);
		System.out.println("Gracias por usar nuestro programa");
	}

}
