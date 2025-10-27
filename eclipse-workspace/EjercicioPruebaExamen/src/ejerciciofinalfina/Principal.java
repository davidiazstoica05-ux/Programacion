package ejerciciofinalfina;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crea un programa que simule un inicio de sesión y un cajero automático.
		 * 
		 * Inicio de Sesión:
		 * 
		 * Define dos variables String al principio del programa: USUARIO_GUARDADO =
		 * "dam1" y PASS_GUARDADA = "1234".
		 * 
		 * Pide al usuario que introduzca un usuario y una contraseña.
		 * 
		 * Comprueba si ambos coinciden (recuerda usar .equals() para String).
		 * 
		 * Menú del Cajero:
		 * 
		 * Si el login es correcto, el programa entra en un menú do-while.
		 * 
		 * Empieza con una variable double saldo = 1000.0; y un int contadorOperaciones
		 * = 0;.
		 * 
		 * El menú debe mostrar el saldo actual y dar estas opciones:
		 * 
		 * Ingresar dinero: Pide una cantidad y la suma al saldo. Incrementa
		 * contadorOperaciones.
		 * 
		 * Retirar dinero: Pide una cantidad. Comprueba si tiene saldo suficiente (if
		 * (cantidad <= saldo)). Si tiene, resta la cantidad al saldo e incrementa
		 * contadorOperaciones. Si no, muestra "Saldo insuficiente".
		 * 
		 * Salir.
		 * 
		 * Si el login NO es correcto, el programa simplemente muestra "Acceso denegado"
		 * y termina (no entra en el do-while).
		 * 
		 * Resumen Final:
		 * 
		 * Cuando el usuario pulsa 0, el programa sale del bucle y muestra un resumen:
		 * "Gracias por usar el cajero. Saldo final: [saldo]. Operaciones realizadas: [contadorOperaciones]"
		 * .
		 */

		String usuarioGuardado = "dom1", passguard = "1234", usuario, contraseña;
		int opcion, contadorO = 0, ingreso, retirar;
		double saldo=1000.0;

		System.out.println("Introduzca su usuario");
		usuario = Leer.dato();
		System.out.println("Introduzca su contraseña");
		contraseña = Leer.dato();

		if (usuarioGuardado.equals(usuario) && passguard.equals(contraseña))
		{
			do {
				System.out.println("Bienvenido");
				System.out.println("Pulse 1 para ingresar una cantidad");
				System.out.println("Pulse 2 para sacar dinero");
				System.out.println("Pulse 3 para salir");
				opcion = Leer.datoInt();
				switch (opcion) {
				case 1:
					System.out.println("Ha elegido usted ingresar dinero");
					System.out.println("Saldo actual: "+saldo);
					System.out.println("¿Cúanto dinero va a ingresar?");
					ingreso = Leer.datoInt();
					saldo += ingreso;
					contadorO++;
					System.out.println("Nuevo saldo " + saldo);
					break;
				case 2:
					System.out.println("Cúanto dinero desea retirar");
					retirar = Leer.datoInt();
					if (saldo >= retirar) {
						saldo -= retirar;
						contadorO++;
						System.out.println("Saldo nuevo: " + saldo);
					} else {
						System.out.println("Saldo insuficiente");
					}
					break;
				case 3:
					System.out.println("Gracias por usar nuestro programa");
					System.out.println("Operaciones realizadas "+contadorO);
					System.out.println("Saldo final: "+saldo);

					break;

				default:
					System.out.println("Número seleccionado incorrecto");
					break;
				}

			} while (opcion != 3);
		}else {
			System.out.println("Acceso denegado");
		}

	}

}
