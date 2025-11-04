package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio, altura;

		System.out.println("Hola, este programa calcula el volumen de un cilindro");
		System.out.println("Diga el radio");
		radio = Leer.datoDouble();
		System.out.println("Diga la altura");
		altura = Leer.datoDouble();
		Cilindro cili = new Cilindro();
		System.out.printf("El volumen del cilindro es: %.2f ", cili.calcularVolumen(altura, radio)); //Tener cuidado con el orden en el que se colocan los parámetros
		System.out.println("Gracias por usar nuestro programa");

	}

}
