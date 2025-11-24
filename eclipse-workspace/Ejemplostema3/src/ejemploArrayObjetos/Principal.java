package ejemploArrayObjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1;
		Producto p3;
		Tienda t;
		String nombre, nombreP;
		Producto[] lista;
		int tam, conProd = 0, opcion;
		double precio;

		/*
		 * //Leemos el tamaño System.out.println("Diga el tamaño");
		 *  tam=Leer.datoInt();
		 * lista= new Producto [tam]; 
		 * //Instanciamos la tienda antes t= new Tienda
		 * (nombre, lista);
		 * 
		 * //Agregamos un producto 
		 * t.agregar(p1, tam); 
		 * conProd++;
		 *  t.agregar(p3,conProd);
		 * 
		 * System.out.println(t);
		 * 
		 */
		// Rellenar pidiendo datos con un bucle

		do {
			System.out.println("Diga el tamaño de la lista");
			tam = Leer.datoInt();
			System.out.println("Diga el nombre del producto");
			nombreP = Leer.dato();
			System.out.println("Diga el precio del producto");
			precio = Leer.datoDouble();
			lista = new Producto[tam];
			t = new Tienda(nombreP, lista);
			//forma 1 de instanciar 
			//t.agregar(p1, conProd);
			 
			
			//forma 2 
			t.agregar(new Producto(nombreP, precio,), conProd);
			conProd++;
			
			System.out.println("Si deseas terminar pulse 0, cualquier número para seguir");
			opcion=Leer.datoInt();
			// Instanciamos la tienda

		} while (opcion != 0 && conProd<lista.length);

		System.out.println(t);
	}

}
