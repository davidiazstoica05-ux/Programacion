package ejercicio1Geminis;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa para una tienda online. Pide el precio de un producto
		 * (double) y la cantidad de unidades que se compran (int).
		 * 
		 * Calcula el total (precio * cantidad). Si el total es menor de 50€, se deben
		 * sumar 4.99€ de gastos de envío. Si es 50€ o más, el envío es gratis.
		 * 
		 * Muestra por pantalla el subtotal (el total sin envío) y el precioFinal (con o
		 * sin gastos de envío).
		 */
		
		System.out.println("Bienvenido, a nuestra tienda Online ");
		double precio,casicinco=4.99,precioF; 
		int ud,cincuenta=50;
		String nombreP;
		
		System.out.println("¿Qué producto ha seleccionado?");
		nombreP=Leer.dato();
		System.out.println("¿Cúantas unidades lleva?");
		ud=Leer.datoInt();
		System.out.println("¿Precio del producto?");
		precio=Leer.datoDouble();
		
		precio=precio*ud;
		
		if (precio<cincuenta) {
			precioF=precio+casicinco;
			System.out.printf("Coste base del producto: %.2f€\nGastos de envios:%.2f€\nPrecio final:%.2f€",precio,casicinco,precioF);
			
		} else { System.out.printf("Coste base del producto: %.2f€\nGastos de envios:Gratis por precio mayor a 50€ \nPrecio final:%.2f€",precio,precio);

		}
		
		
		
		
	}

}
