package miniEjercicios;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 5, mayor = 0;
		int[] numeros = new int[tam];
		double suma = 0, media = 0;

		// Cargo el array
		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Diga el número " + (i + 1));
			numeros[i] = Leer.datoInt();
		}
		// mostrar
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicion " + (i + 1) + ": " + numeros[i]);

		}

		// suma
		for (int i = 0; i < numeros.length; i++) {

			suma = suma + numeros[i];

		}
		System.out.printf("La suma total es: %.2f", suma);

		// media

		media = suma / numeros.length;

		System.out.printf("\nLa media es: %.2f", media);

		// encontrar el maximo

		mayor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (mayor < numeros[i]) {

				mayor = numeros[i];

			}
		}
		System.out.println("\nEl numero mayor es: " + mayor);

	}
}
