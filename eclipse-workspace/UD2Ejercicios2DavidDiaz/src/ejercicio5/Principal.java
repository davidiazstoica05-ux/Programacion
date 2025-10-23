package ejercicio5;

import java.util.Random;
// (Asegúrate de tener tu clase utilidades.Leer disponible)
import utilidades.Leer; 

public class Principal {

	public static void main(String[] args) {

		Random rnd = new Random(System.nanoTime());
		int[] numeros;
		int tam = 0, cantMenor = 0;
		int min, max;
		int numeAleatorios, suma = 0, mayor, menor, opcion = 0, nuevo = 0; 
		double media;

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
			numeAleatorios = rnd.nextInt(max - min + 1) + min;
			numeros[i] = numeAleatorios;
		}
		
		// for para mostrar los números generados
		for (int i = 0; i < numeros.length; i++)
			System.out.println("El número " + (i + 1) + " es :" + numeros[i]);

		// for para realizar la suma
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];
		}
		System.out.printf("La suma de todos los números es: %d", suma);


		mayor = numeros[0];
		menor = numeros[0];

		for (int i = 1; i < numeros.length; i++) { 
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}
			
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == menor) {
				cantMenor++;
			}
		}

		// resultado finales del mayor menor de los array
		System.out.println("\n\nEl número mayor del array es: " + mayor);
		System.out.println("El número menor del array es: " + menor);
		System.out.println("El número menor apareció " + cantMenor + " veces.");


		System.out.println("Elija uno de los números del array para modificarlo ");
		opcion = Leer.datoInt();

		System.out.println("El número elegido es: " + numeros[opcion - 1]);
		System.out.println("¿Qué nuevo número desea introducir?");
		nuevo = Leer.datoInt();
		numeros[opcion - 1] = nuevo;

		System.out.println("El nuevo número es: " + numeros[opcion - 1]);

		System.out.println("EL nuevo array completo es ");

		// Array para mostrar la nueva lista
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i + 1) + ":" + numeros[i]);
		}
		
		media = (double) suma / numeros.length;
		System.out.printf("\nLa media de la suma es: %.2f", media);
		System.out.println("\nGracias por usar nuestro programa");

	}
}