package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que calcule el espacio recorrido por un objeto que se
		 * mueve a velocidad constante. El objeto, por ejemplo, zapatilla de una madre
		 * hacia el hijo, ha recorrido un espacio inicial en metros (leído por teclado)
		 * y se mueve a una velocidad constante de 3.2 m/s. Vosotros debéis dar un valor
		 * al tiempo que el objeto está en movimiento.
		 */

		String objeto;
		double velocidad, minutos,km,segundos; 
		double espacioInicial,espacio;
		double sesenta=60,metros=1000;
		
		
		System.out.println("Bienvenido, este programa le dirá el espacio recorrido por un objeto");
		System.out.printf("Diga el nombre del objeto");
		objeto=Leer.dato();
		System.out.printf("\n¿Cúal es el espacio que recorrerá %s?(Introdúzcalo en metros)",objeto);
		espacioInicial=Leer.datoDouble();
		System.out.printf("\n¿A cuánta velocidad irá %s?",objeto);
		velocidad=Leer.datoDouble();
		System.out.println("\n¿Y en cuánto tiempo? (Introdúzcalo en minutos)");
		minutos=Leer.datoDouble();
		segundos=minutos*sesenta;
		
		//tiempoTotal= tiempo*segundos;
		espacio= espacioInicial + velocidad*segundos;
		
		System.out.printf(
				"\nEl objeto %s a la velocidad de %.2f m/s, habiendo ya recorrido %.2fm, a una velocidad constante de %.2f recorrerá un total de:",objeto,velocidad,espacioInicial,segundos);
		System.out.printf("\n%.2fm/s",espacio);
		km=espacio/metros;
		
		System.out.printf("\nSiendo igual a %.2fKm/h",km);
		System.out.println("\nGracias por usar nuestro programa");
	}

}
