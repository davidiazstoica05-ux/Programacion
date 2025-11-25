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

	// CRUD
	// Create
	// Read
	// Update
	// Delete

	// Agregar

	// Esto es
	public void agregar(Producto p, int cont) {

		listaProducto[cont] = p;

	}

	// Buscar
	// Puede devolver int o producto
	public Producto buscarPorId(int id) {

		Producto p;
		boolean encontrado;
		//con el for 
		for (int i = 0; i < listaProducto.length; i++) {
			//Lo saco para comprobarlo 
			p = listaProducto[i]; //tambien ese puede hacer dentro del if con id == listaProd[i] p.getId;
			// boleano para saber si lo he encontrado o no
			if (id == p.getId()) {
				encontrado = true;
				
			} else {
				encontrado = false;
		}

		

	}

	// findbyB v2
	// Hacerlo con el while
	public Producto buscarById(int id) {

		int i = 0;
		boolean encontrado = false;
		
		while (i < listaProducto.length && !encontrado) {

			if (listaProducto[i].getId() == id) {

				encontrado = true;

			} else {

				i++;

			}

			if (encontrado) {
				return listaProducto[i]; // Devolvemos el producto
			} else {

				return null;

			}

		}

	}

}
