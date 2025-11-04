package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fecha, nombreAsignatura, aula1;
		Cabecera c4,c5;

		// Creamos los objetos
		// 1.A cascaporra
		// Con todos los parámetros
		Cabecera c1 = new Cabecera("Programación", "1DAM", "6/11/25");
		// Solo dos parámetros
		Cabecera c2 = new Cabecera("Base de datos", "1DAM"); // Hay que tener cuidado, porque el programa solo mira si
																// el tipo es correcto
		// Vacío
		Cabecera c3 = new Cabecera();

		// 2.Leyendo datos por teclado
		// OJO:SE declaran arriba al prinvipio y se instnacian después
		// de leer los datos.

		System.out.println("Diga la fecha de hoy");
		fecha = Leer.dato();
		System.out.println("Diga el nombre de la asignatura");
		nombreAsignatura = Leer.dato();
		System.out.println("Diga el número del aula");
		aula1 = Leer.dato();

		c4 = new Cabecera(nombreAsignatura, aula1, fecha);
		// Se guarda en el objeto

		// Solo con dos parámetros
		System.out.println("Diga la fecha de hoy");
		fecha = Leer.dato();
		System.out.println("Diga el nombre de la asignatura");
		nombreAsignatura = Leer.dato();
		c5= new Cabecera ("Base de datos", "1DAM");
		
		//Llamada a métodos
		c1.rellenar();
	}

}
