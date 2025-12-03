package examenB;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor profesores[];
		Administracion a;
		Profesor p;
		String nombre, apellido;
		int id, antiguedad, horas;
		double total, sueldo, impuesto;
		int opcion, tam, cont = 0;

		System.out.println("Bienvenido a la gestión de sueldos");
		System.out.println("¿Cuántos profesores tienes?");
		tam = Leer.datoInt();
		profesores = new Profesor[tam];
		System.out.println("¿Cuánto es el total disponible?");
		total = Leer.datoDouble();
		a = new Administracion(profesores, total);

		do {
			System.out.println("Pulse 1 para agregar un profesor a la lista");
			System.out.println("Pulse 2 para buscar a partir de su id");
			System.out.println("Pulse 3 para calcular el gasto en nóminas");
			System.out.println("Pulse 4 para comprobar sueldo");
			System.out.println("Pulse 5 para modificar el número de horas trabajadas por un profesor");
			System.out.println("Pulse 6 para calcular cuánto queda del presupuesto después de pagar todos los sueldos");
			System.out.println("Pulse 7 para mostrar todos los datos de todos los profesores");
			System.out.println("Pulse 8 para buscar a partir de sus años");
			System.out.println("Calcular el procentaje del gasto total");
			System.out.println("Pulse 0 para salir");

			a.mostrarTodos();
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("Diga el nombre del profesor");
				nombre = Leer.dato();
				System.out.println("Diga el apellido");
				apellido = Leer.dato();
				System.out.println("Diga el id");
				id = Leer.datoInt();
				System.out.println("Diga los años de antiguedad");
				antiguedad = Leer.datoInt();
				System.out.println("Diga el número de horas");
				horas = Leer.datoInt();
				p = new Profesor(nombre, apellido, id, antiguedad, horas);
				a.agregarProfesor(p, cont);
				cont++;
				a.mostrarTodos();
				break;

			case 2:
				a.mostrarID();
				System.out.println("Diga el id que desea seleccionar");
				id = Leer.datoInt();
				a.mostrar(id);
				break;

			case 3:

				System.out.println("Diga cuanto cobra por hora");
				sueldo = Leer.datoDouble();
				System.out.println("Diga el porcentaje de impuesto");
				impuesto = Leer.datoDouble();
				System.out.println("¿A partir de cuantos años quiere buscar?");
				antiguedad = Leer.datoInt();
				a.calcularGastosNominas(antiguedad, sueldo, impuesto, cont);

				break;
			case 4:

				break;

			case 5:

				break;

			case 6:

				break;
			case 7:
				break;
			case 8:

				System.out.println("¿A partir de cuantos años quieres probar?");
				antiguedad = Leer.datoInt();
				a.findByAnyos(antiguedad, cont);

				break;
			case 0:
				break;

			default:
				break;
			}

		} while (opcion != 0);

	}

}
