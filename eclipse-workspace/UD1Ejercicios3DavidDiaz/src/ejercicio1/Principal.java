package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. El precio final de venta de un automóvil nuevo para un comprador es la
		 * suma total de: el coste de fabricación del vehículo, el porcentaje de la
		 * ganancia del vendedor y los impuestos estatales aplicables (sobre el coste de
		 * fabricación). Pedir por teclado la ganancia del vendedor que se quiere en
		 * porcentaje en cada coche, el % de impuesto y el coste de fabricación y
		 * diseñar un programa para calcular el precio final de un automóvil e
		 * imprimirlo por pantalla.
		 */

		String nombrevehiculo;
		double costFabricacion, ganancia, impuestoEstatal, cien = 100;
		double impuestototal, gananciatotal, preciofinal;

		System.out.println("Hola, este programa le ayudará a saber el coste final de la fabricación del vehiculo ");
		System.out.printf("\nNombre del vehículo:");
		nombrevehiculo = Leer.dato();
		System.out.printf("\nPara comenzar introduzca el coste de la fabricacion del vehículo: ");
		costFabricacion = Leer.datoDouble();
		System.out.printf("\nA continuación diga el porcentaje de ganancia que desea obtener: ");
		ganancia = Leer.datoDouble();
		gananciatotal = costFabricacion * ganancia / cien;
		System.out.printf("\nPor ultimo diga el porciento del impuesto estatal que se le aplicará a dicho producto: ");
		impuestoEstatal = Leer.datoDouble();
		impuestototal = costFabricacion * impuestoEstatal / cien;
		preciofinal = impuestototal + gananciatotal + costFabricacion;
		System.out.printf(
				"\nTeniendo en cuenta que el coste de fabricacion del %s es de %.1f€, que desea unas ganancias de un %.1f€",
				nombrevehiculo, costFabricacion, gananciatotal);
		System.out.printf("\ny el impuesto estatal es de %.1f€ el coste final del %s es de %.1f€", impuestototal,
				nombrevehiculo, preciofinal);
		System.out.println("\nGracias por usar nuestro programa ");

	}

}
