package ejercicio9;

import utilidades.Leer;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pasa la capacidad normal a navas (o el pueblo que se ponga)

		int habitantes, capacidad;
		String nombre, nombre2;
		double resultado;

		System.out.println("Bienvenido al programa para comparar la capacidad de un lugar con una ciudad");

		System.out.println("Diga cual es el nombre de su pueblo/ciudad: ");
		nombre = Leer.dato();
		System.out.println("¿Cuantos habitantes tiene?");
		habitantes = Leer.datoInt();
		System.out.println("Diga el nombre de lo que desea comparar");
		nombre2 = Leer.dato();
		System.out.println("¿Cual es la capacidad a lo que desea comparar?: ");
		capacidad = Leer.datoInt();

		// casteamos a doble para que no haya error por ser entera
		resultado = (double) capacidad / habitantes;

		// System.out.println("La capacidad de un "+nombre2+"equivale a "+resultado+"
		// "+nombre);
		// No usamos println, ya que es mejor printf para formatear.

		System.out.printf("\nLa capacidad de un %s equivale a %.2f veces los habitantes de %s", nombre2, resultado,
				nombre);
		System.out.println("Gracias por usar el programa");

	}

}
