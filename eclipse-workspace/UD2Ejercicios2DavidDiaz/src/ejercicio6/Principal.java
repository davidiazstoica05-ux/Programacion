package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Muestra los valores de un array con números double, por ejemplo, precios o
		 * pagos de algo, imprimiendo también la cabecera de dichos valores. Las
		 * cabeceras deben estar en otro array de String, por ejemplo: Enero 1200.55
		 * febrero 2500.45 marzo 800.50
		 */

		double aleatorios, desde = 0, hasta = 5;
		String[] meses;
		int tam ;
		double[] numerosA;
		
		
		
		
		System.out.println("Bienvenido, este programa enseña lista de meses y de números\n\n");
		System.out.println("Diga el tamaño del tamaño de los números aleatorios que quiere generar\n");
		tam=Leer.datoInt();
		numerosA = new double[tam];
		
		System.out.println("Diga cuantos meses son");
		tam=Leer.datoInt();
		meses= new String [tam];
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println("Nombre del mes "+(i+1));
			meses[i]=Leer.dato();
		
		}
		
		// Con este for imprimo los meses que hay en el array ya inicializado
		for (int i = 0; i < meses.length; i++) {
			System.out.printf("%s\t\t", meses[i]);

		}
		System.out.println("");
		// Con este for genero los números aleatorios
		for (int i = 0; i < numerosA.length; i++) {
			// formúla desde-hasta en double
			aleatorios = Math.random() * (desde - hasta) + hasta;
			numerosA[i] = aleatorios;
			
			
		} 
		
		//Con este imprimo 
		for (int i = 0; i < numerosA.length; i++) 
			System.out.printf("%.3f\t\t", numerosA[i]);
		
		System.out.println("\n\n\nGracias por usar nuestro programa");
		
		
		
		//Se puede hacer con un if dentro del for 
	}

}
