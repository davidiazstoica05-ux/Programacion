package ejercicio8;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Realizar un programa que simule un inicio de sesión leyendo por teclado el
		 * nombre del usuario y la contraseña y comprobando si esos coinciden con unos
		 * guardados en unas variables inicializadas por vosotros al comienzo del
		 * programa.
		 */
		
		/*
		 * Para string se usa el .equals para comparar debido a que es un objeto. Si se usa == da error, 
		 * ya que no compara el contenido si no si estan en el mismo lugar de la memoria.
		 * Esto pasa porque String no es primitivo y es objeto
		 *  
		 */
		String usuario, paco="paco";
		int contraseñaUsuario = 12345, contraseña;

		System.out.println("Inicio de sesion en Spotify ");
		System.out.println("Introduzca su nombre de usuario:");
		usuario = Leer.dato();
		System.out.println("Introduzca su contraseña:");
		contraseña = Leer.datoInt();
		if (usuario.equals(paco) && contraseña == contraseñaUsuario) {
			System.out.println("Bienvenido al programa");
		} else {
			System.err.println("ERROR ");
			System.out.println("Contraseña y/o nombre de usuario incorrectos");

		}
	}

}
