package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String planeta1 = "Mercurio", planeta2 = "Venus", planeta3 = "Tierra", planeta4 = "Marte", planeta5 = "Júpiter",
				planeta6 = "Saturno", planeta7 = "Urano", planeta8 = "Neptuno";
		int opcion, lenguaje;
		double masa, peso, gMercurio = 0.38, gVenus = 0.91, gTierra = 1.00, gMarte = 0.38, gJupiter = 2.53,
				gSaturno = 1.06, gUrano = 0.92, gNeptuno = 1.2;

		System.out.println("Hola, cálculo peso en planetas.");
		System.out.println("Diga su masa corporal en Kg");
		masa = Leer.datoDouble();
		System.out.println("Y ahora el planeta donde conocer su peso");
		System.out.printf("Pulse 1 para ver tu peso en %s\n",planeta1);
		System.out.println("Pulse 2 para ver tu peso en Venus");
		System.out.println("Pulse 3 para ver tu peso en la Tierra");
		System.out.println("Pulse 4 para ver tu peso en Marte");
		System.out.println("Pulse 5 para ver tu peso en Júpiter");
		System.out.println("Pulse 6 para ver tu peso en Saturno");
		System.out.println("Pulse 7 para ver tu peso en Urano");
		System.out.println("Pulse 8 para ver tu peso en Neptuno");
		opcion = Leer.datoInt();
		// Opcion solo es el nombre de una var, no es booleana.
		switch (opcion) {
		case 1:
			peso = masa * gMercurio;
			System.out.println("¿Quiere el resultado en ingles o español?");
			System.out.println("Pulse 1 para Español, 2 para ingles ");
			lenguaje = Leer.datoInt();
			switch (lenguaje) {
			case 1:// Español.
				System.out.printf("Su peso en %s es= %.2fKg", planeta1, peso);
				break;
			case 2:// Ingles.
				System.out.printf("Your weight at %s is= %.2fKg", planeta1, peso);
				break;
			default:
				System.out.println("Opcion de idioma incorrecta.");
				break;
			}
			break;
		case 2:
			peso = masa * gVenus;
			System.out.printf("Su peso en %s es %2.f NKg",planeta2, peso);
			break;
		case 3:
			peso = masa * gTierra;
			System.out.printf("Su peso en la %s es %2.f NKg",planeta3, peso);
			break;
		case 4:
			peso = masa*gMarte;
			System.out.printf("Su peso en %s es %2.f NKg",planeta4,peso);
			break;
			
		case 5:
			peso=masa*gJupiter;
			System.out.printf("Su peso en %s es %.2f NKg",planeta5, peso);
			break;
		case 6:
			peso = masa*gSaturno;
			System.out.printf("Su peso en %s es %.2f NKg", planeta6, peso);
		case 7:
			peso = masa*gUrano;
			System.out.printf("Su peso en %s es %.2f NKg", planeta7, peso);
			break;
		case 8:
			peso = masa*gNeptuno;
			System.out.printf("Su peso en %s es %.2f NKg", planeta8, peso);
			break;
		default:
			System.out.println("Opcion inválida");
			break;
		}

	}

}
