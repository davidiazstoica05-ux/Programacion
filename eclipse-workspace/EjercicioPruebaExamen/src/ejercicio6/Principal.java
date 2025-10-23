package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crear un array de double de 6 posiciones. Rellenarlo pidiendo al usuario el
		 * precio de 6 productos de una cesta de la compra.
		 * 
		 * Al final (después de rellenarlo), el programa debe mostrar por pantalla:
		 * 
		 * El precio medio de todos los productos.
		 * 
		 * Cuántos productos tienen un precio "caro" (superior a 50€).
		 */

		double[] precio;
		int tam = 6, cincuenta = 50, cont = 0;
		precio = new double[tam];
		double media, suma = 0;

		// cargar precios
		System.out.println("Bienvenido a nuestra tienda online");
		for (int i = 0; i < precio.length; i++) {

			System.out.println("Diga el precio del producto " + (i + 1));
			precio[i] = Leer.datoDouble();
			suma += precio[i];
		}
		// mostrar la suma
		System.out.println("La suma de todos los productos es de " + suma + "€");

		// mostar precios
		System.out.println("Listado de precios: ");
		for (int i = 0; i < precio.length; i++) {
			System.out.printf("\nPrecio producto %d: %.2f€", (i + 1), precio[i]);

		}
		// for para contar precios caros
		for (int i = 0; i < precio.length; i++) {
			if (precio[i] >= cincuenta) {

				cont++;
			}

		}
		if (cont == 1) {
			System.out.println("\nHay " + cont + " productos con precios caros");

		} else {
			System.out.println("\nHay " + cont + " producto con precio caro");

		}
		media = suma / precio.length;
		System.out.printf("\nLa media de todos los productos es de: %.2f€", media);
	}
}
