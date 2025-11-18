package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,numPers,saltos=0,passw=1234;
		double billete=0.35,saldo=0,cambio=0,billeteTotal=0,dineroIntr=0;
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
			//Comprar ticket
			case 1:
				System.out.println("¿Cuántas personas?");
				numPers=Leer.datoInt();
				System.out.println("¿Número de saltos?");
				saltos=Leer.datoInt();
				b.setSaltos(saltos);
				billeteTotal=m.pagarPersona(numPers);
				System.out.printf("El precio del billete total es: %.2f€",billeteTotal);
				System.out.println("Introduzca el importe correspondiente");
				dineroIntr=Leer.datoDouble();
				while (dineroIntr<billeteTotal) {
					System.out.println("El importe introducido debe de ser mayor o igual al precio del billete");
					dineroIntr=Leer.datoDouble();
				}
				cambio=m.devolverDinero(billeteTotal, dineroIntr);
				//Imprimir ticket
				break;
			
			//Zona del operario
			case 2:
				
				
				break;
			default:
				break;
			}
			
		} while (opcion!=0);
		
	}

}
