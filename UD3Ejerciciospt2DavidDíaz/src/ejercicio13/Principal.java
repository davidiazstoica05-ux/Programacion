package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Habitacion h;
		Hotel listaHabitacion[];
		Hotel hotel; 
		
		int tam, cont = 0, num,opcion1,opcion;
		String l, o,tipo,nombre;
		boolean ocupada=true, limpieza=true;
		double precio; 

		System.out.println("Bienvenido a su hotel");
		System.out.println("Diga cuantas habitaciones tiene su hotel");
		tam = Leer.datoInt();
		do {

			System.out.println("Diga el número de la habitacion ");
			num = Leer.datoInt();
			System.out.println("Diga el tipo de habitacion que es"); 
			tipo=Leer.dato();
			System.out.println("Diga el precio base de la habitación");
			precio=Leer.datoDouble();
			System.out.println("Diga el nombre del cliente");
			nombre=Leer.dato();
			h=new Habitacion(num, tipo, precio, nombre);
			System.out.println("¿Esta ocupada la habitación? \nPulse x para si o para no");
			o= Leer.dato();
			h.comprobar(o, ocupada);
			System.out.println("¿Esta limpia? \nPulse x para si o para no");
			l=Leer.dato();
			h.comprobarLimpia(l, limpieza);
			cont++;
			listaHabitacion=new Hotel [tam];
			hotel=new Hotel();
			System.out.println("Si deseas terminar pulse 0, cualquier número para seguir");
			opcion1=Leer.datoInt();
			
		} while (opcion1 != 0 && cont < listaHabitacion.length);
		
		hotel.mostrar();
		
		do {
		 System.out.println("Pulse 1 para ver si una habitación esta ocupada");
		 System.out.println("Pulse 2 para Calcular el precio final a pagar");
		 System.out.println("Pulse 3 para ");
		 System.out.println("Pulse 4para ");
		 System.out.println("Pulse 5 para ");
		 System.out.println("Pulse 6 para ");
		 System.out.println("Pulse 7 para ");
		opcion=Leer.datoInt();
		 
			 switch (opcion) {
				case 1:
					System.out.println("Diga el número de la habitación");
					num=Leer.datoInt();
					hotel.buscarPorNum(num);
					if (hotel.comprobar(num)) {
						
						System.out.println("La habitación no esta ocupada");
						
					} else {
						System.out.println("La habitación esta ocupada");
					}
					break;
	
				case 2:
					System.out.println("El cliente ha usado el bar");
					
					
					
								
					break;
					
				case 3:
					
					break;
				case 4:
					
					break;
			default:
				
				System.out.println("Número incorrecto \nIntentelo de nuevo");
				break;
			}
			 
			 
		} while (opcion!=0);

	}

}
