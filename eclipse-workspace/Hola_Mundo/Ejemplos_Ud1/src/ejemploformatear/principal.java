package ejemploformatear;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Este ejemplo sirve para saber como poner cuantos decimales quiero.
		double num=1,den=3;
		double resul=0;
		
		
		System.out.println("Ejemplo para formatear");
		
		resul=num/den;
		//Haciendolo de esta forma el número es infinito
		System.out.println("Resultado: "+resul);
	
		//En cambio en esta forma los decimales se ven obligado a solo mostrarse como dos 
		
		/*para dos decimales ponemos %.2f, si quisiesemos tres decimales sería: %.3f 
		 * Siempre se pone printf y al  final se pone el nombre de las varíables, quedando la línea así:
		 * System.out.printf("El numerador es: %.2f y el resultado es %.2f",num,resul);
		
		 * Ejemplos:
		 */
		
		//Para dos decimales 
		System.out.printf("El numerador es: %.2f y el resultado es %.2f",num,resul);
		
		//Para tres
		System.out.printf("El numerador es: %.2f y el resultado es %.3f",num,resul);
		
		
		/* También se puedeb utilizar para formatear otras cosas como por ejemplo: %d:enteros, %s:cadenas, %c:char
		 * Para un ejemplo de como se utiliza en cadenas veáse el ejercicio 9
		 */
		
	}

}
