package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un array de enteros unidimensional de 8 posiciones. Rellenarlo con
		 * números leídos por teclado y mostrar la media de todos los elementos y la
		 * cantidad de números “cero” introducidos.
		 */
		//Un for para cargar un for para mostrar 
		int tam=8,ocho=8;		
		int[]numeros=new int [tam];
		double total;
		System.out.println("Hola, este programa muestra la media de 8 números");
		                                                           
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Diga el número "+(i+1)+":");
			numeros[i]=Leer.datoInt();
			
		;
			
			 
			
			
		}
	}

}
