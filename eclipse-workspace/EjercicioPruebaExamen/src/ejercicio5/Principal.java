package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa para gestionar los puntos de fidelidad de un cliente. El
		 * programa debe repetirse hasta que el usuario elija "Salir" (como indican las
		 * normas de los ejercicios de bucles).
		 * 
		 * El programa empieza con una variable puntosSaldo inicializada en 500.
		 * 
		 * Debe mostrar un menú con estas opciones:
		 * 
		 * Acumular Puntos (pide una cantidad de puntos (int) y la suma al saldo).
		 * 
		 * Canjear Puntos (pide una cantidad y la resta al saldo. Importante: debes
		 * comprobar si tiene suficientes puntos. Si intenta canjear 600 puntos teniendo
		 * 500, debes mostrar "Error: Saldo insuficiente" y no realizar la resta).
		 * 
		 * Ver Saldo (muestra los puntos actuales).
		 * 
		 * Salir.
		 * 
		 */

		int opcion, puntoSaldos = 500, puntos, canjear = 0;

		do {
			System.out.println("\nBienvenido al programa de gestion de puntos");
			System.out.println("Pulse 1, si desea acumular puntos");
			System.out.println("Pulse 2, para canjear puntos");
			System.out.println("Pulse 3, para ver saldo");
			System.out.println("Pulse 0 para terminar el programa");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("¿Cúantos puntos vas a acumlar al saldo?");
				puntos = Leer.datoInt();
				puntoSaldos = puntoSaldos + puntos;

				System.out.println("\nNuevo saldo: " + puntoSaldos);

				break;
			case 2:
				System.out.println("\nDi la cantidad de puntos que vas a canjear");
				canjear = Leer.datoInt();
				if (puntoSaldos >= canjear) {
					puntoSaldos-=canjear;
					System.out.println("\nCompra realizada con exito");
					System.out.println("Nuevo saldo: "+puntoSaldos);
				} else {
					System.out.println("\nError no hay suficiente saldo");
				}

				break;
			case 3:
				System.out.println("\nSu saldo actual es de: " + puntoSaldos);
				break;
			default:
				System.out.println("Número incorrecto");
				break;
			}

		} while (opcion != 0);
		System.out.println("Gracias por usar nuestro programa");

	}

}
