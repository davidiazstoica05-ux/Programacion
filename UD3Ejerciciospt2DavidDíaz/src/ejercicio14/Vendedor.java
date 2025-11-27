package ejercicio14;



public class Vendedor {

	Movil m[];
	double subTotal;

	public Vendedor(Movil[] m, double subTotal) {
		super();
		this.m = m;
		this.subTotal = subTotal;
	}
	
	
	
	
	
	// CRUD
	// Create
	// REad
	// Update/Buscar
	// Delete

	public Movil[] getM() {
		return m;
	}





	public void setM(Movil[] m) {
		this.m = m;
	}





	public double getSubTotal() {
		return subTotal;
	}





	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}





	// Agregar
	public void agregar() {

		for (int i = 0; i < m.length; i++) {

			if (m[i] != null) {
				System.out.println(m[i].getMarca());
			}

		}

	}

	// Comprobar
	public boolean comprobarNuevo(int num) {

		if (num == 1) {

			return true;
		} else {

			return false;
		}

	}

	// Mostrar
	public void mostrar() {

		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);

		}

	}

	// Buscar
	public Movil findById(int id) {

		int i = 0;
		boolean encontrar = false;

		while (i < m.length && !encontrar) {

			if (m[i].getId() == id) {

				encontrar = true;

			} else {

				i++;
			}

		}

		if (encontrar) {

			return m[i];
		} else {

			return null;

		}

	}
	// comprobarVender

	public boolean comprobarVender(int id) {

		Movil movil;
		movil = findById(id);

		if (movil != null) {

			return true;

		} else {

			return false;
		}

	}
	// comprobarSiesNuevo

	public double venderNuevo(Movil m, double porcentaje) {
		double suma = 0;
		int den=100;
		if (m.isNuevo() == true) {
			return suma += m.getPrecio();
			
		} else {
			return suma += (m.getPrecio()*porcentaje/den); 
		}

	}
	
	//totalrecaudado
	private double sumarTotal() {
		
		double suma=0, pvp;
		for (int i = 0; i < m.length; i++) {
			
			suma+=m[i].getPrecio();
			
		}
		
		return suma;
	}

}
