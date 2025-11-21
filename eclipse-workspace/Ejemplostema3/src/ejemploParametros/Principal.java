package ejemploParametros;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String producto,nombreVendedor ="David";
		//El array se puede rellenar leyendo por teclao, con aleatorio 
		//o como en este ejemplo. 
		
		double precioB,porcentaje=0,totalVenta=0.0, listaImpuesto[]={30.0,42,0,10} ;
		int ref,cant=0;
		boolean refri=true;
		LineaDeVenta lv;
		Producto p; 
		Venta v; //declaración  
		Venta2 v2;
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
	
		//Pedir datos de una venta 
		//ARRAY
		v= new Venta (totalVenta,"Ángel",listaImpuesto);	
		
		
		System.out.println(" Media de impuestos: %.2f \n");
		
		/*esto no 
		v2 =new Venta(); 
		v2.setNombreVendedor(nombreVendedor);*/
		
		v2 = new Venta2(totalVenta, nombreVendedor);
		v2.calcularMedia(listaImpuesto);
		
	}
	
	
}
