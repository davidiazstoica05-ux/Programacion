package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Implementar un programa que rellene automáticamente un array de enteros con
		 * 10 posiciones, cada elemento debe contener el resultado de multiplicar por
		 * dos un número leído por teclado. Mostrar el resultado por pantalla. ¿Qué
		 * harías para modificar el valor y que no sea siempre el mismo número?
		 */
		int tam=10,dos=2,respuesta;
		int [] numeros= new int [tam];
		
		System.out.println("Bienvenido, este programa multiplicará por 2 el número introducido");
		System.out.println("durante 10 veces");
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println("Diga el número "+ (i+1));
			respuesta=Leer.datoInt();
			numeros[i]=respuesta*dos;
			System.out.println("Si lo multiplicamos por dos es "+numeros[i]);
			
		}
		System.out.println("Gracias por usar nuestro programa");
	}

}
