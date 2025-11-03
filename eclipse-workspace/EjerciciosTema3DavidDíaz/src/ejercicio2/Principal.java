package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c1;
		double radio, total;

		System.out.println("Bienvenido este programa le dirá el radio de un círculo");
		radio = Leer.datoDouble();
		// instanciamos el círculo
		c1 = new Circulo(radio);

		total = c1.calcularArea();

		System.out.printf("El área total es de: %.2f ", total);
		System.out.println("\nGracias por usar nuestro programa");

	}

}
