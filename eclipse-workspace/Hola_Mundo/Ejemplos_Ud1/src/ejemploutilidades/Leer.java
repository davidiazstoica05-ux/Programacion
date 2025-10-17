package ejemploutilidades;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// *-->import utilidades.Leer; <--

/* Si creamos un paquete, el cual se llame utilidades y colocamos el codigo que vemos mas abajo, podemos escribir por teclado 
 * simplemente poniendo nombrevar=Leer.datovar(la variable que es)(); 
 * Ejemplo: habitantes=Leer.datoInt(); SE NOS CREARA ARRIBA UN import utilidades.leer; esto hará que funcione. * 
 * 
 * En el ejercicio 9 queda muy claro y detallado
 */


public class Leer {

	public static String dato() {
		String sdato = " ";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		return sdato;

	}

	public static int datoInt() {
		return Integer.parseInt(dato());
	}

	public static float datoFloat() {
		return Float.parseFloat(dato());
	}
//Leer un char por teclado

	public static char datoChar() {
		char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		return c;
	}

	public static long datoLong() {
		return Long.parseLong(dato());
	}

	public static short datoShort() {
		return Short.parseShort(dato());
	}

	public static double datoDouble() {
		return Double.parseDouble(dato());
	}

}

