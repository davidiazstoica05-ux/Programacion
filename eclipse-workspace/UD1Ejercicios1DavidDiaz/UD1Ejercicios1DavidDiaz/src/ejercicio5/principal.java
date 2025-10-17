package ejercicio5;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * El cambio de una libra a euros son de 0.87
		 */
		double libraEuros=0.87, euros=50, resultado, euroLibras=1.15, libras=50, resultado2;
	
		System.out.println("Hola, este programa le realizará el cambio de Libras Esterlinas a Euros ");
		System.out.println("Calcularemos el cambio de 50€ a Libras Esterlinas");
		System.out.println("****************************");
	
		/*
		 * Calculo
		 */
			resultado=euros*libraEuros;
			resultado2=euroLibras*libras;
			
		System.out.println("50€ equivalen a: "+resultado+"£");
		
		/*
		 * System.out.println(); 
		 */
		
	}

}
