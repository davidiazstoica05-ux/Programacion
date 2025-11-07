package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Forma1
		double radio, altura,veces=2;
		Cilindro c1; 

		//forma 1 (No muy buena)
		/*for (int i = 0; i < veces; i++) {
			System.out.println("\nDiga el radio del cilindro ");
			radio = Leer.datoDouble();
			System.out.println("Diga la altura del cilindro ");
			altura = Leer.datoDouble();
			c1 = new Cilindro(radio,altura);
<<<<<<< HEAD
			System.out.printf("El volumen del cilindro "+(i+1)+" es: %.2f ", c1.calcularVolumen());
		}
=======
			System.out.printf("El volumen del cilindro es: %.2f ", c1.calcularVolumen());
		}*/
		
		
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
			
>>>>>>> 5f403d39e69e4ee9df0fe0b227c6bfd3753db4fa
		
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
