package ejercicio13;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crea un programa donde se introduzca un número entero y nos digas el día de
		// la semana al
		// que pertenece.
		String l="Lunes",m="Martes",x="Miercoles",j="Jueves",v="Viernes",s="Sabado",d="Domingo";
		int diaSemana;

		System.out.println("Hola este programa le dejará seleccionar los días de la semana");
		System.out.printf("\nPulse 1: para elegir %s",l);
		System.out.printf("\nPulse 2: para elegir %s",m);
		System.out.printf("\nPulse 3: para elegir %s",x);
		System.out.printf("\nPulse 4: para elegir %s",j);
		System.out.printf("\nPulse 5: para elegir %s",v);
		System.out.printf("\nPulse 6: para elegir %s",s);
		System.out.printf("\nPulse 7: para elegir %s",d);
		System.out.println();
		diaSemana = Leer.datoInt();

		switch (diaSemana) {
		case 1:
			System.out.printf("Usted ha pulsado 1, que corresponde a %s",l);
			break;
		case 2:
			System.out.printf("Usted ha pulsado 2, que corresponde a %s",m);
			break;
		case 3:
			System.out.printf("Usted ha pulsado 3, que corresponde a %s",x);
			break;
		case 4:
			System.out.printf("Usted ha pulsado 4, que corresponde a %s",j);
			break;
		case 5:
			System.out.printf("Usted ha pulsado 5, que corresponde a %s",v);
			break;
		case 6:
			System.out.printf("Usted ha pulsado 6, que corresponde a %s",s);
			break;
		case 7:
			System.out.printf("Usted ha pulsado 7, que corresponde a %s",d);
			break;
		default:
			break;
		}System.out.println("\nGracias por usar nuestro programa");
	}

}
