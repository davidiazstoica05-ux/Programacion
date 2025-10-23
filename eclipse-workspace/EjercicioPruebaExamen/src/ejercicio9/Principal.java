package ejercicio9;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Preguntar al usuario cuántos amigos hay en la pandilla (este será el tamaño
		 * del array de int).
		 * 
		 * Rellenar el array pidiendo la edad de cada amigo.
		 * 
		 * Mostrar la suma total de todas las edades.
		 * 
		 * Mostrar la edad más alta (el mayor) y la edad más baja (el menor) del grupo.
		 * 
		 * Preguntar al usuario el número del amigo (la posición) que desea modificar y
		 * pedirle la nueva edad para esa posición.
		 */

		int numeroAmig, mayor, menor, posicion, nuevo;
		int[] amigos;
		int edad;
		double sumaE = 0;

		System.out.println("¿Cuántos amigos hay en la pandilla?");
		numeroAmig = Leer.datoInt();
		amigos = new int[numeroAmig];

		// cargar edad
		for (int i = 0; i < amigos.length; i++) {
			System.out.println("Diga la edad del amigo " + (i + 1));
			edad = Leer.datoInt();
			amigos[i] = edad;
		}
		// for para hacer la suma. Esto siempre en un for
		for (int i = 0; i < amigos.length; i++) {

			sumaE += amigos[i];
		}
		System.out.println("Suma total de todas las edades " + sumaE);

		// para entrar en el bucle

		mayor = amigos[0];
		menor = amigos[0];
		for (int i = 0; i < amigos.length; i++) {
			if (amigos[i] > mayor) {
				mayor = amigos[i];
			}
			if (amigos[i] < menor) {
				menor = amigos[i];
			}

		} 
		System.out.println("Mayor: "+mayor);
		System.out.println("Menor: "+menor);

		System.out.println("Qué posicion deseas modificar?");
		posicion = Leer.datoInt();

		System.out.println("¿Qué nuevo número desea introducir?");
		nuevo = Leer.datoInt();

		amigos[posicion - 1] = nuevo;

		System.out.println("Nueva lista");
		for (int j = 0; j < amigos.length; j++) {
			System.out.println("Edad amigo n" + (j + 1) + ": " + amigos[j]);
		}

	}
}
