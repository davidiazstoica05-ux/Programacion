package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,numPers,saltos=0,passw=1234;
		double billete=0.35,saldo=0,cambio=0;
		String fecha="18/11/25";
		Billete b=new Billete(billete,saltos,fecha);
		Maquina m=new Maquina(saldo,b,passw);
		
		System.out.println("Bienvenido a Metro Sevilla");
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("Pulse 1 para comprar un ticket");
			System.out.println("Pulse 2 para acceder a la zona de operarios");
			opcion=Leer.datoInt();
			switch (opcion) {
			case 1:
				
				System.out.println("Persona");
				numPers=Leer.datoInt();
				System.out.println("Saltos");
				saltos=Leer.datoInt();
				System.out.println(m.pagarPersona(numPers));
				System.out.println("Cambio");
				
				
				
				
				
				break;
			
			case 2:
				
				
				break;
			default:
				break;
			}
			
		} while (opcion!=0);
		
	}

}
