package ejercicio13;

import java.util.Arrays;
import java.util.Iterator;

import ejercicio12.Producto;

public class Hotel {

	Habitacion habitaciones[];
	private boolean bar;
	private boolean excursion;
	private boolean zonaVip;

	public Hotel(Habitacion[] habitaciones, boolean bar, boolean excursion, boolean zonaVip) {
		super();
		this.habitaciones = habitaciones;
		this.bar = bar;
		this.excursion = excursion;
		this.zonaVip = zonaVip;
	}

	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}

	public boolean isBar() {
		return bar;
	}

	public void setBar(boolean bar) {
		this.bar = bar;
	}

	public boolean isExcursion() {
		return excursion;
	}

	public void setExcursion(boolean excursion) {
		this.excursion = excursion;
	}

	public boolean isZonaVip() {
		return zonaVip;
	}

	public void setZonaVip(boolean zonaVip) {
		this.zonaVip = zonaVip;
	}

	@Override
	public String toString() {
		return "Hotel [habitaciones=" + Arrays.toString(habitaciones) + "]";
	}

	// BuscarPorNum
	public Habitacion buscarPorNum(int num) {

		int i = 0;
		boolean encontrar = false;

		while (i < habitaciones.length && !encontrar) {

			if (habitaciones[i].getNumHabitacion() == num) {

				encontrar = true;

			} else {

				i++;
			}

		}

		if (encontrar) {

			return habitaciones[i];

		} else {

			return null;

		}
	}

	// mostrar array

	public void mostrar() {

		for (int i = 0; i < habitaciones.length; i++) {

			System.out.println(habitaciones[i]);

		}

	}

	// mostarHabitacion

	public void mostrarHabitaciones() {

		System.out.println("Habitaciones\n");
		for (int i = 0; i < habitaciones.length && habitaciones[i]!= null; i++) {
			System.out.printf("Habitacion Número: %d\n", habitaciones[i].getNumHabitacion());
		}

	}

	// ocuparHabitacion
	public void setOcuparHabitacion(int num, String nombre) {
		habitaciones[num - 1].setNombreCliente(nombre);
		habitaciones[num - 1].setOcupada(true);

	}

	// comprobarBar
	public boolean comprobar(int num) {

		if (num == 1) {

			return true;
		} else {

			return false;

		}

	}
	
	

}
