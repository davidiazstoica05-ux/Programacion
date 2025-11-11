package ejercicioExamen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String producto;
		Producto p1;
		double precioUd;
		int stock,opcion,stockVenta;
		
		System.out.println("Bienvenido al gestor de inventario");
		System.out.println("Diga el dato del producto");
		producto=Leer.dato();
		System.out.println("Diga el precio por unidad");
		precioUd=Leer.datoDouble();
		System.out.println("Diga el stock disponible: ");
		stock=Leer.datoInt();
		p1 = new Producto();
		
		do {
			System.out.println("Que desea hacer");
			System.out.println("Pulse 1 para consultar producto ");
			System.out.println("Pulse 2 para vender producto ");
			System.out.println("Pulse 3 para reponer stock");
			System.out.println("Pulse 4 para cambiar precio");
			System.out.println("Pulse 5 ver valor total del inventario");
			System.out.println("Pulse 6 para salir");
			opcion=Leer.datoInt();
			switch (opcion) {
				case 1:
					System.out.println("¿Cúanto desea vender?");
					stockVenta=Leer.datoInt();
					p1.mostrar();
					
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
			default:
				break;
			}
			
		} while (opcion !=0);
		
		//Menú de operaciones
		//case 1 Consultar producto
		//case 2 vender producto 
		//case3 Reponer stock 
		//case4Cambiar precio 
		//case 5 Ver valor total del inventario 
		//Case 6 Salir 
		
		
	}

}
