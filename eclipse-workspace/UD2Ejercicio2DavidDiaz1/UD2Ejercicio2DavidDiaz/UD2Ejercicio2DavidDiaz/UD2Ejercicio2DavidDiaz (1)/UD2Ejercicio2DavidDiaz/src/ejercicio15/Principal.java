package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factor1, diez = 10, producto;
		char opcion = 's';

		System.out.println("\nBienvenido, esté programa le mostrará  la tabla de multiplicar ");
		while (opcion == 's' || opcion == 'S')
			
		{

			System.out.println("Diga el número que desea saber su tabla de multiplicar");
			factor1 = Leer.datoInt();
			System.out.printf("\nTabla de multiplicar del %d:", factor1);
			for (int i = 0; i <= diez; i++) {

				producto = i * factor1;
				System.out.printf("\n%d*%d=%d", factor1, i, producto);
			}
			System.out.println(" ¿Quieres hacer otra multiplicación? (s/n)");
			opcion = Leer.datoChar();
		}

		System.out.println("Gracias por usar nuestro programa");
	}
}
