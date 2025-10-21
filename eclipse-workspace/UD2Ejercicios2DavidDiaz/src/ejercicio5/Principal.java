package ejercicio5;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// esto es para generar un número aleatorio
		Random rnd= new Random(System.nanoTime());
		int[] numeros;
		int tam = 0,cantMenor=0;
		int min, max;
		int numeAleatorios, suma = 0, mayor = 0, menor, opcion = 0, nuevo = 0;
		double media;

		System.out.println("Bienvenido, este programa rellenerá de números aleatorios un array");
		System.out.println("¿Cuantos números quieres generar?");
		tam = Leer.datoInt();
		// esto no se puede hacer antes de leer el tamaño-->numeros = new int[tam];
		numeros = new int[tam];
		System.out.println("¿Cúal es el valor mínimo del número que desea generar?");
		min = Leer.datoInt();
		menor = min;
		System.out.println("¿Y el valor maximo del número que desea generar?");
		max = Leer.datoInt();

		// for para generar números
		for (int i = 0; i < numeros.length; i++) {
			numeAleatorios = rnd.nextInt(max - min + 1) + min;
			// Asignar el número aleatorio al indice del array
			numeros[i] = numeAleatorios;
			// Numeros[i] puede ser asignado por generador.nextInt

		}
		// El for se puede poner sin llaves solo cuando hay una unica linea
		// for para mostrar los números generados
		for (int i = 0; i < numeros.length; i++)
			// Linea para mostrar los numeros
			System.out.println("El número " + (i + 1) + " es :" + numeros[i]);

		// for para realizar la suma
		for (int i = 0; i < numeros.length; i++) {
			suma += numeros[i];

		}
		// muestro la suma
		System.out.printf("La suma de todos los números es: %d", suma);

		mayor=numeros[0];
		// este for sirve para determinar cual es mas grande.
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
				
			}
			//La linea 60 es para entrar en el bucle desde el primer número del índice
			menor=numeros[0];
			if (numeros[i] <= menor) {
			menor=numeros[i];
			//esta linea es para contar cuantos hay iguales
			}if (menor == numeros[i]) {
				 cantMenor=cantMenor+1;
			}else {
				cantMenor=numeros[i];
				cantMenor=1;
			}
			
			

		} // resultado finales del mayor menor de los array
		System.out.println("\n\nEl número mayor del array es: " + mayor);
		System.out.println("El número menor del array es: " + menor);

		System.out.println("Elija uno de los números del array para modificarlo ");
		opcion = Leer.datoInt();

		System.out.println("El número elegido es: " + numeros[opcion - 1]);
		System.out.println("¿Qué nuevo número desea introducir?");
		nuevo = Leer.datoInt();
		numeros[opcion + 1] = nuevo;

		System.out.println("El nuevo número es: " + numeros[opcion - 1]);

		System.out.println("EL nuevo array completo es ");

		// Array para mostrar la nueva lista
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Número " + (i + 1) + ":" + numeros[i]);
		} 
		media=(double)suma/numeros.length;
		System.out.printf("\nLa media de la suma es: %.2f",media);
		System.out.println("\nGracias por usar nuestro programa");

	}

}