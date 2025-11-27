package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movil moviles[];
		Movil venta;
		Vendedor v;
		int opcion, tam, cont = 0, id;
		String marca, modelo;
		boolean nuevo;
		double precio, subtotal = 0, ventaM = 0, suma = 0, porcentaje;

		System.out.println("¿Cuantos moviles tienes?");
		tam = Leer.datoInt();
		moviles = new Movil[tam];
		v = new Vendedor(moviles, subtotal);

		do {
			System.out.println("La marca del movil");
			marca = Leer.dato();
			System.out.println("El modelo");
			modelo = Leer.dato();
			System.out.println("EL precio");
			precio = Leer.datoDouble();
			System.out.println("¿Id asigando?");
			id = Leer.datoInt();
			System.out.println("¿Es nuevo?");
			System.out.println("Pulse 1 si esta nuevo \nPulse cualquier otro si no ");
			nuevo = v.comprobarNuevo(Leer.datoInt());
			moviles[cont] = new Movil(cont, marca, modelo, false, nuevo, precio);
			cont++;
			System.out.println("Para continuar pulse 1.\nSi deseas terminar pulse 0.");
			opcion = Leer.datoInt();
			

		} while (opcion != 0 && cont < moviles.length);

		do {
			System.out.println("Pulse 1 para vender un movil ");
			System.out.println("Pulse 2 para ");
			System.out.println("Pulse 3 para ");
			System.out.println("Pulse 4para ");
			System.out.println("Pulse 5 para ");
			System.out.println("Pulse 6 para ");
			System.out.println("Pulse 7 para ");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				v.mostrar();
				System.out.println("¿Que movil desea vender? Diga su ID");
				id = Leer.datoInt();
				venta = v.findById(id);
				if (v.comprobarVender(id)) {
					System.out.println("¿Cual es el porcentaje de descuento en caso de que el movil fuese antiguo?");
					porcentaje = Leer.datoDouble();
					ventaM = v.venderNuevo(venta, porcentaje);
					System.out.printf("Precio Final: %.2f€\n",ventaM);
					System.out.println("Se ha vendido con exíto");
					suma += ventaM;
					v.setSubTotal(suma);

				} else {
					System.out.println("No existe");
				}

				break;

			case 2:
				System.out.printf("Total recaudado: %.2f€",v.getSubTotal());

				break;

			case 3:
				
				
				System.out.printf("Posible a recaudar %.2f€" );

				break;
			case 4:

				break;
			default:

				System.out.println("Número incorrecto \nIntentelo de nuevo");
				break;
			}
		} while (opcion != 0);

	}
}
