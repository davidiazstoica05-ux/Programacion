package ejercicio6;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  double precio=2.50;
		  double descuen=20.0;
		  double den=100.0;
		  double precioFinal;
		  double des;
		  
		  
		  
		  	/*Hay dos formas 
		  	 * 1.des=precio*descuento/den 
		  	 * 	 precioFinal=precio-des;
		  	 * 
		  	 * 2.precioFinal=precio-(precio*descuen/100);
		  	 */
	
		  
		System.out.println("Hola,calculo de descuentos");
			des=precio*descuen/den;
		System.out.println("Precio original del producto"+precio);
		System.out.printf("Aplicandole el descuento: %.2f",des);
			precioFinal=precio-des;
		System.out.printf("\nEl resultado sería %.2f",precioFinal);
		System.out.println("\nGracias por usar nuestro programa");
		
	}
}
