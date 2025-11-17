package ejemploParametros;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p; //declaración  
		String producto;
		double precioB,porcentaje=0;
		int ref,cant=0;
		boolean refri=true;
		LineaDeVenta lv;
		
		//pido los datos antes de instanciar 
		
		System.out.println("Diga nombre del producto");
		producto=Leer.dato();
		System.out.println("Diga precio del producto");
		precioB=Leer.datoDouble();
		System.out.println("Pulse 1 si esta refrigerado , cualquier otro si no ");
		ref=Leer.datoInt();
		if (ref==1) {
			refri=true;
			System.out.println("Diga el porcentaje");
			porcentaje=Leer.datoDouble();
		} 
		
		
		//Ahora podemos insrtanciar usando el constructor con todos los parámetros
		p=new Producto(producto,refri,precioB) ;
		
		//Ahora llamamos al método calcularPVP
		System.out.printf("El precio final es: %.2f",p.calcularPvp(porcentaje));
		
		//Calculamos el subtotal
		//Necesitamos un objeto línea de venta
		
		System.out.println("¿Cuántos productos llevas?");
		cant=Leer.datoInt();
		//Instanciamos el objeto..
		lv=new LineaDeVenta(p,cant);
		System.out.printf("Subtotal: %.2f",lv.calcularPrecio(porcentaje));
		
		
	
	}
	
	
}
