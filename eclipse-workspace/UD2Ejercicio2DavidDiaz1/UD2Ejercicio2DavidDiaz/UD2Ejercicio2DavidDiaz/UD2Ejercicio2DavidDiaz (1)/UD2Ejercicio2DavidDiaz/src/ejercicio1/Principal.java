package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1, numero2;

		System.out.println("Bienvenido a nuestro programa");
		System.out.println("Diga el primer número");
		numero1 = Leer.datoInt();
		System.out.println("Diga el segundo número");
		numero2 = Leer.datoInt();

		if (numero1 > numero2) {
			System.out.println("El " + numero1 + "es mayor que" + numero2);
		} else if (numero1 < numero2) {
			System.out.println("El numero 1 es menor ");
		}
	}

}
