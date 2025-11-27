package ejercicio13;

import utilidades.Leer;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean comprobar;
		double precioBase;
		int tam, cont = 0, opcion, numero, tipo, limpieza, ocupado;
		String nombre;
		Hotel listaHabitaciones[];
		Hotel ht;
		Habitacion h;

		System.out.println("Bienvenido a su hotel");
		System.out.println("Diga cuantas habitaciones tiene su hotel");
		tam = Leer.datoInt();
		
		// rellenar todo esto va en el uno

		do {
			System.out.println("Introduzca el nombre del cliente");
			nombre = Leer.dato();
			System.out.println("Diga el número de habitacion");
			numero = Leer.datoInt();
			System.out.println("Diga el tipo");
			// Aqui va un switch
			System.out.println("Diga el precio base de la habitacion");
			precioBase = Leer.datoDouble();
			System.out.println("Pulse 1 si la habitación esta limpia");
			System.out.println("Pulse cualquier otro en caso de no estarlo");
			limpieza = Leer.datoInt();
			h = new Habitacion(numero, null, precioBase, nombre); // pasar nombre como parametro mejor
			h.comprobar(limpieza);
			System.out.println("Pulse 1 si la habitación esta ocupada");
			System.out.println("Pulse cualquier otro en caso de no estarlo");
			ocupado = Leer.datoInt();
			h.comprobarLimpia(ocupado);
			cont++;

			System.out.println("Para continuar pulse 1.\nSi deseas terminar pulse 0.");
			opcion = Leer.datoInt();

		} while (opcion != 0 && cont < listaHabitaciones.length);

		do {
			System.out.printf("----Hotel----");
			System.out.println("Pulse 1 para ver si la habitación esta ocupada o no");
			System.out.println("Pulse 2 para mostrar el precio total de todos los productos");
			System.out.println("Pulse 3 para calcular el PVP");
			System.out.println("Pulse 4 para calcular las posibles ganancias");
			System.out.println("Pulse 5 para saber si el objeto es frágil o no ");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				ht.mostrarHabitaciones();
				System.out.println("Diga el número de la habitación");
				numero = Leer.datoInt();
				comprobar = ht.comprobarOcupacionS(numero);
				if (comprobar) {
					System.out.println("Esta Habitación esta ocupada");
				} else {
					System.out.println("Esta habitación esta disponible");
				}

				break;

			default:
				break;
			}

		} while (opcion != 0);
	}

}
