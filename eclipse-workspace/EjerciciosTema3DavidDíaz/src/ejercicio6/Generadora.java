package ejercicio6;

import java.util.Random;

public class Generadora {

	private Random rand = new Random();

	public Generadora() {

	}

	// Quiniela;
	// generarquiniela
	public int generarQuiniela() {

		return rand.nextInt(3);
	}

	// mostrar
	public String mostrarQuiniela(int numA) {
		int dos = 2, uno = 1;
		if (numA == dos) {

			return "2";

		} else if (numA == uno) {
			return "1";

		} else {
			return "x";
		}
	}

	// ParoImpar
	// generar
	public int generarParOImpar() {
		return rand.nextInt(2);
	}

	// Mostrar
	public void mostrarParOImpar(int numA) {

		if (numA == 0) {
			System.out.println("Número par");

		} else {
			System.out.println("Número impar ");

		}

	}

	// Primitiva
	// Generar
	public int generarPrimitiva() {
		return rand.nextInt(49 - 1 + 1) + 1;
	}

	// mostrar
	public void mostrarPrimitiva(int numA) {
		for (int i = 0; i < 6; i++) {
			System.out.printf("%02d", numA);	
		}
			
		
	}

}
