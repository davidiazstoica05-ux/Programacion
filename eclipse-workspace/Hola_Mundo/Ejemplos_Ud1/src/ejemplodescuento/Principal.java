package ejemplodescuento;

import ejemploutilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * !!Acordarse siempre de que si el descuento ya esta dividido entre 100 no hace falta dividirlo entre 100 otra vez ni tener un den!!
		 */
		String producto1;
		double  precio,descuen=0.03, preciofin,des,preciototal;
		int ud;
		
		
		System.out.println("Hola buenas este programa le calculara el precio final de su compra, con el descuento incluido.");
		System.out.println("Díga cual es el producto:");
			producto1=Leer.dato();
		System.out.println("¿Cuantas unidades lleva?");
			ud=Leer.datoInt();
		System.out.println("¿Cual es el precio del producto? (como unidad individual) ");
			precio=Leer.datoDouble();
		
			preciototal=ud*precio;
				des=preciototal*descuen;
					preciofin=preciototal-des;
			
		
		System.out.printf("El precio del producto total de %dud de %s es: %.2f€ ",ud,producto1,preciototal);
		System.out.printf("\nAplicandole el descuento, el total definitivo sería: %.2f€", preciofin);
		System.out.printf("\nDescuento realizado de %.2f€",des );
	}
}


