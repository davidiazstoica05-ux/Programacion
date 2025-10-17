package pruebaTicket;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dependiente,fecha;
		double precio, patatasMed, bebidasMed, McRoyal;
		int udPatatas, udBebidas,udHamburguesa;
		
		System.out.println("Bienvenido, este programa realizará su ticket ");
		System.out.println("Para acceder diga su nombre de usuario: ");
			dependiente=Leer.dato();
		System.out.println("Fecha en la que se realiza el ticket: ");
			fecha=Leer.dato();
		System.out.println("¿Cual es el precio de las patatas medianas?");
			patatasMed=Leer.datoDouble();
		System.out.println("¿Las unidades que llevará?");
		 	udPatatas=Leer.datoInt();
		 System.out.println("¿Cúal es el precio de la bebida mediana?");
		 	udBebidas=Leer.datoInt();
		 System.out.println("¿Cúal es el precio de la hamburguesa?");
		 	McRoyal=Leer.datoDouble();
		 System.out.println("¿Las unidades que llevará? ");
		 
		
		

	}

}
