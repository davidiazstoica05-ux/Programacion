package ejercicio7;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Rellenar un array unidimensional de int de 20 posiciones (que simulan 20
		 * "premios") con números aleatorios entre 1 y 1000 (el valor del premio).
		 * 
		 * Una vez relleno, el programa debe:
		 * 
		 * Preguntar al usuario su número de boleto (es decir, la posición del array que
		 * quiere consultar, asumiendo que el usuario teclea un número del 1 al 20).
		 * 
		 * Mostrarle qué premio le ha tocado (el valor en esa posición).
		 * 
		 * Mostrar el premio más alto (el valor máximo) de todo el array.
		 */

		int tam = 20, desde = 1, hasta = 1000,menor=0,mayor=0 ;
		int[] numerosA = new int[tam];
		Random r = new Random(System.nanoTime());
		int boleto;

		System.out.println("Bienvenido, este programa entrega un premio");
		
		// cargar array
		for (int i = 0; i < numerosA.length; i++) {
			
			//el desde no puede ser mas pequeño que el hasta
			numerosA[i] = r.nextInt(hasta-desde+1) + desde;

		}
		System.out.println("Diga su número de boleto");
		boleto = Leer.datoInt();

		// mostrar el premio que le ha tocado

		System.out.println("Su premio es: " + numerosA[boleto - 1]);
		
		//mostrar el premio mas alto
		//linea para entrar al for
		mayor=numerosA[0];
		//linea para saber cual es el precio mayor
		for (int i = 0; i < numerosA.length; i++) {
			
			
			if (numerosA[i]>mayor) {
				mayor= numerosA[i];
			}System.out.println("El numero mayor es "+mayor);
			
		}
		
		
	}

}
