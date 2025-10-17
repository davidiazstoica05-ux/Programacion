package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String dependiente,fecha;
		double patatasMed,bebidaMed,mcRoyal;
		double total,entregado,cambio;
		double precioFinPatatas,precioFinBebidas,precioFinMc;
		int udPapas,udBebida,udMCRo;
		
		System.out.println("Bienvenido, este programa realizará su ticket");
		System.out.println("Para acceder al programa diga su nombre");
		dependiente=Leer.dato();
		System.out.println("Fecha en la que se realiza el ticket");
		fecha=Leer.dato();
		System.out.println("¿Cual es el precio de las patatas medianas?");
		patatasMed=Leer.datoDouble();
		System.out.println("¿Cúal es la cantidad?");
		udPapas=Leer.datoInt();
			precioFinPatatas=patatasMed*udPapas;
		System.out.println("¿El precio de la bebida?");
		bebidaMed=Leer.datoDouble();
		System.out.println("¿Cúal es la cantidad?");
		udBebida=Leer.datoInt();
			precioFinBebidas=bebidaMed*udBebida;
		System.out.println("El precio de la hamburguesa");
		mcRoyal=Leer.datoDouble();
		System.out.println("¿La cantidad que llevará?");
		udMCRo=Leer.datoInt();
		precioFinMc=udMCRo*mcRoyal;
		
		total=precioFinPatatas+precioFinBebidas+precioFinMc;
		
		System.out.printf("El precio de los 3 elementos seleccionados asciende a un total de:%.2f",total);
		System.out.println("\n¿Cual es el importe que va a entregar?");
		entregado=Leer.datoDouble();
		cambio=entregado-total;
		System.out.printf("EL cambio corresponde a %.2f€",cambio);
		System.out.println("\nProcederemos a imprimir el ticket:");
		System.out.println("\n\t\t\tMcDonald's");
		System.out.println("****************************************************************");
		System.out.printf("\nLe atendió:%s \t\t\t\tFecha:%s",dependiente,fecha);
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("Pedido:");
		System.out.println("\nProducto  \t\tUD \t\tPrecio \t\tTotal");
		System.out.printf("\nPatatasMed \t\t%d \t\t%.2f€  \t\t%.2f€ ",udPapas,patatasMed,precioFinPatatas);
		System.out.printf("\nMcRoyal \t\t%d \t\t%.2f€ \t\t%.2f€",udMCRo,mcRoyal,precioFinMc);
		System.out.printf("\nBebidasMed \t\t%d \t\t%.2f€ \t\t%.2f€",udBebida,bebidaMed,precioFinBebidas);
		System.out.println("\n--------------------------------------------------------------");
		System.out.printf(" \n\t\t\t\t\tTotal a pagar:  %.2f",total);
		System.out.printf(" \n\t\t\t\t\t Entregado:  \t%.2f",entregado);
		System.out.printf(" \n\t\t\t\t\t Devolucion:  \t%.2f",cambio);
		System.out.println("\n--------------------------------------------------------------");
		System.out.println("\t\tGracias por su visita");
	}

}
