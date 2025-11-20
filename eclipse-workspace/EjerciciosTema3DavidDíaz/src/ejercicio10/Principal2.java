package ejercicio10;

import utilidades.Leer;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion,numPers,saltos=0,passw=1234,passwI,opcion1,opcion2,uno=1;
		double billete=0.35,saldo=0,cambio=0,billeteTotal=0,dineroIntr=0,sumaSalto=0;
		String fecha="18/11/25";
		
		
		System.out.println("Diga cuánto cuesta un billete");
		billete=Leer.datoDouble();
		System.out.println("¿Cuánto suamos por cada salto?");
		
		System.out.println("¿Cúantos saltos va a dar?");
		saltos=Leer.datoInt();
		Billete b=new Billete(billete,saltos,fecha);
		Maquina m=new Maquina(saldo,b,passw);
		//System.out.printf("Coste: %.2f€\n",m.);
		
	}

}
