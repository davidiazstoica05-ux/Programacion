package ejercicio;


import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// hasta+desde+1)-desde
		int tam, hasta = 0, desde = 0, numA, opcion = 0;
		int menor = 0, menorCal = 0, caloriasD = 2200, contCaloD = 0;
		int[] calorias;
		double suma = 0, media = 0;
		Random rnd = new Random(System.nanoTime());

		do {

			System.out.println("Bienvenido al programa cuenta calorias");

			System.out.println("Cúantos días quiere guardar la cantidad de calorías");
			tam = Leer.datoInt();
			calorias = new int[tam];

			System.out.println("Cúal es el mínimo de calorías");
			desde = Leer.datoInt();

			System.out.println("Cúal es el máximo de calorías ");
			hasta = Leer.datoInt();

			// generar núm aleatorios
			for (int i = 0; i < calorias.length; i++) {
				numA = rnd.nextInt(desde + hasta - 1) - desde;
				calorias[i] = numA;
			}
		
				System.out.println("\n\n\t\t-------Menú CuentaCalorías-----");
				System.out.println("Pulse 1 para modificar calorías");
				System.out.println(
						"Pulse 2 para mostrar el menor número de calorías y cuántas veces se ha ingerido esa cantidad");
				System.out.println("Pulse 3 para mostrar las calorías de cada día");
				System.out.println("Pulse 4 para mostrar la media de calorías tomas al día");
				System.out.println("Pulse 5 para mostrar la media díaria recomendada");
				System.out.println("Pulse 0 para salir");
				opcion = Leer.datoInt();
				do {
				switch (opcion) {
				case 1:
					// cargar

					break;

				case 2:

					for (int i = 0; i < calorias.length; i++) {
						menor = calorias[0];
						if (menor <= calorias[i]) {
							menor = calorias[i];
							menor = menorCal++;
							
						}System.out
						.println("El menor número de calorías: " + menor + "Ha sido ingerida: " + menorCal);

					}

					break;
				case 3:
					System.out.println("Dia     Calorías");
					for (int i = 0; i < calorias.length; i++) {

						System.out.println((i + 1) + " \t" + calorias[i]);
					}

					break;
				case 4:

					// calculos
					for (int i = 0; i < calorias.length; i++) {
						suma += calorias[i];
						media = suma / tam;
					}
					System.out.printf("La media de calorías consumidas por dias es de: %.2f", media);
					break;
				case 5:

					for (int i = 0; i < calorias.length; i++) {
						if (caloriasD <= calorias[i]) {
							contCaloD++;
							System.out.println("Has ingerido menos de " + caloriasD + " " + contCaloD + " días");
						} else {
							System.out.println("No has consumido menos de " + caloriasD + " ningún día");
						}

					}
					for (int i = 0; i < calorias.length; i++) {
						System.out.println("Elija un dia para calcular el porcentaje de calorías");
						// dia=Leer.datoInt();
					}

					break;
				case 0:
					System.out.println("Gracias por usar nuestro programa");

					break;

				default:
					System.out.println("Error, intentelo de nuevo");
					break;
				}

			} while (opcion != 0);
		} while (opcion == 0);

	}

}
