package ejercicio9;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion, numeroLoteriaA,numLoteriaU=0;
		Sorteo s1 = new Sorteo();

		System.out.println("Bienvenido a la aplicación de la lotería de Navidad");
		
		do {
			System.out.println("Pulse 1 para seleccionar los números del decimo ");
			System.out.println("Pulse 2 para generar aleatoriamente un decimo");
			System.out.println("Pulse 3 para comprobar si es ganador");
			opcion = Leer.datoInt();
			
			switch (opcion) {
				case 1:
						System.out.println("Elija el número (Entre 00001 y 99999)");
						numLoteriaU=Leer.datoInt();
						s1.mostrar(numLoteriaU);

					break;
				case 2:
					numLoteriaU=s1.generadorAleatorio();
					s1.mostrar(numLoteriaU);
					
					break;
				case 3:		
					numeroLoteriaA=s1.generadorAleatorio();
					s1.mostrarGanador(s1.comprobar(numeroLoteriaA, numLoteriaU));
					System.out.println("Numero ganador: "+numeroLoteriaA);
					break;

				default:
					break;
			}

		} while (opcion != 0);

	}

}
