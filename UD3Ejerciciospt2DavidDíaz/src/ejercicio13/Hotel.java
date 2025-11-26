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

	@Override
	public String toString() {
		return "Hotel [habitaciones=" + Arrays.toString(habitaciones) + "]";
	}

	// agregar

	public void agregar(Habitacion habitacion, int cont) {
		habitaciones[cont] = habitacion;
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
		for (int i = 0; i < habitaciones.length; i++) {
			System.out.printf("Habitacion Número: %.2f\n", habitaciones[i]);
		}

	}

	// comprobar
	public boolean comprobarOcupacionS(int numero) {
			
			Habitacion h=buscarPorNum(numero);
			if (h.isOcupada()==true) {
				return true;
				
			} else {
				
				return false;
			}
			
		}

}
