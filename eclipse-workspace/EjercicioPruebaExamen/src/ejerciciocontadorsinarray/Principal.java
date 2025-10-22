package ejerciciocontadorsinarray;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int alumnos, mH = 0; double nota, sumaNotas = 0, media, nueve = 9.0;
		 * 
		 * System.out.println("¿Cúantos alumnos han realizado el examen?"); alumnos =
		 * Leer.datoInt(); for (int i = 0; i < alumnos; i++) {
		 * System.out.println("¿Nota final del examen del almuno " + (1 + i) + "?");
		 * nota = Leer.datoDouble(); sumaNotas += nota;
		 * 
		 * if (nota >= nueve) { mH++;
		 * 
		 * } } System.out.println("Hay " + mH + " matriculas de honor"); media =
		 * sumaNotas / alumnos; System.out.println("La media de las notas es: " +
		 * media);
		 */

		/*
		 * int familia,grupoG=0,udGrupo=0,cinco=5,total=0;
		 * 
		 * System.out.println("¿Cúantas familias han comprado entrada hoy?");
		 * familia=Leer.datoInt();
		 * 
		 * for (int i = 0; i < familia; i++) {
		 * System.out.println("¿Cúantas entradas compró el grupo "+(i+1)+"?");
		 * udGrupo=Leer.datoInt(); //Se debe de poner un total para poder acumular
		 * total+=udGrupo; if (udGrupo>=cinco) { grupoG++;
		 * 
		 * }
		 * 
		 * } System.out.println("vinieron "+grupoG); System.out.println(total);
		 */

		int socios, libros, total = 0;

		System.out.println("¿Cúantos Socios?");
		socios = Leer.datoInt();

		for (int i = 0; i < socios; i++) {

			System.out.println("¿Cúantos libros leyo el socio " + (i + 1) + "el mes pasado?");
			libros = Leer.datoInt();

			total += libros;

			if (libros > 4) {

				libros++;
			}
		}
		System.out.println("Hay " + socios);
		System.out.println("Se leyeron: "+total);

	}

}
