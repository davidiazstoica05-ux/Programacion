package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5. Realiza un programa que calcule la potencia de un número, dado este y su
		 * exponente sin usar Math.pow ( ). Pueden ocurrir tres casos: El exponente sea
		 * positivo, imprime resultado en pantalla. El exponente sea 0, el resultado es
		 * 1. El exponente sea negativo, el resultado es 1/potencia con el exponente
		 * positivo.
		 */

		int exponente;
		double numero, potencia;

		System.out.println("Hola, este programa calculará la potencia de un número");
		System.out.println("Diga el número");
		numero = Leer.datoInt();
		System.out.println("Diga el exponente del número");
		exponente = Leer.datoInt();

		potencia = Math.pow(numero, exponente);

		if (exponente > 0) {
			System.out.printf("El resultado es igual a %.2f", potencia);
		} else if (exponente == 0) {
			System.out.printf("\nEl resultado es igual a %.2f", potencia);
		} else {
			System.out.printf("\nLa potencia es igual a %.2f", potencia);
		}
		System.out.println("\nGracias por usar nuestro programa");
		{

		}

	}

}
