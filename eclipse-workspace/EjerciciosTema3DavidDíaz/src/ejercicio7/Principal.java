package ejercicio7;



import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		JuegoCaraCruz moneda=new JuegoCaraCruz();
		
		System.out.println("Bienvenido al juego de lanzar la moneda");		
		do {
			moneda.lanzar();
			System.out.println("Elija");
			System.out.println("Pulse 1 para cara");
			System.out.println("Pulse 2 para cruz");
			System.out.println("Pulse 0 para salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				moneda.comprobar(moneda.lanzar(), opcion);
				break;
			case 2:
				moneda.comprobar(moneda.lanzar(), opcion);
				break;
			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Número incorrecto");
				break;
			}
			
		} while (opcion!=0);
		
		System.out.println("Gracias por usar nuestro programa");
	}

}
