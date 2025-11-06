package ejercicio4;

import java.util.Iterator;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio, altura,veces=2;
		Cilindro c1; 

		for (int i = 0; i < veces; i++) {
			System.out.println("\nDiga el radio del cilindro ");
			radio = Leer.datoDouble();
			System.out.println("Diga la altura del cilindro ");
			altura = Leer.datoDouble();
			c1 = new Cilindro(radio,altura);
			System.out.printf("El volumen del cilindro es: %.2f ", c1.calcularVolumen());
		}
		
		
		
		
		
		 //Tener cuidado con el orden en el que se colocan los parámetros
		System.out.println("\nGracias por usar nuestro programa");

	}

}
