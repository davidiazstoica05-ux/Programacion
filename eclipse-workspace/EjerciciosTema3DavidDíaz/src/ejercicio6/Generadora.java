package ejercicio6;

import java.util.Random;

public class Generadora {

	// Quiniela;

	public int generarQuiniela() {
		
		Random r = new Random();
		int numA = r.nextInt(3);
		
		return numA;

	} 
	
	public void mostrarQuiniela (int numA) {
		int dos=1,uno=0;
		if (numA == dos) {
			
			System.out.println("1");
			
		}else if (numA==uno) {
			
			System.out.println("0");
			
		} else {
			
			System.out.println("X");
		}
	}

}
