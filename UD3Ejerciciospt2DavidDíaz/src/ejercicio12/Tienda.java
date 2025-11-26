package ejercicio12;

import java.util.Arrays;

public class Tienda {

	String nombre;
	Producto listaProducto[];

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

	// agregar
	public void agregar(Producto p, int cont) {
		listaProducto[cont] = p;
	}

	// mostrar
	public void mostrar() {

		for (int i = 0; i < listaProducto.length; i++) {

			System.out.println(listaProducto[i]);
		}

	}

	// sumar
	public double sumar() {

		double suma = 0;
		double costeProducto;
		for (int i = 0; i < listaProducto.length; i++) {

			costeProducto = listaProducto[i].getCantidad() * listaProducto[i].getPrecioFabrica();
			suma += costeProducto;

		}

		return suma;

	}

	// Seleccionar
	public Producto buscarByID(int id) {

		int i = 0;
		boolean encontrar = false;

		while (i < listaProducto.length && !encontrar) {

			if (listaProducto[i].getId() == id) {

				encontrar = true;

			} else {

				i++;
			}

		}

		if (encontrar) {

			return listaProducto[i];
		} else {
			return null;
		}

	}
	// CalcularPVP

	public double calcularPVP(Producto p, double porcentaje) {
		int den = 100;
		return p.getPrecioFabrica() + (p.getPrecioFabrica() * porcentaje / den);

	}

	// mostrarID

	public void mostrarID() {
		for (int i = 0; i < listaProducto.length; i++) {

			System.out.printf(" ID %s: %d\n", listaProducto[i].getNombre(), listaProducto[i].getId());
		}
	}

}
