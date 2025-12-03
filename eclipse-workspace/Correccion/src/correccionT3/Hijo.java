package correccionT3;

public class Hijo {
	
		//No se les da valores a los atributos aquí, al declararlos
		//Para eso ya esta el constructor
		//Y en los constructores tampoco se ponen
		private String nombre; 
		private int id; 
		private int edad; 
		private int horasEstudiadas;
		
		public Hijo(String nombre, int id, int edad, int horasEstudiadas) {
			super();
			this.nombre = nombre;
			this.id = id;
			this.edad = edad;
			this.horasEstudiadas = horasEstudiadas;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getHorasEstudiadas() {
			return horasEstudiadas;
		}

		public void setHorasEstudiadas(int horasEstudiadas) {
			this.horasEstudiadas = horasEstudiadas;
		}

		@Override
		public String toString() {
			return "Hijo [nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", horasEstudiadas=" + horasEstudiadas
					+ "]";
		} 
		
		
		//CalcularPaga
		//Aqui no he usado un metodo para porcentaje porque no necesito saber cuanto aporta
		private double calcularPaga (double porcentaje,double cant) {
			//puedo declarar una variable que de el resultado
			int den=100;
			return horasEstudiadas*cant-(porcentaje/den);
			
			
			
		}
		
		
		

}
