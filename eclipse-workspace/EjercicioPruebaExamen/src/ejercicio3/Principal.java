package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Haz un programa para la caja de un parking. Muestra un menú con 3 tipos de
		 * vehículos:
		 * 
		 * Coche
		 * 
		 * Moto
		 * 
		 * Furgoneta
		 * 
		 * Pide al usuario que elija una opción (un número 1, 2 o 3).
		 * 
		 * Si elige Coche (1), el precio es 0.04€/minuto.
		 * 
		 * Si elige Moto (2), el precio es 0.02€/minuto.
		 * 
		 * Si elige Furgoneta (3), el precio es 0.05€/minuto.
		 * 
		 * Una vez elegido el tipo, el programa debe pedir el número de minutos (int)
		 * que ha estado estacionado.
		 * 
		 * Calcula y muestra el precioTotal a pagar (con 2 decimales). Si el usuario
		 * introduce una opción de vehículo no válida (ej. 4), debe mostrar
		 * "Error: tipo de vehículo incorrecto".
		 */

		int opcion, minutos;
		double precio, coche = 0.2;

		System.out.println("Bienvenido a nuestro parking ");
		System.out.println("Seleccione que vehículo va ser aparcado");
		System.out.println("Pulse 1 para un coche, el precio es de:");
		System.out.println("Pulse 2 para una furgoneta, el precio es de:");
		System.out.println("Pulse 3 para una moto, el precio es de:");
		System.out.println("Pulse 0 para acabar el programa");
		opcion = Leer.datoInt();

		switch (opcion) {
		case 1:
			System.out.println("¿Cúantos minutos ha estado estacionado? ");
			minutos = Leer.datoInt();
			precio = minutos * coche;
			System.out.printf("\nPrecio es igual a: %.2f€", precio);

			break;
		case 2:

			break;
		case 3:

			break;
		default:
			break;
		}

	}

}
