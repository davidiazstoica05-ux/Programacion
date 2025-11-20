package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion,tam=0,suspensos=0,notaMod;
		double notas [];
		String materias[];
		String nombre,curso; 
		double notaMedia;
		Alumno almn;
		GestionDeNotas gn;
		
		System.out.println("Bienvenido al gestor de notas");
		System.out.println("Diga el curso");
		curso=Leer.dato();
		System.out.println("Diga el nombre del Alumno");
		nombre=Leer.dato();
		System.out.println("Cuántas materias son las evaluadas?");
		tam=Leer.datoInt();
		notas= new double [tam];
		almn = new Alumno(nombre, curso, notas);
		materias=new String [tam];
		gn=new GestionDeNotas(almn,materias);
		gn.cargarMaterias();
		gn.cargarNotas();
		
		do {
		System.out.printf("Pulse 1 para mostrar todas las notas de %s",almn.getNombre());
		System.out.println("Pulse 2 para modificar una nota");
		System.out.println("Pulse 3 para calcular la media");
		System.out.println("Pulse 4 para ver el número de suspensos");
		System.out.println("Pulse 0 para salir");
		opcion=Leer.datoInt();
		
		switch (opcion) {
			case 1:
				gn.mostrarNotas();
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
