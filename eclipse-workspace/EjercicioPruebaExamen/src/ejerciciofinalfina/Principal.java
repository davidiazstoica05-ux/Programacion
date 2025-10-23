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
		int opcion;

		System.out.println("Introduzca su usuario");
		usuario = Leer.dato();
		System.out.println("Introduzca su contraseña");
		contraseña = Leer.dato();

		while (!usuarioGuardado.equals(usuario) && !passguard.equals(contraseña))
			;
		{
			if (usuarioGuardado.equals(usuario) && passguard.equals(contraseña))
				;
			{	System.out.println("Bienvenido");
				opcion=Leer.datoInt();
			
				do {

				} while (opcion != 0);

			} 
			
		}

		}

	}


