package ejemploslitrosam3;

import ejemploutilidades.Leer;

	public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ¡Qué follón! Mi pueblo ha tenido cortes de agua este verano debido a la sequía. Han tenido que abrir 
			pozos. La capacidad de sacar agua de los pozos se cuenta por litros por segundo y la capacidad del 
			depósito para guardar el agua en metros cúbicos. Serías capaz de crear un programa que calcule 
			cuántos metros cúbicos se sacan de uno de los pozos que tiene un caudal de 8 litros por segundo si está 
			conectado 24 horas.
		 */
		
		double m3, caudal, horas,den=1000,total,m3h; 
		int sec=3600;
		
		System.out.println("Bienvenido, este programa le ayudará a calcular cuantos metros cubicos cada 'x' horas salen de los pozos");
		System.out.println("Para comenzar diga cual es el caudal del pozo");
			caudal=Leer.datoDouble();
		System.out.println("¿Cuantas horas estará conectado?");
			horas=Leer.datoDouble();
		
		/*
		 * Pasamos los litros a m3 haciendo: 8L= 1/1000m3 
		 * luego pasamos los m3 a m3h haciendo: m3*sec (antes declaramos los segundos que son 3600)
		 * por ultimo para saber el total sería m3h*horas que vamos a estar sacando agua.
		 */
			m3= caudal/den;
				m3h=m3*sec;
					total=m3h*horas;
		
			
		System.out.printf("El caudal de %.2f es igual a %.3fm3",caudal,m3);	
		
	
		System.out.printf("\nDurante las %.1fh que estará conectado, se sacarán unos %.2fm3",horas,total);
	
	
	}
	
	
	

}

