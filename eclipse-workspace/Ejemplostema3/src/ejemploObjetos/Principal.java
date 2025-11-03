package ejemploObjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos el círculo
		Circulo c1; 
		double radio,total; 
		
		//Instanciamos el círculo 
		System.out.println("Qué radio tiene el círculo");
		radio=Leer.datoDouble();
		c1= new Circulo (radio);
		
		//imprimimos 
		c1.imprimirDatos();
		
		
		total=c1.calcularArea();
		
		System.out.printf("El área total es: %.2f",total);
		
		System.out.printf("\nEl área total es: %.2f",c1.metrosCuadrados());
		
		
		
	}

}
