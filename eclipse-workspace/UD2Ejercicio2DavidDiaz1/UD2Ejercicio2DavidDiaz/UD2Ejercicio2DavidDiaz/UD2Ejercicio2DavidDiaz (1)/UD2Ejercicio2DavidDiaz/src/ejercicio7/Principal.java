package ejercicio7;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcular el precio final de una compra de un solo producto, pidiendo por
		 * teclado el precio del producto, la cantidad que se lleva y el porcentaje de
		 * descuento que se le aplica, pero solo si el total es mayor de 100 €. Si no es
		 * superior, se mostrará el mensaje "No hay descuento".
		 */
		
		double precio, descuento, total, desTotal, total2;
		int ud, den = 100;

		System.out.println("Hola, calculará el precio final de una compra");
		System.out.println("Las unidades que llevas");
		ud = Leer.datoInt();
		System.out.println("El precio del producto");
		precio = Leer.datoDouble();

		System.out.println("¿Cuál es el porcentaje de descuento a aplicar?");
		descuento = Leer.datoDouble();

		total = precio * ud;

		if (total > 100) {
			desTotal = total * descuento / den;
			total2 = total - desTotal;
			System.out.printf("Aplicandole el descuento del %.2f%%. \nEl total es: %.2f€", descuento, total2);
		} else {
			System.out.printf("No hay descuento. \nEl total es de %.2f€", total);
		}
		System.out.println("\nGracias por usar nuestro programa");
	}

}