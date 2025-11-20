package esqueletoMenu;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		
		 System.out.println("Pulse 1 para ");
		 System.out.println("Pulse 2 para ");
		 System.out.println("Pulse 3 para ");
		 System.out.println("Pulse 4para ");
		 System.out.println("Pulse 5 para ");
		 System.out.println("Pulse 6 para ");
		 System.out.println("Pulse 7 para ");
		opcion=Leer.datoInt();
		 do {
			 switch (opcion) {
				case 1:
					
					break;
	
				case 2:
								
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
