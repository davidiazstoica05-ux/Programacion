package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Basado en el Ejercicio 6 de tu PDF)
		 * 
		 * Crear dos arrays paralelos:
		 * 
		 * Un array de String inicializado en la propia definición con 5 nombres de
		 * empleados (Ej: "Ana", "Luis", "Juan", "Sara", "Paz").
		 * 
		 * Un array de int de 5 posiciones (vacío).
		 * 
		 * Rellena el segundo array pidiendo al usuario las horas trabajadas esta semana
		 * por cada empleado (el programa preguntará por las horas de "Ana", luego las
		 * de "Luis", etc.).
		 * 
		 * Al final, mostrar un listado que combine ambos arrays, así: Ana - 40 horas
		 * Luis - 38 horas ...
		 */
		
		
		String [] nombres = {"Juanma","Luisa","Rebeca","Ana","Paz"};
		int tam=5;
		int[]horasT=new int [tam];
		
		
		System.out.println("Bienvenido, este programa le ayuda con las horas trabajadas");
		
		//cargar las horas trabajadas de cada empleado
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Diga las horas trabajadas de "+nombres[i]);
			horasT[i]=Leer.datoInt();
		}
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.printf("%s - %d horas\n",nombres[i],horasT[i]);
			
		}	
	}

}
