package ejercicio7;

import utilidades.Leer;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mi coche nuevo consume un montón. Dicen las indicaciones técnicas que 7,5
		 * litros a los 100 km pero no me fío. Realizar un programa que nos ayude a
		 * calcular el dinero gastado en gasolina en un viaje. Para ello, podemos
		 * inicializar una variable con los kilómetros recorridos y otra con el precio
		 * por litro de gasolina
		 */

		double prclitro, km, gasto, consumo;
		int den = 100;

		System.out.println("Hola, este programa ayudara a saber el consumo de un coche");
		System.out.println(
				"En primera instancia, diga el consumo medio del coche \n(No coloque una letra detrás del numero solo el numero, es decir en vez de poner 5 L, ponga solo 5)");
		consumo = Leer.datoDouble();
		System.out.println("¿A cuanto está el precio/l de la gasolina en el momento en el que repostaste o repostarás?");
		prclitro = Leer.datoDouble();
		System.out.println("¿Cuantos Km vas a recorrer?");
		km = Leer.datoDouble();

		System.out.printf("Los datos recogidos son %.2f l, un precio de %.2f €/l y un recorrido de %.2f Km", consumo,prclitro, km);
		gasto = (consumo / den) * km * prclitro;

		System.out.printf("\n\nCon esos datos el precio del viaje ha sido o será de= %.2f €", gasto);
		System.out.println("\nGracias por usar nuestro programa");

	}

}
