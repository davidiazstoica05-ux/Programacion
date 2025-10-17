package ejemplocondicionales;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, mayoria = 18;

		System.out.println("Hola, diga su edad");
		edad = Leer.datoInt();
		if (edad >= mayoria) {
			System.out.println("Puede entrar");
		} else {
			System.out.println("no puedes entrar");
			// } if (condition) {}

			System.out.println("Gracias por usar nuestro programa");
		}

	}
}
