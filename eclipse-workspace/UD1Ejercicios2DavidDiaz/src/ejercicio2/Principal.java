package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorEnt, doble = 2, triple = 3, resultdob, resultrip, mitad = 2;
		double resultado1;

		System.out.println("Bienvenido al programa que le dirá el doble el triple o la mitad de un número.");
		System.out.println("A continuacion díga el número:");
		valorEnt = Leer.datoInt();
		resultdob = valorEnt * doble;
		System.out.printf("El doble de %d es %d", valorEnt, resultdob);
		resultrip = valorEnt * triple;
		System.out.printf("\nEl tiple de %d es %d", valorEnt, resultrip);
		resultado1 = (double) valorEnt / mitad;
		System.out.printf("\nLa mitad de %d es %.1f", valorEnt, resultado1);
		System.out.println("\nGracias por usar nuestro programa");

	}

}
