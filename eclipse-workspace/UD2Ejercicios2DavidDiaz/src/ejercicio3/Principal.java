package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con
		 * números leídos por teclado y mostrar la media de todos los elementos y la
		 * cantidad de números “cero” introducidos.
		 */
		// Un for para cargar un for para mostrar
		int tam = 8, respuesta, cero = 0, contadorCero = 0;
		int[] numeros = new int[tam];
		double suma = 0, media = 0;

		System.out.println("Bienvenido a una Lista de 8 números, la cúal será sumada y se hará la media de sus elementos");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Diga el número " + (i + 1) + " que desea introducir");
			respuesta = Leer.datoInt();
			numeros[i] = respuesta;
			if (respuesta == cero) {
				contadorCero++;

			}
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("El número guardado en el hueco " + (i + 1) + " es " + numeros[i]);

		}
		System.out.println("Hay " + contadorCero + " cero/s");
		// for para la suma
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		// muestro el resultado
		System.out.printf("\nLa suma de todos los números es: %.2f", suma);

		media = suma / numeros.length;
		System.out.printf("\nLa media de todos los números es: %.2f", media);
		System.out.println("Gracias por usar nuestro programa");
	}
}
