package ejemplofor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		int tope;
		System.out.println("Hola escribo todas las veces que quieras.");
		System.out.println("Cuantas veces quiere mostrar la frase");
		tope=Leer.datoInt();
		System.out.println("Que frase quieres escribir");
		frase=Leer.dato();
		
		for (int i = 0; i<tope; i++) {
			System.out.println((i+1)+"-"+frase);
		}
		
	}

}
