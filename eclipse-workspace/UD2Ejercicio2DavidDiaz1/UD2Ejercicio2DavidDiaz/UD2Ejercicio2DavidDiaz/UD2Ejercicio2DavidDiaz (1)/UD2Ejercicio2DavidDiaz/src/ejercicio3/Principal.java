package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// poner errores en el ej2

		int num, den = 2, resultado;

		System.out.println("Hola, este programa le dira si el número es par o impar ");
		System.out.printf("Introduzca el número:");
		num = Leer.datoInt();

		resultado = num % den;

		if (resultado == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");

		}
		System.out.println("Gracias por usar nuestro programa");

	}

}
