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

	// Agregar/Create
	// Esto es
	public void agregar(Producto p, int cont) {

		listaProducto[cont] = p;

	}

	// Buscar/Update
	// Puede devolver int o producto
	/*
	 * public Producto buscarPorId(int id) {
	 * 
	 * Producto p; boolean encontrado; //con el for for (int i = 0; i <
	 * listaProducto.length; i++) { //Lo saco para comprobarlo p = listaProducto[i];
	 * //tambien ese puede hacer dentro del if con id == listaProd[i] p.getId; //
	 * boleano para saber si lo he encontrado o no if (id == p.getId()) { encontrado
	 * = true;
	 * 
	 * } else { encontrado = false; }
	 * 
	 * 
	 * 
	 * }
	 */

	/*
	 * public int buscarById(int id) {
	 * 
	 * int i = 0; boolean encontrado = false;
	 * 
	 * while (i < listaProducto.length && !encontrado) {
	 * 
	 * if (listaProducto[i].getId() == id) {
	 * 
	 * encontrado = true;
	 * 
	 * } else {
	 * 
	 * i++;
	 * 
	 * }
	 * 
	 * if (encontrado) { return i; // Devolvemos el indice porque es int } else {
	 * 
	 * return -1; Devuelve esto porque es uno que no esta en la lista
	 * 
	 * }
	 * 
	 * }
	 */

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
		}

		// esto sirve para parar el array cuando lo hemos encontado
		if (encontrado) {
			return listaProducto[i]; // Devolvemos el producto
		} else {

			return null;

		}

	}

	// BuscarTodos de normal se suele poner
	public Producto[] getListaProd() {
		return listaProducto;

	}

	public void modificarPrecio(int id, double nuevoPrecio) {

		Producto p = buscarById(id);
		if (p != null) {
			p.setPrecio(nuevoPrecio);
		}
		// tambien se puede hacer que devuelva un booleano para saber si lo ha cambiado
		// o no

	}

	// Borrar/delete
	public void delete(int id) {
		Producto p = buscarById(id);
		if (p != null) {
			p.setActivo(false);
		}
	}

	/*
	 * Para borrar por indice public void delete (int id) {
	 * 
	 * int index = buscarById(id); if (index >= 0) {
	 * listaProducto[index].setActivo(false); } }
	 */

	// Sumar todos los productosy media

	public double sumar() {

		double media = 0;
		double suma = 0;
		double costeProducto;
		for (int i = 0; i < listaProducto.length; i++) {
			if (listaProducto[i] != null) {
				costeProducto = listaProducto[i].getPrecio();
				suma += costeProducto;
			}
		}
		media = suma / listaProducto.length;
		return media;

	}

	// Buscar un array de nombres
	public Producto[] findByName(String name) {

		/*
		 * Hacer con while int i = 0; Producto[] listaAux = new
		 * Producto[listaProducto.length];
		 * 
		 * while (i < listaProducto.length) { if (name.equalsIgnoreCase(name)) {
		 * listaAux[i].setNombre(name);
		 * 
		 * } else { i++; }
		 * 
		 * } return listaAux;
		 */

		// Hacer con for
		int i = 0;
		Producto[] listaAux = new Producto[listaProducto.length];

		for (int j = 0; j < listaAux.length; j++) {
			if (listaProducto[j].getNombre().equalsIgnoreCase(name)) {
				listaAux[j] = listaProducto[j];

			}

		}
		return listaAux;

	}

	// modificarNombre
	/*
	 * public void modificarNombre (String name, String nuevoNombre) {
	 * 
	 * Producto p[]=findByName(name);
	 * 
	 * if (p != null) {
	 * 
	 * p.setNombre(nuevoNombre);
	 * 
	 * }
	 * 
	 * }
	 */

}
