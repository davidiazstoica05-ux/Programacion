package ejercicio2;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Piscina Cuadrada:
		double largo = 50, ancho = 21, profun = 2.5, volumen;
		// Piscina Circular:
		double alto = 1.8, radio = 12, volumen1;
		// Precio
		double m2€ = 1.8, precio, precioC;

		System.out.println("Hola, este programa le ayudara resolver los m2 de su piscina.");

		System.out.println("A continuación, realizaremos los calculos del programa.");
		// Calculo piscina cuadrada:
		volumen = profun * ancho * largo;
		System.out.println("EL volumen de la piscina cuadrada correspende a= " + volumen + "m2");

		// Calculo piscina circular
		volumen1 = Math.PI * Math.pow(radio, 2) * alto;
		System.out.printf("El resultado de la piscina circular es= %.2f", volumen1);
		System.out.println("m2");

		System.out.println("\nAhora realizaremos el precio por metro cuadro por rellenar dichas piscinas ");

		// Calculo precio piscina cuadrada:
		precio = volumen * profun / m2€;
		System.out.printf("\nEl precio de la piscina cuadrada es %.2f€", precio);

		// Calculo precio piscina redonda:
		precioC = volumen1 * alto / m2€;

		System.out.printf("\nEl precio de la piscina redonda es %.2f€ ", precioC);
		System.out.println("\nGracias por usar nuestro programa");

	}

}
