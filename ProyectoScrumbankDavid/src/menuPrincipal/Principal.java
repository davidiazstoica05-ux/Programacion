package menuPrincipal;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;

		System.out.println("Bienvenido a nuestro banco online (nombre no definido)");
		// Menu principal
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("Pulse 1 para ingresar dinero ");
			System.out.println("Pulse 2 para sacar dinero");
			System.out.println("Pulse 3 para consultar saldo");
			System.out.println("Pulse 4 para consultar facturas");
			System.out.println("Pulse 5 para un préstamo");
			System.out.println("Pulse 6 para comprar artículos");
			System.out.println("Pulse 7 para contratar una hipoteca");
			System.out.println("Pulse 8 para contratar una tarjeta");
			System.out.println("Pulse 9 para cambiar una divisa");
			System.out.println("Pulse 10 para acceder a los datos bancarios");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:

				break;

			default:
				System.err.println("Error número incorrecto");
				System.out.println("Introduzca uno nuevamente");
				break;
			}

		} while (opcion != 0);
	}

}
