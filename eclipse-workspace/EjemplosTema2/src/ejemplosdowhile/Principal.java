package ejemplosdowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int respuesta;
		do {
			System.out.println("Bienvenido a este programa que muestra un chiste y un refrán");
			System.out.println("Pulse 1 para un chiste");
			System.out.println("Pulse 2 para un refrán");
			System.out.println("Pulse 0 para salir del programa");
			respuesta = Leer.datoInt();
			switch (respuesta) {
			case 0:
				System.out.println("Programa terminado");
				break;
			case 1:
				System.out.println("¿Qué le dice un jardinero a otro? " + "Nos vemos cuando podamos.\n");
				break;
			case 2:
				System.out.println("Consejos vendo y para mi no tengo.\n");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (respuesta != 0);
		System.out.println("Gracias por usar nuestro programa");

	}

}
