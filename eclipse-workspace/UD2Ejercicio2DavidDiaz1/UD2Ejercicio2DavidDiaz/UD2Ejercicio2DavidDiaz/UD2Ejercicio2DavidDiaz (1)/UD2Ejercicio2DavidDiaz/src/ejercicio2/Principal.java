package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leer dos números tipo double. Vamos a dividir el primero entre el segundo y
		 * se debe mostrar un mensaje de error si el segundo es cero ANTES de hacer la
		 * operación. Si se puede hacer, mostrar el resultado con dos decimales.
		 */
		double num1, num2, resultado;

		System.out.println("Hola este programa divide números ");
		System.out.println("Introduzca a continuación el primer número que desea dividir");
		num1 = Leer.datoDouble();
		System.out.println("Introduzca ahora el segundo número");
		num2 = Leer.datoDouble();

		if (num1 == 0 || num2 == 0) {
			System.out.println("ERROR");
		} else {
			resultado = num1 / num2;

			System.out.printf("El resultado de la operacion es:%.2f ", resultado);

		}
		System.out.println("\nGracias por usar nuestro programa");

	}

}


