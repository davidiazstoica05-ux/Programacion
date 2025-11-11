package ejercicio6;

import java.util.Random;

public class Generadora {

	


	// Quiniela;
	// generarquiniela
	public int generarQuiniela() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

	// mostrar
	public void mostrarQuiniela(int numA) {
		int dos = 2, uno = 1;
		if (numA == dos) {

			System.out.println("2");

		} else if (numA == uno) {
			System.out.println("1");

		} else {
			System.out.println("x");
			
		}
	}

	// ParoImpar
	// generar
	public int generarParOImpar() {
		Random rand = new Random();
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
		Random rand = new Random();
		int cincuenta=49,uno=1;
		return rand.nextInt(cincuenta - uno + uno) + uno;
	}

	// mostrar
	public int mostrarPrimitiva() {
		int cincuenta=49,uno=1,numA=0,seis=6;
		for (int i = 0; i < seis; i++) {
			Random rand = new Random();
			numA = rand.nextInt(cincuenta - uno + uno) + uno;
			System.out.printf("%02d", numA);	
		}
			return numA;
		
	}

}
