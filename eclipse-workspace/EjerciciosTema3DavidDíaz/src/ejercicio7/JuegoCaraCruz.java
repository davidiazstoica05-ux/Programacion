package ejercicio7;

import java.util.Random;

public class JuegoCaraCruz {
	/*
	 * Crear un programa que simule el juego de cara o cruz. Para ello, se usarán
	 * los siguientes métodos:
	 * 
	 * Método que simule el lanzamiento de la moneda y resultado. (Nota: Este método
	 * debe generar un aleatorio, por ejemplo 0 ó 1, y devolverlo).
	 * 
	 * Método para comprobar ganador.
	 * 
	 * Se le pasará el número elegido por el jugador (ej: 0 para Cara, 1 para Cruz).
	 * 
	 * Dentro, se generará el aleatorio llamando al método anterior (al método 1).
	 * 
	 * Devuelve true si son iguales (el jugador ha ganado) o false si no.
	 * 
	 * Un método para mostrar en bonito el ganador.
	 * 
	 * Si se le pasa true, debe mostrar un mensaje de ganador.
	 * 
	 * Si se le pasa false, debe mostrar "Siga jugando".
	 * 
	 * En el main, se debe crear lo necesario para simular un juego de cara o cruz
	 * (pedir la apuesta al jugador, llamar al método 2, y pasar el resultado al
	 * método 3).
	 */

	//Lanzar la moneda
	public int lanzar () {
		Random r= new Random();
		
		int numA= r.nextInt(2);
		return numA;
	}
	
	//comprobar
	public boolean comprobar( int numA, int opcion) {
		if (numA==opcion) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	//Moistrar
	public void mostrar(int numA, int opcion) {
		
		if (comprobar(numA, opcion)==true) {
			System.out.println("Enhorabuena ha ganado.");
		}else if (comprobar(numA, opcion)==false) {
			System.out.println("Siga jugando");
		}
		
		
		
		
	}
	
	

}
