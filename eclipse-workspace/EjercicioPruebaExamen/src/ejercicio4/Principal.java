package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realiza un programa que pida primero cuántos empleados (N) hay en una
		 * oficina.
		 * 
		 * Luego, usando un bucle (que se repetirá N veces), debe pedir el sueldo
		 * (double) de esos N empleados, uno por uno.
		 * 
		 * Al final (después de que termine el bucle), el programa debe mostrar por
		 * pantalla:
		 * 
		 * El sueldoMedio de todos los empleados de la oficina.
		 * 
		 * Cuántos empleados tienen un "sueldo precario" (considerado cualquier sueldo
		 * inferior a 950€).
		 */

		int empleados, precario = 950, carcel = 0;
		double sueldo = 0, media, sumasueldo = 0;

		System.out.println("¿Cúantos empleados hay en la oficina?");
		empleados = Leer.datoInt();
		for (int i = 0; i < empleados; i++) {
			System.out.println("Diga el sueldo del empleado " + (i + 1));
			sueldo = Leer.datoInt();
			// esto es para acumular, es decir poner varios sueldos sin array
			sumasueldo += sueldo;

			//colocamos sueldo porque queremos saber cuanto vale sueldo, no el total que sería sumasueldo
			if (sueldo <= precario) {
				carcel++;

			}
		}
		System.out.println("\nSueldos precarios: " + carcel);
		media = sumasueldo / empleados;
		System.out.printf("Sueldo medio de los empleados: %.2f€", media);

		System.out.println("\nGracias por usar nuestro programa");

	}

}
