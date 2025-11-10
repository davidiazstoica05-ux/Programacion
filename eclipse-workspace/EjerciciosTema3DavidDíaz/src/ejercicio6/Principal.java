package ejercicio6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generadora x = new Generadora();
		String quini;

		// Quiniela
		System.out.println("Bienvenido al generador de Quinielas");
		System.out.println("Jornada 13 ");
		for (int i = 0; i < 10; i++) {
			quini = x.mostrarQuiniela(x.generarQuiniela());
			System.out.println("Partido " + (i + 1) + ": " + quini);
		}

		// paroimpar

		System.out.println("\nGenerador de par o impar");
		x.mostrarParOImpar(x.generarParOImpar());

		// Primitiva
		System.out.println("\nPrimitiva: ");
			x.mostrarPrimitiva(x.generarPrimitiva());
			

			}
	

	}


