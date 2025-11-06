package ejercicio5;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase;
		int veces;
		
		
		System.out.println("Diga la frase que desea copiar");
		frase=Leer.dato();
		System.out.println("Diga las veces que va a ser copiado");
		veces=Leer.datoInt();
		Copiado co=new Copiado(frase,veces);
		
		co.copiar();
		
		
		
		
		
		
	}

}
