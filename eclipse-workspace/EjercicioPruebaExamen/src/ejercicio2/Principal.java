package ejercicio2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Calcula la factura mensual de electricidad de un cliente. Se pide al usuario
		 * cuántos kWh (int) ha consumido. El precio se calcula de la siguiente manera:
		 * 
		 * Hay un coste fijo de 15€ (se paga siempre).
		 * 
		 * Los primeros 100 kWh consumidos se pagan a 0.20€/kWh.
		 * 
		 * Todos los kWh que pasen de 100 (es decir, los excedentes) se pagan a un
		 * precio superior de 0.35€/kWh.
		 * 
		 * Ejemplo: Si el usuario consume 120 kWh, pagará: 15€ (fijo) + (100 kWh *
		 * 0.20€) + (20 kWh * 0.35€)
		 */

		double kwh,base,tarifaBaja=20,tarifaS=35;
		int costeF=15,cien=100;
		
		System.out.println("Bienvenido a la calculadora de la factura de la luz");
		System.out.println("¿Cúanto kWh ha consumido este mes?");
		kwh=Leer.datoDouble();
		if (kwh<=cien) {
			
			base=costeF+tarifaBaja/cien;
			
			System.out.printf("El precio es de: %.2f€ ",base);
			
		}else if (kwh>=100) {
			base=costeF+tarifaS/cien;
			
			System.out.printf("El precio es de: %.2f€ ",base);
			
		} System.out.println("Gracias por usar nuestro programa");
		
		
		
		
	}

}
