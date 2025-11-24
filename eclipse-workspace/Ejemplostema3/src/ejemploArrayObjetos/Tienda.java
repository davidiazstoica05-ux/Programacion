package ejemploArrayObjetos;

import java.util.Arrays;

public class Tienda {
	
	private String nombre; 
	private Producto listaProducto[];
	
	
	
	public Tienda(String nombre, Producto[] listaProducto) {
		super();
		this.nombre = nombre;
		this.listaProducto = listaProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Producto[] getListaProducto() {
		return listaProducto;
	}
	public void setListaProducto(Producto[] listaProducto) {
		this.listaProducto = listaProducto;
	}
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", listaProducto=" + Arrays.toString(listaProducto) + "]";
	} 

	
	//CRUD 
	//Create 
	//Read 
	//Update 
	//Delete 
	
	
	
	//Agregar 
	
	//Esto es 
	public void agregar(Producto p, int cont) {
		
		listaProducto[cont]=p;
		
		
		
		
	}
	
	public Producto buscarPorId (int id) {
		
		boolean encontrado; 
		
		for (int i = 0; i < listaProducto.length; i++) {
			
			if ( id==listaProducto[i].getId());
			
			
			
		} 
		
		
		return p; 
		

}
