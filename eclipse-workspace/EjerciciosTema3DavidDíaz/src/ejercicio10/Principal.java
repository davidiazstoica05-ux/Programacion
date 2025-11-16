package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		Maquina m= new Maquina ();
		Billete b;
		
		System.out.println("Bienvenido a Metro Sevilla");
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("Pulse 1 para comprar un ticket");
			System.out.println("Pulse 2 para acceder a la zona de operarios");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
		
				
				break;
			
			case 2:
				
				break;
			default:
				break;
			}
			
		} while (opcion!=0);
		
	}

}
