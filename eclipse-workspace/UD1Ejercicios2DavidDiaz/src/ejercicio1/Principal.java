package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa donde se declaren varias variables de distinto tipo, se lee
		 * por teclado un valor dado por el usuario y mostrar por la pantalla el valor
		 * con el formato adecuado (usando printf).
		 */

		String producto;
		int ud;
		double precio, resultado;

		System.out.println("Hola este programa dirá el precio del producto");
		System.out.println("Díga el nombre del producto");
		producto = Leer.dato();
		System.out.println("Díga cuantas ud son:");
		ud = Leer.datoInt();
		System.out.println("Díga el precio del producto como ud individual");
		precio = Leer.datoDouble();

		resultado = precio * ud;
		System.out.printf("El precio final de %d %s es de %.2f ", ud, producto, resultado);
		System.out.println("\nGracias por usar nuestro programa");
	}

}
