package ejercicio9;

import java.util.Random;

public class Sorteo {
	
	//generador aleatorio
	public int generadorAleatorio () {
		int desde=0001, hasta=99999;
		Random r = new Random(System.nanoTime()); 
		return r.nextInt(hasta-desde+1)+desde;
		
		
		
	}
	
	//Comprobar 
	public boolean comprobar (int numAUsuario,int numA2) {
		
		if (numAUsuario == numA2) {
			return true;
			
		} else  {
			
			return false;
		}
	}
	
	//MostrarGanador 
	public void mostrarGanador (boolean ganador) {
		
		if (ganador) {
			
			System.out.println("Ha ganado ");
			
		} else {
			System.out.println("Vuelva a intentarlo");
			
			
		}
		
		
		
	}
		
	//mostrar decimo 
	public void mostrar (int num) {
		int cero=0,nuevemil=99999;
		if (num<=cero || num>nuevemil) {
			System.out.println("Número érroneo");
		}else {
		System.out.printf("Decimo generado: %05d\n",num);
		}
	}
		
	
	
		
	}


