package ejercicio4;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * Rellenar un array unidimensional de 10 posiciones con números aleatorios
		 * entre 1 y 99 y mostrar el número guardado en un lugar que indique el usuario
		 * por teclado. También se debe mostrar la suma de todos y la media
		 */
	
		int tam=10;
		int [] numeros=new int [tam]; 
		Random num=new Random (System.nanoTime());
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			int numeroAleatorio = num.nextInt(100);
				System.out.println("Números aleatorio entre el 0 y el 99");
				System.out.println("El número " + (i+1) + " generado es: "+numeroAleatorio);
				System.out.println("Hay diez huecos disponibles, ¿Donde desea guardarlo?");
				numeros[i]=Leer.datoInt();		
				}
				
			
			
			
		}
	
	}

}
