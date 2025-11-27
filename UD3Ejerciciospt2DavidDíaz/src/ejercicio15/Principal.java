package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente listaCliente[];
		Gimnasio g;
		Cliente c; 

		int tam, edad, cont = 0, opcion;
		double peso, altura;
		boolean activo;
		String nombre, dni, apellido;

		System.out.println("Diga cuantos clientes tiene");
		tam = Leer.datoInt();
		listaCliente = new Cliente[tam];
		g = new Gimnasio(listaCliente);
		do {

			System.out.println("Diga el DNI del cliente ");
			dni = Leer.dato();
			System.out.println("Diga el nombre");
			nombre = Leer.dato();
			System.out.println("Diga el apellido");
			apellido = Leer.dato();
			System.out.println("Diga la edad");
			edad = Leer.datoInt();
			System.out.println("Pulse 1 si esta activo");
			System.out.println("Pulse otro en caso de ser no");
			if (Leer.datoInt() == 1) {
				activo = true;
			} else {
				activo = false;
			}
			System.out.println("Diga el peso");
			peso = Leer.datoDouble();
			System.out.println("Diga la altura");
			altura = Leer.datoDouble();
			listaCliente[cont] = new Cliente(dni, nombre, apellido, activo, edad, peso, altura);
			cont++;
			System.out.println("Si desea seguir rellenando pulse 1. \nEn caso de que no pulse cualquier otro");
			opcion = Leer.datoInt();
		} while (opcion != 0 && cont < listaCliente.length);

	}

}
