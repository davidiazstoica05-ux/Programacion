package ejercicio13;

import utilidades.Leer;

public class Principalv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero
		 * estilo hotel para que tenga caché. Debemos gestionar mi “minihotel” y para
		 * ello, debemos crear la clase Habitación, una clase Hotel con una lista de
		 * Habitaciones y una clase principal de prueba para probar todo en un menú
		 * (realmente habría algunas clases más, como serían Cliente, Productos, etc.
		 * Pero no entraremos en eso). Una habitación se caracteriza por el número, el
		 * tipo (sencilla, doble o triple), precio base, un String con el nombre del
		 * cliente asignado, si está limpia o no, si está ocupada o no... Podemos poner
		 * todos los métodos en la clase Hotel. El hotel se caracteriza por servicios
		 * extra que ofrece (bar, excursiones y uso de la zona vip). Se podrá hacer lo
		 * siguiente: - Agregar una habitación a la lista. - Ver si está ocupada o no. -
		 * Calcular precio final a pagar según número de días y servicios extra
		 * utilizados. - Imprimir factura. - Aquellos métodos que se quieran añadir.
		 */

		int bar, vip, excur;
		int opcion, tipoHabitacion, o, l, cont = 0, num;
		double precio, barP, vipP, excP;
		boolean limpia;
		boolean ocupada;
		String cliente;
		Habitacion h[] = new Habitacion[6];
		Hotel ht = new Hotel(h, false, false, false);

		do {
			System.out.println("Pulse 1 para agregar ");
			System.out.println("Pulse 2 para reservar una habitación");
			System.out.println("Pulse 3 para ");
			System.out.println("Pulse 4 para ");
			System.out.println("Pulse 5 para ");
			System.out.println("Pulse 6 para ");
			System.out.println("Pulse 7 para ");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Diga el tipo de habitación");
				tipoHabitacion = Leer.datoInt();
				// aquiMEtdo habitacion
				System.out.println("Diga el precio base de la habitación");
				precio = Leer.datoDouble();
				h[cont] = new Habitacion(cont + 1, tipoHabitacion, precio, false);
				cont++;
				break;

			case 2:
				ht.mostrarHabitaciones();
				System.out.println("Diga la habitación que quieres reservar");
				num = Leer.datoInt();
				while (num > 6) {
					System.out.println("El número de habitación no existe, diga una nuevamente");
					num = Leer.datoInt();
				}
				ht.buscarPorNum(num);
				System.out.println("Si quieres ocuparla pulse 1.\n Pulse otro número en caso de no ");
				if (Leer.datoInt() == 1) {
					System.out.println("Diga el nombre del cliente");
					cliente = Leer.dato();
					System.out.println("Desea agregar el bar por un precio de 100€€?");
					System.out.println("Pulse 1 para si");
					System.out.println("Pulse cualquier número para no");
					bar = Leer.datoInt();
					ht.setBar(ht.comprobar(num));
					if (ht.isBar()) {
						barP = 100;
					}

					System.out.println("Desea agregar la zona VIP por un precio de 100€");
					System.out.println("Pulse 1 para si");
					System.out.println("Pulse cualquier número para no");
					vip = Leer.datoInt();
					ht.setZonaVip(ht.comprobar(num));
					if (ht.isZonaVip()) {
						vipP = 100;
					}
					System.out.println("Desea agregar las excursione por un precio de 85€");
					System.out.println("Pulse 1 para si");
					System.out.println("Pulse cualquier número para no");
					excur = Leer.datoInt();
					ht.setExcursion(ht.comprobar(num));
					if (ht.isExcursion()) {
						excP = 100;
					}
					ht.setOcuparHabitacion(num, cliente);
				}
				break;

			case 3:
				
				

				break;
			case 4:

				break;
			default:

				System.out.println("Número incorrecto \nIntentelo de nuevo");
				break;
			}

		} while (opcion != 0);

	}

}
