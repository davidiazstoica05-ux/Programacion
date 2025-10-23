package ejercicio9;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Calcular el precio por entrar en el cine, pidiendo el número de entradas y el
		 * precio. Pedir el día de la semana y si es miércoles (día del espectador) se
		 * aplicará un porcentaje de descuento leído por teclado al total.
		 */
		String diaSemana,miercoles="miercoles",miercoles2="Miercoles";
		int ud,den=100;
		double precio, totalEntradas,descuento,des,totalDes;

		System.out.println("Hola venta de entradas del cine");
		System.out.println("Diga el número de entradas");
		ud = Leer.datoInt();
		System.out.println("Diga el precio de las entradas");
		precio = Leer.datoDouble();
		System.out.println("Diga el dia de la semana");
		diaSemana=Leer.dato();
		
		totalEntradas=ud*precio;
		if (diaSemana.equals(miercoles)) {
			System.out.println("Diga el porcentaje de descuento");
			descuento=Leer.datoDouble();
			des=totalEntradas*descuento/den;
			totalDes=totalEntradas-des;
			System.out.printf("El total es de %.2f, aplicandole el descuento del %.2f ",totalEntradas,descuento);
			System.out.printf("\nEL total sería %.2f€ ",totalDes);
		}else if (diaSemana.equals(miercoles2)) {
			System.out.println("Diga el porcentaje de descuento");
			descuento=Leer.datoDouble();
			des=totalEntradas*descuento/den;
			totalDes=totalEntradas-des;
			System.out.printf("Aplicandole el descuento del %.2f sobre %.2f€",descuento,totalEntradas);
			System.out.printf("\n EL total es %.2f€ ",totalDes);
		}else {
			System.out.printf("El precio es de %.2f€",totalEntradas);
		}System.out.println("\nGracias por usar nuestro programa");
	}

}
