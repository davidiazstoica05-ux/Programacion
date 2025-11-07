package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			double radio,altura;
			Cilindro c1;
		
			System.out.printf("El volumen del cilindro es: %.2f ", c1.calcularVolumen());
		
		
			System.out.println("\nDiga el radio del cilindro 1 ");
			radio = Leer.datoDouble();
			System.out.println("Diga la altura del cilindro 1 ");
			altura = Leer.datoDouble();
			c1 = new Cilindro(radio,altura);
			System.out.printf("El volumen del cilindro 1 es: %.2f ", c1.calcularVolumen());
			
			System.out.println("\nDiga el radio del cilindro 2 ");
			radio = Leer.datoDouble();
			c1.setRadio(radio);
			System.out.println("Diga la altura del cilindro 2");
			altura = Leer.datoDouble();
			c1.setAltura(altura);
			System.out.printf("El volumen del cilindro 2 es: %.2f ", c1.calcularVolumen());
			
		
		//Forma 2
		System.out.println("\nDiga el radio del cilindro ");
		radio = Leer.datoDouble();
		System.out.println("Diga la altura del cilindro ");
		altura = Leer.datoDouble();
		c1 = new Cilindro(radio,altura);
		System.out.printf("El volumen del primer cilindro es: %.2f ", c1.calcularVolumen());
		
		
	
		System.out.println("\nGracias por usar nuestro programa");

	}
	

}
