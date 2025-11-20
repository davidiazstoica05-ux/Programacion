package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion,numPers,saltos=0,passw=1234,passwI,opcion1,opcion2,uno=1;
		double billete=0.35,saldo=0,cambio=0,billeteTotal=0,dineroIntr=0;
		String fecha="18/11/25";
		Billete b=new Billete(billete,saltos,fecha);
		Maquina m=new Maquina(saldo,b,passw);
		
		System.out.println("Bienvenido a Metro Sevilla");
		do {
			System.out.println("¿Qué desea hacer?");
			System.out.println("Pulse 1 para comprar un ticket");
			System.out.println("Pulse 2 para acceder a la zona de operarios");
			System.out.println("Pulse 0 para salir");
			opcion=Leer.datoInt();
			switch (opcion) {
			
			//Comprar ticket
			case 1:
				System.out.println("¿Cuántas personas?");
				numPers=Leer.datoInt();
				System.out.println("¿Número de saltos?");
				saltos=Leer.datoInt();
				b.setSaltos(saltos);
				billeteTotal=m.pagarBillete(numPers);
				b.setPrecio(billeteTotal);
				m.sumarSaldo(billeteTotal);
				System.out.printf("El precio del billete total es: %.2f€",billeteTotal);
				System.out.println("\nIntroduzca el importe correspondiente");
				dineroIntr=Leer.datoDouble();
				while (dineroIntr<billeteTotal) {
					System.out.println("El importe introducido debe de ser mayor o igual al precio del billete");
					dineroIntr=Leer.datoDouble();
				}
				cambio=m.devolverDinero(billeteTotal, dineroIntr);
				System.out.println("Ticket: ");
				//Imprimir ticket
				m.imprimirBillete(cambio, billete, numPers, dineroIntr);
				
				break;
			
			//Zona del operario
			case 2:
				System.out.println("Introduzca la contraseña");
				passwI=Leer.datoInt();
				while (passw!=passwI) {
					System.out.println("Contraseña Incorrecta \nIntentelo de nuevo o pulse 0 para salir");
					passwI=Leer.datoInt();
				}
				
				do {
				System.out.println("Bienvenido a la zona del operario");
				System.out.println("Pulse 1 para ver el saldo de la maquina");
				System.out.println("Pulse 2 para cambiar el precio de lo billetes");
				System.out.println("Pulse 0 para salir");
				opcion1=Leer.datoInt();
				switch (opcion1) {
					case 1:
						System.out.printf("Saldo actual de la maquina: %.2f",m.getSaldo());
						System.out.println("\nPulse 1 para resetear a 0 el saldo");
						System.out.println("Pulse 2 para salir; ");
						opcion2=Leer.datoInt();
						if (opcion2==uno) {
							System.out.println("Introduzca la contraseña:");
							passwI=Leer.datoInt();
							if (m.comprobarContraseña(passwI)) {
								m.setSaldo(0);//Esto esta bien pero es mejor hacerlo en el metodo 
								System.out.println("Saldo reseteado con exito");
							} 
							else {
								System.out.println("Creedenciales erroneos");
							}
						}
						
						break;
					case 2:
						System.out.println("Introduzca la contraseña:");
						passwI=Leer.datoInt();
						if (m.comprobarContraseña(passwI)) {
							System.out.println("¿Que precio desea poner a los billetes?");
							b.setPrecio(Leer.datoDouble());
							System.out.printf("Nuevo precio: %.2f€\n",b.getPrecio());	
						} else {
							
							System.out.println("Creedenciales erroneos");
						}
						break;
						
					case 0 :
						System.out.println("Saliendo...");
						break;
	
					default:
						System.out.println("Seleccion erronea ");
						break;
				}
				

					
				} while (opcion1!=0);
			case 0 :
				System.out.println("Saliendo...");
				break;

			default:
				System.out.println("Seleccion erronea ");
			}
			
		} while (opcion!=0);
		
		System.out.println("Gracias por usar nuestro Servicios");
	} 

}
