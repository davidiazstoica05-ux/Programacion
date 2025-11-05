package repasoExamenUD2YArrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] calorias;
		int tam, minimo, dia, media=0, suma=0, maximo, uno = 1,porcentaje,cien=100,opcion1;
		int numA, menor = 0, opcion,caloriaDia, nuevaCaloria,caloriasDia, contDia=0,contador = 0;
		
	
	do {
		Random rnd = new Random(System.nanoTime());
		
	
		System.out.println("¿Cúantos días quieres guardar la cantidad de calorías?");
		tam = Leer.datoInt();
		calorias = new int[tam];

		System.out.println("Diga el valor mínimo de calorías");
		minimo = Leer.datoInt();
		System.out.println("Diga el valor maxímo de calorías");
		maximo = Leer.datoInt();

		// generar números aleatorios.
		for (int i = 0; i < calorias.length; i++) {

			calorias[i] = rnd.nextInt(maximo - minimo + 1) + minimo;
		}

		do {
			System.out.println("Pulse 1 para modificar calorías");
			System.out.println("Pulse 2 para mostrar la menor caloría y cúantas veces se repite");
			System.out.println("Pulse 3 para mostrar la tabla de calorías");
			System.out.println("Pulse 4 para calcular la media calorías");
			System.out.println("Pulse 5 para otros datos");
			System.out.println("Pulse 0 para salir");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("¿Qué día quiere modificar?");
				dia = Leer.datoInt();
				while (dia < uno || dia > calorias.length) {
					System.out.println("Día incorrecto\nIntroduzcalo nuevamente");
					dia = Leer.datoInt();
				}

				System.out.println("Diga cuantas calorias desea introducir");
				nuevaCaloria = Leer.datoInt();
				calorias[dia - 1] = nuevaCaloria;
				break;
			case 2:
				menor = calorias[0];
				for (int i = 0; i < calorias.length; i++) {
					if (menor > calorias[i]) {
						menor = calorias[i];
					}
				}
				for (int i = 0; i < calorias.length; i++) {
					if (calorias[i] == menor) {
						contador++;

					} 

				}
				System.out.println("El numero menor de calorías es: " + menor + " \n sale: " + contador + " veces");

				break;
			case 3:
				System.out.println("Día  Calorías");
				for (int i = 0; i < calorias.length; i++) {
					
					System.out.println((i+1)+"\t"+calorias[i]);
				}
				
				
				
				

				break;
			case 4:
				
				for (int i = 0; i < calorias.length; i++) {
					suma+=calorias[i];
				}
				media=suma/calorias.length;
				System.out.printf("La media consumida es de: %.2f",media);
				for (int i = 0; i < calorias.length; i++) {
					if (media<calorias[i]) {
						contDia++;
						
					} System.out.println("Usted ha consumido "+contDia+" dias por debajo de la media");
				}
				
				break;
			case 5: 
				System.out.println("¿Qué día quiere ver?");
				dia = Leer.datoInt();
				while (dia < uno || dia > calorias.length) {
					System.out.println("Día incorrecto\nIntroduzcalo nuevamente");
					dia = Leer.datoInt();
				} 
				
				caloriasDia=calorias[dia-1];
				
				porcentaje=(caloriasDia / media) * cien;
				
				System.out.printf("El porcentaje es de %d%%",porcentaje);

				break;
			case 0:
				System.out.println("Gracias por usar nuestro programa");
				
				break;

			default:
				System.out.println("Número introducido incorrecto");
				break;
			}

		} while (opcion != 0);
		
		System.out.println("¿Desea repetir el programa?");
		System.out.println("Pulse 1 para repetir");
		System.out.println("Pulse 2 para salir");
		opcion1=Leer.datoInt();
	} while (opcion1 !=2);

	} 

}

//He tardado en realizar el examen un poco menos de 55 minutos
