package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un array de tipo String, inicializarlo en la propia definición con el
		 * nombre de 5 personas y mostrarlo por la pantalla mediante un bucle for.
		 */
		
		String [] nombres = {"Thiago","David","Claudia","Currete","Ana" };
		
		System.out.println("Hola este programa le dira 5 nombres");
		System.out.println("Los nombres son los siguientes");
		for (int i = 0; i < nombres.length; i++) {
			//Siempre se debe de poner detras del array [i] para que no 
			//coja la posicion de la memoria 
			System.out.printf("\nnombre %d: %s",(i+1),nombres[i]);
			
		}
		
	}

}
