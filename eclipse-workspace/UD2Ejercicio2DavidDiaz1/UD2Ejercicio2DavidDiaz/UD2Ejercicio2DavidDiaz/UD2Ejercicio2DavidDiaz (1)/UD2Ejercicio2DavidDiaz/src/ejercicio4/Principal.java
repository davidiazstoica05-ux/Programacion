package ejercicio4;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leer un namer que será la cantidad de dinero que una persona quiere retirar de su cuenta 
		 *bancaria. Mostrar un mensaje diciendo que “no es posible” si la cantidad que se quiere retirar 
		 *es mayor que el saldo de la cuenta y el nuevo saldo si se ha podido retirar. 
		 */
		double retirada,cantDinero,nuevoSaldo;
		System.out.println("Hola, este programa le dirá si tiene suficiente saldo en su cuenta bancaria para retirarlo");
		System.out.println("Diga cuanto dinero tiene en su cuenta: ");
		cantDinero=Leer.datoDouble();
		System.out.println("Diga cuanto dinero desea retirar");
		retirada=Leer.datoDouble();
		nuevoSaldo=cantDinero-retirada;
		
		if (retirada<=cantDinero) {
			System.out.println("Puede retirar el dinero");
			System.out.printf("Saldo restante %.2f€",nuevoSaldo);			
		}else System.out.println("No dispone de suficiente saldo");
		System.out.println("\nGracias por usar nuestro programa");
	} 

}
