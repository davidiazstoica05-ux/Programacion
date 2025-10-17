package Ejercicio8;

import utilidades.Leer;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Haz un programa que calcule la longitud de una circunferencia de radio 3
		 * metros y el área de un círculo de radio 5.2 metros. Puedes hacer infinidad de
		 * ejercicios como este con fórmulas matemáticas como áreas, volúmenes, teoremas
		 * (Pitágoras, por ejemplo), etc.
		 */

		double radio, longitud, area;
		String respuesta;

		System.out.printf("Hola, este programa calcula la longitud y el área de una circunferencia");

		System.out.printf("\nEmpezaremos con la longitud. Introduzca el radio de la circunferencia:");
		radio = Leer.datoDouble();
		longitud = 2 * Math.PI * radio;
		System.out.printf("\nEl radio es %.2f, por lo tanto su longitud es igual a %.2f", radio, longitud);
		System.out.println("\n¿Desea calcular el área del círculo? (si/no)");
		/*
		 * Aqui coloco esta línea para poder guardar la respuesta en algun lado, luego
		 * el .toLowercase para que el programa siempre la convierta en minuscula (para
		 * que no haya errores) el .trim es para que no haya errores con los espacios en
		 * blanco
		 */
		respuesta = Leer.dato().toLowerCase().trim();

		/*
		 * Coloco un if, para que dependiendo de la respuesta (boolean) el programa
		 * escoja un camino u otro. En este caso si escoges si, te hace el calculo de la
		 * longitud. La línea es tal que así if(respuesta *no tiene porq ser siempre
		 * respuesta, es el nombre de la var anterior*.equals("si"))
		 * 
		 */

		if (respuesta.equals("si")) {
			area = Math.PI * Math.pow(radio, 2);
			System.out.printf("\nEl área del círculo es de %.2f m2", area);
			System.out.printf(
					"\nEl resultado total sería de una longitud de %.2f m y un área de %.2f m2. Gracias por usar nuestro prgrama.",
					longitud, area);
		}

		// else if para que cuando responda que no el programa acabe directamente

		else if (respuesta.equals("no")) {
			System.out.println("\nGracias por usar nuestro programa.");
		}

		// Uso else como una tercera opcion por si a algún iluminao le da por poner otra
		// cosa que no sea SI o NO (Me queda perfeccionarlo para que vuelva atras)
		else {
			System.out.println("Respuesta no valida. Use solo 'SI/NO'");

		}

	}

}
