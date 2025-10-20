package ejercicio5;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// esto es para generar un número aleatorio
		Random generador = new Random();

		int[] numeros;
		int tam = 0;
		int min, max;
		int numeAleatorios, suma = 0, mayor=0 , menor=0 ,opcion=0,nuevo=0;

		System.out.println("Bienvenido, este programa rellenerá de números aleatorios un array");
		System.out.println("¿Cuantos números quieres generar?");
		tam = Leer.datoInt();
		numeros = new int[tam];
		System.out.println("¿Cúal es el valor mínimo del número que desea generar?");
		min = Leer.datoInt();
		System.out.println("¿Y el valor maximo del número que desea generar?");
		max = Leer.datoInt();

		// for para generar números
		for (int i = 0; i < numeros.length; i++) {
			numeAleatorios = generador.nextInt(max - min + 1) + min;
			// Asignar el número aleatorio al indice del array
			numeros[i] = numeAleatorios;

		}
		// for para mostrar los números generados
		for (int i = 0; i < numeros.length; i++) {
			// linea para depurar y saber si se estan generando bien
			// System.out.println("Número generado "+numeros[i]);

			// Linea para mostrar los numeros
			System.out.println("El número " + (i + 1) + " es :" + numeros[i]);
		}

		// for para realizar la suma
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];

		}
		// suma
		System.out.printf("La suma de todos los números es: %d", suma);

		// este for sirve para determinar cual es mas grande.
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];

			}
			if (numeros[i] < menor) {
				menor = numeros[i];

			}
			// resultado finales del mayor menor de los array
			
		}
		System.out.println("\nEl número mayor del array es: " + mayor);
		System.out.println("El número menor del array es: " + menor);

		System.out.println("Elija uno de los números del array para modificarlo ");
		opcion=Leer.datoInt();
		
		System.out.println("El número elegido es: "+numeros[opcion+1]);
		System.out.println("¿Qué nuevo número desea introducir?");
		nuevo=Leer.datoInt();
		numeros[opcion+1]=nuevo;
		
		System.out.println("El nuevo número es: "+numeros[opcion+1]);
		
		System.out.println("EL nuevo array completo es ");
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número "+(i+1)+":"+numeros[i]);
		}
		
	}

}