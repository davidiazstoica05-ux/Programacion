package ejercicio20;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Haga un programa de la interfaz de un cajero automático. Tendrá las opciones,
		 * ver saldo, retirar dinero, comprar entradas e ingresar dinero. En cada opción
		 * se pedirán los datos necesarios y se realizarán las operaciones adecuadas. El
		 * coste de las entradas se debe restar al saldo de dicha cuenta. La cuenta será
		 * creada por nosotros con un saldo inicial concreto.
		 */

		int respuesta, udEntradas;
		double saldo, entradas, retirar, totalEntradas, ingresar;

		System.out.println("Bienvenidos, a su cajero automático de confianza");
		System.out.println("Diga el saldo de su cuenta");
		saldo = Leer.datoDouble();
		System.out.println("El precio de las entradas");
		entradas = Leer.datoDouble();
 
		do {
			System.out.println("¿Que desea hacer?\n");
			System.out.println("Pulse 1 para ver saldo ");
			System.out.println("Pulse 2 para retirar dinero");
			System.out.println("Pulse 3 para comprar entradas");
			System.out.println("Pulse 4 para ingresar dinero");
			System.out.println("Pulse 0 para salir del programa");
			respuesta = Leer.datoInt();
			switch (respuesta) {
			case 0:
				System.out.println("Programa terminado");
				break;
			case 1:
				System.out.printf("Su saldo es de %.2f\n€", saldo);
				break;
			case 2:
				System.out.println("¿Cuanto dinero desea retirar?");
				retirar = Leer.datoDouble();
				if (saldo < retirar) {
					System.out.println("No hay suficiente dinero en la cuenta");
				} else {
					saldo = saldo - retirar;
					System.out.printf("Nuevo saldo: %.2f€", saldo);
					System.out.println("Puede recoger el importe");
				}
				break;
			case 3:
				System.out.println("¿Cuantas entradas desea comprar?");
				udEntradas = Leer.datoInt();
				totalEntradas = udEntradas * entradas;
				System.out.printf("\nEl total de las entradas es de %.2f€", totalEntradas);
				if (saldo < totalEntradas) {
					System.out.println("\nNo tiene suficiente dinero en la cuenta");
				} else {
					saldo = saldo - entradas;
					System.out.println("\nGracias por su compra ");
				}
				break;
			case 4:
				System.out.println("¿Cuanto dinero va a ingresar?");
				ingresar = Leer.datoDouble();
				saldo = saldo + ingresar;
				System.out.println("El ingreso ha sido exitoso");
				System.out.printf("\nNuevo saldo: %.2f€ ", saldo);
				break;

			default:
				System.err.println("Opcion incorrecta");
				break;
			}

		} while (respuesta != 0);

		System.out.println("Gracias por usar nuestro programa ");
	}

}
