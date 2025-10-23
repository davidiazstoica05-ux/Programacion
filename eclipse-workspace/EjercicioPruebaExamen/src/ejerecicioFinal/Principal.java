package ejerecicioFinal;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que simule la caja registradora de una tienda. El programa
		 * debe mostrar un menú y repetirse hasta que el usuario elija "Pagar y Salir".
		 * 
		 * El programa debe llevar la cuenta de tres cosas usando variables (sin
		 * arrays):
		 * 
		 * El precioTotal (un acumulador double).
		 * 
		 * La cantidadDeProductos (un contador int de cuántos productos se han añadido).
		 * 
		 * Un contadorProductosCaros (un contador int para un tipo específico de
		 * producto).
		 * 
		 * El menú debe tener estas opciones:
		 * 
		 * Añadir Producto: Pide el precio (double) del producto al usuario.
		 * 
		 * Este precio debe sumarse al precioTotal.
		 * 
		 * El cantidadDeProductos debe aumentar en 1.
		 * 
		 * Importante: Si el precio de este producto es superior a 100€, el
		 * contadorProductosCaros también debe aumentar en 1.
		 * 
		 * Pagar y Salir: El bucle debe terminar.
		 * 
		 * Al pulsar 0 (Pagar y Salir), el programa debe mostrar un resumen final ANTES
		 * de terminar:
		 * 
		 * "Total de productos comprados: [cantidadDeProductos]"
		 * 
		 * "Productos 'caros' (>100€): [contadorProductosCaros]"
		 * 
		 * "Precio medio por producto: [precioTotal / cantidadDeProductos]"
		 * 
		 * "TOTAL A PAGAR: [precioTotal]"
		 */

		int opcion, cantProd = 0,cien=100,contCaro=0;
		double precio, precioN = 0,media,precioT=0;

		System.out.println("bienvenido");
		do {
			
			System.out.println("\nPulse 1 para añadir producto ");
			System.out.println("Pulse 2 para el total de productos comprados");
			System.out.println("Pulse 3 para ver los productos caros ");
			System.out.println("Pulse 4 para ver la media de los productos");
			System.out.println("Pulse 5 para ver el total");
			System.out.println("Pulse 0 para pagar y salir");
			opcion = Leer.datoInt();
			
			switch (opcion) {
			case 1:
				System.out.println("\nDiga el precio del producto: ");
				precio = Leer.datoDouble();
				precioN += precio;
				cantProd++;
				if (cien<=precio) {
					contCaro++;
				} 
				break;
			case 2:
				System.out.println("\nProductos añadidos: " + cantProd);
				break;

			case 3:
				System.out.println("\nProductos caros: "+contCaro);
				break;
			case 4:
				media=precioN/cantProd;
				System.out.printf("\nEl coste medio de los productos es de: %.2f€",media);
				break;

			case 5:
				
				System.out.printf("\nPrecio total actual: %.2f€",precioN);
				
				break;

			case 0:
				System.out.printf("\nTotal a pagar: %.2f€",precioN);
				System.out.println("\nResumen de la compra");
				System.out.println("Productos: "+cantProd);
				System.out.println("Productos caros: "+contCaro);
				System.out.printf("Precio medio: %.2f€",media);
				
				break;

			default:
				System.err.println("Error, número intoducido incorrecto");
				break;
			}

		} while (opcion != 0);

	}

}
