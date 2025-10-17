package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crea un programa en el que se lea un número entero por teclado y diga cuántos
		 * días tiene el mes que corresponde a ese día. Intenta mejorar el programa
		 * leyendo también el año, para poder tener en cuenta si febrero tiene 28 ó 29
		 * días.
		 */

		String ene = "Enero", febr = "Febrero", mzo = "Marzo", abr = "Abril", my = "Mayo", jun = "Junio", jul = "Julio",
				agos = "Agosto";
		String sep = "Septiembre", oct = "Octubre", nov = "Noviembre", dic = "Diciembre";
		int meses, diasEne = 31, diasFebr = 28, diasMzo = 31, diasMy = 31, diasAbr = 30, diasJun = 30, diasJul = 31,
				diasAgos = 31, diasSep = 30;
		int diasOct = 31, diasNov = 30, diasDic = 31, diasFebrBi = 29, año;

		System.out.println("Bienvenido, este programa le dirá cuantos dias tiene el mes que seleccione:");

		System.out.printf("\nPulse 1 para %s.", ene);
		System.out.printf("\nPulse 2 para %s.", febr);
		System.out.printf("\nPulse 3 para %s.", mzo);
		System.out.printf("\nPulse 4 para %s.", abr);
		System.out.printf("\nPulse 5 para %s.", my);
		System.out.printf("\nPulse 6 para %s.", jun);
		System.out.printf("\nPulse 7 para %s.", jul);
		System.out.printf("\nPulse 8 para %s.", agos);
		System.out.printf("\nPulse 9 para %s.", sep);
		System.out.printf("\nPulse 10 para %s.", oct);
		System.out.printf("\nPulse 11 para %s.", nov);
		System.out.printf("\nPulse 12 para %s.", dic);
		System.out.println();
		meses = Leer.datoInt();

		switch (meses) {
		case 1:
			System.out.printf("%s tiene o tuvo %d dias.", ene, diasEne);
			break;
		case 2:
			System.out.println("Diga que año es para saber si es bisiesto.");
			año = Leer.datoInt();
			if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
				System.out.printf("%s tiene %d dias.", febr, diasFebrBi);
			} else {
				System.out.printf("%s tiene %d dias.", febr, diasFebr);
			}
			break;
		case 3:
			System.out.printf("%s tiene %d dias.", mzo, diasMzo);
			break;
		case 4:
			System.out.printf("%s tiene %d dias.", abr, diasAbr);
			break;
		case 5:
			System.out.printf("%s tiene %d dias.", my, diasMy);
			break;
		case 6:
			System.out.printf("%s tiene %d dias.", jun, diasJun);
			break;
		case 7:
			System.out.printf("%s tiene %d dias.", jul, diasJul);
			break;
		case 8:
			System.out.printf("%s tiene %d dias.", agos, diasAgos);
			break;
		case 9:
			System.out.printf("%s tiene %d dias.", sep, diasSep);
			break;
		case 10:
			System.out.printf("%s tiene %d dias.", oct, diasOct);
			break;
		case 11:
			System.out.printf("%s tiene %d dias.", nov, diasNov);
			break;
		case 12:
			System.out.printf("%s tiene %d dias.", dic, diasDic);
			break;
		default:
			break;
		}
		System.out.println("\nGracias por usar nuestro programa.");

	}

}
