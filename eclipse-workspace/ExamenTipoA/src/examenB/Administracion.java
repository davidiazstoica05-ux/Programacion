package examenB;

import java.util.Arrays;

public class Administracion {

	private Profesor profesores[];
	private double presupuestoTotal;

	public Administracion(Profesor[] profesores, double presupuestoTotal) {
		super();
		this.profesores = profesores;
		this.presupuestoTotal = presupuestoTotal;
	}

	public Profesor[] getProfesores() {
		return profesores;
	}

	public void setProfesores(Profesor[] profesores) {
		this.profesores = profesores;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	@Override
	public String toString() {
		return "Administracion [profesores=" + Arrays.toString(profesores) + ", presupuestoTotal=" + presupuestoTotal
				+ "]";
	}

	// Agregar

	public void agregarProfesor(Profesor p, int cont) {

		profesores[cont] = p;
	}

	// Buscar
	// Mostrar
	public void mostrarTodos() {
		for (int i = 0; i < profesores.length; i++) {
			System.out.println(profesores[i]);
		}

	}

	public void mostrarID() {

		for (int i = 0; i < profesores.length; i++) {
			if (profesores[i] != null) {
				System.out.printf("%d = %s", profesores[i].getId(), profesores[i].getNombre());
			}

		}

	}

	// Buscar por id
	public Profesor buscarById(int id) {

		int i = 0;
		boolean encontrar = false;

		while (i < profesores.length && !encontrar) {

			if (profesores[i].getId() == id) {

				encontrar = true;
			} else {
				i++;
			}

		}
		if (encontrar) {

			return profesores[i];

		} else {

			return null;
		}

	}

	public void mostrar(int id) {

		Profesor p = buscarById(id);

		if (p != null) {

			System.out.println(p);

		} else {

			System.out.println("No hay profesor");

		}
	}

	// buscar mas de 20 años

	public Profesor[] findByAnyos(int anyos,int cont) {

		Profesor[] listaAux = new Profesor[profesores.length];
		for (int i = 0; i < cont ; i++) {

			if (profesores[i].getAnyosAntiguedad() >= anyos && profesores[i] != null) {

				listaAux[i] = profesores[i];
			}
			
			

		}
		
		return listaAux;

	}
	// mostraraprtirAños

	public void mostrarAnyos( Profesor[] listaAux) {

		for (int i = 0; i < listaAux.length; i++) {
			
			if (listaAux !=null) {
				
				System.out.println(listaAux[i]);
			}
			
		}

	}

	// CalcularGastos

	public double calcularGastosNominas(int anyos, double cantidad, double porcentaje,int cont) {

		Profesor listaAux[] = findByAnyos(anyos,cont);
		double sueldo, suma = 0;

		for (int i = 0; i < listaAux.length; i++) {

			if (listaAux[i] != null) {
				sueldo = listaAux[i].calcularSueldo(cantidad, porcentaje);
				suma += sueldo;
			}
		}

		return suma;

	}

	// modificarNumeroHoras

	public void modificarAnyos(int id, int nuevaAnyos) {

		Profesor p = buscarById(id);
		if (p != null) {

			p.setAnyosAntiguedad(nuevaAnyos);

		}
	}

}
