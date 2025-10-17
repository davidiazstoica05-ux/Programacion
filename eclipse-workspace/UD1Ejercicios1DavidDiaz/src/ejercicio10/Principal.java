package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 10. Escribir un programa que sirva para calcular el precio final de un
		 * producto. El cliente se lleva 4 unidades de un producto que cuesta 12,99 € y
		 * se le aplica un descuento del 3 % al precio total.
		 */
		String producto1;
		double precio, descuen = 0.03, preciofin, des, preciototal;
		int ud;

		System.out.println(
				"Hola, este programa calcula el precio final de la compra, con el descuento incluido.");
		System.out.println("Díga cual es el producto:");
		producto1 = Leer.dato();
		System.out.println("¿Cuantas unidades lleva?");
		ud = Leer.datoInt();
		System.out.println("¿Cual es el precio del producto? (como unidad individual) ");
		precio = Leer.datoDouble();
		/*
		 * Multiplico las ud por el precio. Luego sabiendo ya el preciototal lo
		 * multiplicamos por el descuento (en este caso 3), este paso nos dara el
		 * descuento que se aplicará. Por ultimo para el preciofinal, resto el
		 * preciototal de los productos menos el descuento que he conseguido en la
		 * operacion anterior
		 */
		preciototal = ud * precio;
		des = preciototal * descuen;
		preciofin = preciototal - des;

		System.out.printf("El precio del producto total de %dud de %s es: %.2f€ ", ud, producto1, preciototal);
		System.out.printf("\nAplicandole el descuento, el total definitivo sería: %.2f€", preciofin);
		System.out.printf("\nDescuento realizado de %.2f€", des);
		System.out.println("\nGracias por usar nuestro programa");
	}

}
