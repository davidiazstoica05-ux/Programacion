package ejercicio15;

import java.util.Iterator;

public class Gimnasio {

	Cliente listaCliente[];

	public Gimnasio(Cliente[] listaCliente) {
		super();
		this.listaCliente = listaCliente;
	}

	// CRUD

	// agregar

	public void agregar(Cliente c, int posicion) {

		listaCliente[posicion] = c;
	}

	// read

	public void mostrar() {

		for (int i = 0; i < listaCliente.length; i++) {

			for (int j = 0; j < listaCliente.length; j++) {
				System.out.println(listaCliente);
			}

		}

	}

	// buscar
	public Cliente buscarPorDNI(String dni) {

		int i = 0;
		boolean encontrar = false;
		while (i < listaCliente.length && !encontrar) {
			if (listaCliente[i].getDni().equalsIgnoreCase(dni)) {

				encontrar = true;

			} else {
				i++;
			}

		}

		if (encontrar) {

			return listaCliente[i];

		} else {
			return null;

		}

	}

	// delete

	public void borra(String dni) {

		Cliente c = buscarPorDNI(dni);

		if (c != null) {
			c.setActivo(false);
		}

	}

	// listaCLienteno activos

	public Cliente[] mostrarNoActivos() {

		Cliente listaAux[] = new Cliente[listaCliente.length];

		for (int i = 0; i < listaCliente.length; i++) {
			if (listaCliente[i].isActivo() == false) {

				listaAux[i] = listaCliente[i];
			}

		}
		return listaAux;

	}
	
	//sumarmedia
	
	public double hacerMedia() {
		
		double suma=0;
		
		for (int i = 0; i < listaCliente.length; i++) {
			
			suma += listaCliente[i].getAltura(); 
		}
		
		return suma = suma / listaCliente.length; 
		
	}

}
