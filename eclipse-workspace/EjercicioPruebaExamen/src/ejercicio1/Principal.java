package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcular el precio por entrar en el cine, pidiendo el número de entradas y el
		 * precio. Pedir el día de la semana y si es miércoles (día del espectador) se
		 * aplicará un porcentaje de descuento leído por teclado al total.
		 */
		
		int ud;
		String diaS,miercoles= "miercoles",Miercoles="Miercoles";
		double precio,descuento,des,total;
		
		System.out.println("Bienvenido a cine Osuna");
		System.out.println("¿Cuantas entradas desea comprar?");
		ud=Leer.datoInt();
		System.out.println("¿Precio de las entradas?");
		precio=Leer.datoInt();
		System.out.println("¿Dia actual de la semana?");
		diaS=Leer.dato();
		
		precio=ud*precio;
		
		if (diaS.equals(miercoles)||diaS.equals(Miercoles)) {
			System.out.println("¿De cuanto es el descuento?");
			descuento=Leer.datoInt();
			
			des=precio*descuento/100;
			total=precio-des;
			
			System.out.printf("\nEl descuento es de: %.2f€ ",des);
			System.out.printf("\nEl precio total es de %.2f€ ",total );
			
			
		}else {System.out.printf("\nEl precio total es de %.2f€ ",precio); 
			
			
		}System.out.println("\nGracias por usar nuestro programa");
		
		
		
		
		
	}

}
