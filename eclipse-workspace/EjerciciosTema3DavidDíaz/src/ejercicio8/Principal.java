package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, ingreso = 0, retirar =0;
		double saldo = 0,dolar=1.08;
		String nombreTitular;
		CuentaCorriente cc;

		System.out.println("Diga el nombre del titular de la cuenta");
		nombreTitular = Leer.dato();
		cc = new CuentaCorriente( nombreTitular);

		do {
			System.out.println("Pulse 1 para ingresar dinero");
			System.out.println("Pulse 2 para retirar dinero");
			System.out.println("Pulse 3 para calcular el saldo en dólares Americanos");
			System.out.println("Pulse 4 para consultar el saldo disponible");
			System.out.println("Pulse 0 para acabar el programa");
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				System.out.println("¿Cúanto dinero desea ingresar?");
				ingreso = Leer.datoInt();
				System.out.println("Ingreso exitoso. \nNuevo saldo: " + cc.ingresar(ingreso) + "€");
				break;

			case 2:
				System.out.println("¿Cúanto dinero desea retirar?");
				retirar = Leer.datoInt();
				cc.retirar(retirar);
				if (cc.retirar(retirar)) {
					System.out.println("Retirada exitosa");
					cc.consultar();
				}else {
					System.out.println("Error, saldo insuficiente");
					cc.consultar();
				}
				break;
			case 3:
				
				System.out.println("Su saldo en dolares americanos es: "+cc.cambiar(dolar)+"€");
				
				break;
			case 4: 
				cc.consultar();

				break;
			
			case 0: 
				System.out.println("Saliendo...");

				break;
			
				
			default:
				System.out.println("Número erroneo \nIntentelo de nuevo");
				break;
			}

		} while (opcion != 0);
		System.out.println("Gracias por usar nuestro programa");

	}

}
