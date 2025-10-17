package ejemploscondicionales;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Estructura IF con doble condicion (con && y|| ) Se puede poner más de una
		 * condición después del if, poniendo "&&" significa que todas las condiciones
		 * tienen que cumplirse EJ:
		 */

		int num1 = 4, num2 = 9, num3 = 7;

		if (num3 > num1 && num3 < num2) {
			System.out.println(num1 + " es menor que " + num3 + " que es menor que " + num2);

			/*
			 * En cambio, si colocamos ||, significa que solo una de las condiciones tiene
			 * que cumplirse
			 */

			int num5 = 5;
			int num4 = 21;
			if (num5 > num4) {
				System.out.println("El número mayor es " + num5); // podrían ir más
				// sentencias
			} else { // Ojo, aquí en el else, ya no va ninguna condición(salta solo si no da la
						// condicion de arriba)
				// Esta ya no se imprime siempre como en los if simples
				System.out.println("El número mayor es " + num4);
				
				//EJEMPLO COMPLETO CON IF ELSE AND IF ELSE
				int edad = 18, mayoria=18, conducir=16, infantil=10; 
				if (edad >= mayoria){ 
				System.out.println ("Tienes 18 o más."); 
				} 
				else if (edad >= conducir){ 
				 
				System.out.println (
						"Puedes conducir en EE.UU pero seguro que tienes menos de 18." ); 
				 } else if (edad >= infantil){ 
				 
				System.out.println ("Tienes 10 años o más pero menos de 16."); 
				 } else { 
				System.out.println ("Eres un crío."); 
				 } 
				} 
				} 


			}

}
