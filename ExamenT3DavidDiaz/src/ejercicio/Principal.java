package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hijo listaHijos[];
		GestionFamiliar gF;
		Hijo h;
		int cont = 0, opcion, opcionM, id, horasEstudiadas, edad, tam, horasNuevas;
		double presupuesto, cantidad, porcentaje;
		String nombre;

		System.out.println("Bienvenido al gestor de familia");
		System.out.println("Diga cuantos hijos tiene");
		tam = Leer.datoInt();
		System.out.println("¿Cuál es el presupuesto para las pagas?");
		presupuesto = Leer.datoDouble();
		listaHijos = new Hijo[tam];
		gF = new GestionFamiliar(listaHijos, presupuesto);

		do {
			System.out.println("Diga el nombre del hijo");
			nombre = Leer.dato();
			System.out.println("Diga su número identificativo");
			id = Leer.datoInt();
			System.out.println("Diga su edad");
			edad = Leer.datoInt();
			System.out.println("Diga las horas estudiadas");
			horasEstudiadas = Leer.datoInt();
			listaHijos[cont] = new Hijo(nombre, id, edad, horasEstudiadas);
			System.out.println("Pulse 1 si desea continuar rellenando. \nPulse cualquier otro en caso de que no");
			opcion = Leer.datoInt();
			cont++;
		} while (opcion != 0 && cont < listaHijos.length);

		System.out.println("Cuánto es la cantidad del pago");
		cantidad = Leer.datoDouble();
		System.out.println("Cuál es el porcentaje que se destinara al bote pizzas");
		porcentaje = Leer.datoDouble();

		do {
			System.out.println("Pulse 1 para agregar un nuevo hijo a la lista");
			System.out.println("Pulse 2 para buscar un hijo por su id");
			System.out.println("Pulse 3 para buscar todos los hijos menores de 14 años");
			System.out.println("Pulse 4 para calcular el total de las pagas de los niños mayores de 14 años");
			System.out.println("Pulse 5 para modificar el número de horas estudiadas por un hijo");
			System.out.println("Pulse 6 Para ver el presupuesto restante");
			System.out.println("Pulse 7 para mostrar los datos de todos los hijos");
			System.out.println("Pulse 0 para salir del programa");
			opcionM = Leer.datoInt();

			switch (opcionM) {
			case 1:

				if (cont == listaHijos.length) {
					System.out.println("Lo siento el tamaño esta completo");
				} else {
					System.out.println("Diga el nombre del hijo");
					nombre = Leer.dato();
					System.out.println("Diga su número identificativo");
					id = Leer.datoInt();
					System.out.println("Diga su edad");
					edad = Leer.datoInt();
					System.out.println("Diga las horas estudiadas");
					horasEstudiadas = Leer.datoInt();
					h = new Hijo(nombre, id, edad, horasEstudiadas);
					gF.agregar(h, cont);
					cont++;
					System.out.println("Nuevo hijo introducido con éxito");
					gF.mostrar();
				}

				break;
			case 2:
				gF.mostrarID();
				System.out.println("Introduzca el id del hijo que desea buscar");
				id = Leer.datoInt();
				if (gF.buscarPorId(id) != null) {

					System.out.println("Hijo encontrado: " + gF.buscarPorId(id));

				} else {

					System.out.println("No hay ningun hijo con ese ID");

				}

				break;
			case 3:

				System.out.println("Buscando hijos menores de 14 años...");

				if (gF.buscarMenores14() != null) {
					gF.mostrarMenores(gF.buscarMenores14());
					
				} else {

					System.out.println("No hay hijos menores de 14 años");
				}

				break;
			case 4:
				System.out.printf(" El total que gastará en pagas en los hijos mayores de 14: %.2f\n ",
						gF.calcularPagaMayor14(cantidad, porcentaje));
				break;
			case 5:
				gF.mostrarID();
				System.out.println("Diga el id del hijo que desea cambiar");
				id = Leer.datoInt();
				System.out.println("¿Cuántas son las horas nuevas?");
				horasNuevas = Leer.datoInt();
				if (gF.modificarHorasEstudiadas(id, horasNuevas)) {
					System.out.println("Cambio efectuado correctamente");
					gF.mostrar();
				} else {
					System.out.println("El id introducido no existe, \nIntentelo de nuevo");
				}

				break;
			case 6:
				
				System.out.printf("El presupuesto restante despues de los pagos es de: %.2f\n",gF.restarPresupuesto(gF.sumarTotal(cantidad, cont)));
				break;
			case 7:
				gF.mostrar();

				break;
			case 0:
				System.out.println("Saliendo...");

			default:
				System.out.println("Número érroneo, intentelo de nuevo");
				break;
			}

		} while (opcionM != 0);
		System.out.println("Gracias por usar nuestro programa");

	}

}
