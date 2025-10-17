package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mostrar en pantalla un menú de un cine con 4 salas y las películas que se
		 * proyectan en cada una. Se debe leer la sala deseada y mostrar: . Un mensaje
		 * con el precio de la entrada, que será diferente en cada sala (por ejemplo,
		 * sala vip, sala 3D, sala normal y sala para niños). b. Pedir el número de
		 * entradas. c. Calcular el precio final y mostrarlo.
		 */

		String normal = "Sala normal", vip = "Sala VIP", kids = "Sala KIDS", tresD = "Sala 3D";
		int sala, entradas;
		double prcSala1 = 5.6, prcSala2 = 8.1, prcSala3 = 7.2, prcSala4 = 6.5;
		double total1, total2, total3, total4;

		System.out.println("Hola, con este programa podrá elejir la sala donde ver la película");
		System.out.println("Diga el número de entradas que desea");
		entradas = Leer.datoInt();
		System.out.printf("Sala 1: \n%S, precio %.2f \nPulse 1 para elejir esta sala ", normal, prcSala1);
		System.out.printf("\nSala 2: \n%S, precio %.2f. \nPulse 2 para elejir esta sala", vip, prcSala2);
		System.out.printf("\nSala 3: \n%S, precio %.2f \nPulse 3 para elejir esta sala", tresD, prcSala3);
		System.out.printf("\nSala 4: \n%S, precio %.2f \nPulse 4 para elejir esta sala", kids, prcSala4);
		System.out.println();
		sala = Leer.datoInt();

		switch (sala) {
		case 1:
			total1 = prcSala1 * entradas;
			System.out.printf("El precio total de %d para la sala %s es de %.2f€", entradas, normal, total1);
			break;
		case 2:
			total2 = prcSala2 * entradas;
			System.out.printf("El precio total de d% para la sala %s es de %.2f€", entradas, vip, total2);
			break;
		case 3:
			total3 = prcSala3 * entradas;
			System.out.printf("El precio total de %d para la sala %s es de %.2f€", entradas, tresD, total3);
			break;
		case 4:
			total4 = prcSala4 * entradas;
			System.out.printf("El precio total de %d para la sala %s es de %.2f€", entradas, kids, total4);
			break;

		default:
			break;
		}
		System.out.println("\nGracias por usar nuestro programa");
	}

}
