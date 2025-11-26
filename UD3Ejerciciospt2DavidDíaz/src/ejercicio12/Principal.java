package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre, nombreT;
		int cont = 0, tam = 0, id = 0, cantidad, sumar = 1;
		int opcion, opcion1, opcionMenu, seleccionar;
		Producto listaP[];
		Producto p;
		Tienda t;
		double precio=0.0, porcentaje;

		System.out.println("Bienvenido a su inventario de tiendas");
		System.out.println("Para empezar diga el nombre de su tienda");
		nombre = Leer.dato();
		System.out.println("Cuantos elementos vas a introducir");
		tam = Leer.datoInt();
		listaP = new Producto[tam];
		// rellenar
		do {
			System.out.println("Diga el nombre del producto " + sumar);
			nombre = Leer.dato();
			System.out.println("Diga el precio del producto " + nombre);
			precio = Leer.datoInt();
			System.out.println("Diga la cantidad del producto " + nombre);
			cantidad = Leer.datoInt();
			System.out.println("Diga el ID del producto" + nombre);
			id = Leer.datoInt();
			p = new Producto(nombre, precio, cantidad, id);
			System.out.println("Pulse 1 si el producto es fragil");
			System.out.println("Pulse 2 si no lo es");
			opcion1 = Leer.datoInt();
			p.comprobar(opcion1);
			System.out.println(p);
			t = new Tienda(nombre, listaP);
			t.agregar(p, cont);
			cont++;
			sumar++;
			System.out.println("Para continuar pulse 1.\n Si deseas terminar pulse 0.");
			opcion = Leer.datoInt();
		} while (opcion != 0 && cont < listaP.length);
		
		//Menú
		do {
			System.out.println("---MENÚ---");
			System.out.println("Pulse 1 para mostrar todos los productos del inventario ");
			System.out.println("Pulse 2 para mostrar el precio total de todos los productos");
			System.out.println("Pulse 3 para calcular el PVP");
			System.out.println("Pulse 4 para calcular las posibles ganancias");
			System.out.println("Pulse 0 para salir");
			opcionMenu = Leer.datoInt();

			switch (opcionMenu) {
			case 1:
				t.mostrar();
				break;

			case 2:
				System.out.printf("La inversión total en productos es: %.2f€\n", t.sumar());
				break;

			case 3:
				t.mostrarID();
				System.out.println("Diga el ID del producto que desea calcular su pvp");
				id = Leer.datoInt();
				System.out.println("¿Cuánto es el porcentaje del PVP?");
				porcentaje = Leer.datoDouble();
				System.out.printf("%.2f€\n", t.calcularPVP(t.buscarByID(id), porcentaje));
			case 4:

				break;
			case 0:
				System.out.println("Saliendo...");

				break;
			default:
				System.out.println("Número incorrecto \nIntentelo de nuevo");
				break;
			}

		} while (opcionMenu != 0);

	}

}
