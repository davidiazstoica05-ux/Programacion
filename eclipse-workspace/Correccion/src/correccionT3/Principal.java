package correccionT3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//V1. Sin objetos de prueba
		Hijo listaHijos[]; 
		GestionFamiliar gF; 
		Hijo h ; 
		int tam,cont=0,id; 
		double presupuestoTotal=150; 
		
		
		
		System.out.println("Diga cuantos hijos tiene");
		tam=Leer.datoInt();
		listaHijos = new Hijo [tam]; 
		h= new Hijo("David", 1, 20, 25);
		//Formas de rellenar la lista
		
		//2.Solo de prueba, MAL, esto es para no tener que rellenar
		Hijo [] listaPrueba = {h,h,h}; //Solo cuando quiera meter objetos con las llaves del tiron tiebe que ser en la misma linea 
		
		//3.Agregar
		gF = new GestionFamiliar(listaPrueba,presupuestoTotal);
		
		gF.agregar(h, cont);
		cont ++; 
		
		//4.FindByID
		System.out.println("Di el ID");
		id= Leer.datoInt();
		if (gF.buscarPorId(id) !=null) {
			
			System.out.println(gF.buscarPorId(id));
			
		} else {
			System.out.println("No encontrado");
		}
		


	}

}
