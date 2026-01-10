package ejercicio;

import java.util.Arrays;

public class GestionFamiliar {

	private Hijo listaHijos[];
	private double presupuestoTotal;

	public GestionFamiliar(Hijo[] listaHijos, double presupuestoTotal) {
		super();
		this.listaHijos = listaHijos;
		this.presupuestoTotal = presupuestoTotal;
	}

	public Hijo[] getListaHijos() {
		return listaHijos;
	}

	public void setListaHijos(Hijo[] listaHijos) {
		this.listaHijos = listaHijos;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	@Override
	public String toString() {
		return "GestionFamiliar [listaHijos=" + Arrays.toString(listaHijos) + ", presupuestoTotal=" + presupuestoTotal
				+ "]";
	}

	// CRUD

	// create
	public void agregar(Hijo h, int cont) {
		listaHijos[cont] = h;
	}

	// buscarTodos
	public void mostrar() {

		for (int i = 0; i < listaHijos.length; i++) {

			System.out.println(listaHijos[i]);
		}

	}

	// Buscar

	// Mostrar id
	public void mostrarID() {

		for (int i = 0; i < listaHijos.length; i++) {

			System.out.printf("ID: %d\n", listaHijos[i].getId());

		}

	}

	public Hijo buscarPorId(int id) {

		int i = 0;
		boolean encontrar = false;

		while (i < listaHijos.length && !encontrar) {

			if (listaHijos[i].getId() == id) {

				encontrar = true;

			} else {

				i++;
			}

		}
		if (encontrar) {

			return listaHijos[i];

		} else {
			return null;

		}

	}

	// Hijos menores de 14años

	public Hijo[] buscarMenores14() {

		Hijo listaAux[] = new Hijo[listaHijos.length];
		int catorce = 14;
		for (int i = 0; i < listaAux.length; i++) {

			if (listaHijos[i].getEdad() < catorce) {

				listaAux[i] = listaHijos[i];
			}

		}

		for (int i = 0; i < listaAux.length; i++) {

			System.out.println(listaAux[i]);

		}
		return listaAux;

	}

	// mostrar listaAux
	public void mostrarMenores(Hijo listaMenores[]) {

		for (int i = 0; i < listaMenores.length; i++) {
			if (listaMenores != null) {
				System.out.println(listaMenores[i]);
			}

		}
	}

	// calcular pagas hijos mayor 14

	public double calcularPagaMayor14(double cant, double porcentaje) {

		int mayor = 14;
		double suma = 0, cero = 0.0;

		for (int i = 0; i < listaHijos.length; i++) {

			if (listaHijos[i].getEdad() < mayor) {
				suma += listaHijos[i].calcularPaga(cant, porcentaje);
			} else {
				suma += cero;
			}

		}
		return suma;

	}

	// modificar

	public boolean modificarHorasEstudiadas(int id, int nuevHora) {
		Hijo h = buscarPorId(id);
		if (h != null) {
			h.setHorasEstudias(nuevHora);
			return true;
		} else {
			return false;
		}
	}

	
	  //sumarTotal
	  
	  public double sumarTotal(double cant,int cont) {
	  
		  double suma=0;
		  for (int i = 0; i < cont; i++) {
			  suma=+cant; 
		}
		  return suma;
	  
	  
	  }
	  
	 //presupuestoRestante
	  
	  public double restarPresupuesto(double suma) {
	  
	  double total; 
	  
	  total=presupuestoTotal-suma;
	  
	  return total;
	  
	  
	  }
	 

}
