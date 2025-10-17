package ejercicio12;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Imprime por pantalla un ticket de una tienda. El empleado se llama “John Snow” y el cliente ha 
			comprado 4 latas de Coca Cola a 1.20 €, una bolsa de pipas de 0.40 € y una espada llamada “Garra” 
			que cuesta 150 €. No hace falta calcular le devolución de la compra, pero puedes hacerlo si pides 
			cuánto dinero entrega el cliente para pagar. 
		 */

		String producto1, producto2, producto3,usuario,fecha; 
		int cant1,cant2,cant3;
		double total1, total2, total3,prec1, prec2, prec3, entregado, devuelto, total0; 
		
		//Producto1
		System.out.printf("Nombre del usuario:");
			usuario=Leer.dato();
		System.out.println("Fecha de hoy: ");
			fecha=Leer.dato();
		System.out.println("Díga el nombre del producto");
			producto1=Leer.dato();
		System.out.println("la cantidad que llevas");
		 	cant1=Leer.datoInt();
		System.out.println("El precio del producto como unidad individual");
			prec1=Leer.datoDouble();
		//Producto2
		System.out.println("Díga el nombre del segundo producto");
			producto2=Leer.dato();
		System.out.println("la cantidad que llevas");
			cant2=Leer.datoInt();
		System.out.println("El precio del producto como unidad individual");
			prec2=Leer.datoDouble();
		//Producto3 
		System.out.println("Díga el nombre del tercer producto");
			producto3=Leer.dato();
		System.out.println("la cantidad que llevas");
		 	cant3=Leer.datoInt();
		System.out.println("El precio del producto como unidad individual");
			prec3=Leer.datoDouble();
		
		total1= cant1*prec1;
		total2=cant2*prec2;
		total3=cant3*prec3;
		total0=total1+total2+total3;
		
		System.out.printf("El total de la compra es de: %.2f€", total0);
		System.out.println("\nCuanto va a pagar?");
			entregado=Leer.datoDouble();
			devuelto=entregado-total0;	
		System.out.println("Su ticket a continuacion: ");
		System.out.println("Le atendió :"+usuario+"      Fecha de compra:"+fecha);
		System.out.println("\t\nTienda SalesTriana.");
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.printf("PRODUCTO \tUNIDADES \tP/U \tSUBTOTAL");
		System.out.printf( "\t\n%s \t%d \t%.2f€ \t%.2f€  ",producto1,cant1,prec1,total1);
		System.out.printf( "\t\n%s \t\t%d \t\t%.2f€ \t%.2f€ ",producto2,cant2,prec2,total2);
		System.out.printf( "\t\n%s \t\t%d \t\t%.2f€ \t%.2f€ ",producto3,cant3,prec3,total3);
		System.out.printf("\n\n\t\t\t  Importe total %.2f€ ", total0);
		System.out.println("\n----------------------------------------------------------------------------------------");
		System.out.printf("\n\t\t\t\t ENTREGADO     %.2f€ ",entregado);
		System.out.printf("\n\t\t\t\t DEVOLUCION    %.2f€",devuelto);
		System.out.println("\nGracias por su visita");
	}

}
