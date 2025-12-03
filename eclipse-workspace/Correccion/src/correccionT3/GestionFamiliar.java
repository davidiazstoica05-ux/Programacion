package correccionT3;

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
	
	
	
	

}
