package arrays;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam;
		
		//En esta línea declaramos
		//int [] edades; 
		int []cajas = {22,12,151,42,60,45}; //inicializar el array
		//double [] precios;
		
		//System.out.println("Cuántas edades va a guardar");
		//tam=Leer.datoInt();
		//En esta instanciamos
		//edades=new int [tam];
		//****************************************
		
		//System.out.println("Que edad tienes ");
		//edades [0]=Leer.datoInt(); 
		
		
		//System.out.println("La edad es " + edades[3]); //hay que pober el corchete
		
		//***************************************************************
		
		for (int i = 0; i <cajas.length; i++) {
			System.out.println ((i+1)+" Caja: "+cajas[i]);
		}
		
		
	}

}
