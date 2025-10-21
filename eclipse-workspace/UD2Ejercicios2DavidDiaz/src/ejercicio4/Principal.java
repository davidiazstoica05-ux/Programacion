package ejercicio4;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * Rellenar un array unidimensional de 10 posiciones con números aleatorios
		 * entre 1 y 99 y mostrar el número guardado en un lugar que indique el usuario
		 * por teclado. También se debe mostrar la suma de todos y la media
		 */

		int tam = 10;
		int[] numeros = new int[tam];
		Random rnd = new Random(System.nanoTime());
		int numeroRandom, guardar;
		double suma = 0, media = 0;
		
		
		
		System.out.println("Bienvenido a un generado de números aleatorios entre el 1 y el 99, ademas podrás guardar el número en la posicion que desee");
		// generar los numeros guardado
		for (int i = 0; i < numeros.length; i++) {
			numeroRandom = rnd.nextInt(100);
			System.out.println("Número " + (i + 1) + " generado\nNúmero: " + numeroRandom);
			System.out.println("¿Donde deseas guardar el número?");
			System.out.println("Estado actual del array: ");
			// for dentro del for para generar la lista
			for (int j = 0; j < numeros.length; j++) {
				System.out.println("Hueco número= " + (j + 1) + " " + numeros[j]);
			}
			System.out.println("");
			guardar = Leer.datoInt();
			numeros[guardar - 1] = numeroRandom;
			System.out.println("");

		} // for para hacer la suma
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];

		} // muestro la suma
		System.out.printf("El total es: %.2f", suma);

		// hago la media, uso el .length para que sea entre el tam del array
		media = suma / numeros.length;
		System.out.printf("La media de todos los números es: %.2f",media);
		System.out.println("\nGracias por usar nuestro programa");
	}

}
