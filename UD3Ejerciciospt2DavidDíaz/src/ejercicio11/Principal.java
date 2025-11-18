package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion,tam=0,suspensos=0;
		String materias [];
		double notas [];

		double notaMedia=0;
		Alumno almn=new Alumno ("David","1º DAM",tam); 
		
		
		System.out.println("Bienvenido al gestor de notas");
		do {
			
		
		System.out.printf("Pulse 1 para mostrar todas las notas de %s",almn.getNombre());
		System.out.println("\nPulse 2 para modificar una nota");
		System.out.println("Pulse 3 para calcular la media");
		System.out.println("Pulse 4 para ver el número de suspensos");
		System.out.println("Pulse 0 para salir");
		opcion=Leer.datoInt();
		switch (opcion) {
			case 1:
				
				System.out.println("Cuántas materias son?");
				tam=Leer.datoInt();
				materias=new String [tam];
				notas= new double [tam];
				//Cargar array
				for (int i = 0; i < materias.length; i++) {
					
					System.out.println("Diga el nombre de la materia "+(i+1)+":");
					materias[i]=Leer.dato();
				}
				
				
				
				
				for (int i = 0; i < materias.length; i++) {
					
				}
				
				
			
				break;
			case 2: 
			
				break; 
			case 3: 
				
				break; 
			case 4: 
				
				break;
			case 0: 
				
				break; 
		default:
			break;
		}
		} while (opcion!=0);
	}

}
