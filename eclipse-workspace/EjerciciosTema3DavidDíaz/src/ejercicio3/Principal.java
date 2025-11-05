package ejercicio3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		
		
		System.out.println("Hola este programa le dirá si es par o impar");
		System.out.println("Diga el número");
		num1=Leer.datoInt();
		Operaciones op = new Operaciones();
		op.operar(num1);
		System.out.println("Gracias por usar nuestro programa");
		
		
		
		
	}

}
