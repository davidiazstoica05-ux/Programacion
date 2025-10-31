package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fecha,nombreAsignatura,aula1; 
		
		Cabecera op = new Cabecera ();
		
		System.out.println("Diga la fecha de hoy");
		fecha=Leer.dato();
		System.out.println("Diga el nombre de la asignatura");
		nombreAsignatura=Leer.dato();
		System.out.println("Diga el número del aula");
		aula1=Leer.dato();
		
		op.rellenar(nombreAsignatura, aula1, fecha);
	}

}
