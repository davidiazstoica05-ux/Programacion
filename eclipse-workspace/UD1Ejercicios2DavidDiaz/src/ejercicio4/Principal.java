package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calcular la edad de una persona en días. Se usará una variable edad cuyo valor leeremos por teclado y 
			mostraremos por pantalla el número de días suponiendo que todos los años tienen 365 días. 
		 */
		
		int edad, dias, años=365; 
		
		System.out.println("Hola, este programa le dirá cualquier edad en días.");
		System.out.println("Introduzca la edad que desea convertir.");
			edad=Leer.datoInt();
			dias=edad*años;
		System.out.printf("%d años pasados a dias sería un total de %d dias.",edad,dias);
		System.out.println("Gracias por utilizar nuestro programa.");
		
	}

}
