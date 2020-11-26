package Practica05;

public class Main {

	public static void main(String[] args) {
		
		Carrera carrera = new Carrera();

		
		for(int i=1; i<=5 ; i++) {
			Corredor corredor = new Corredor(carrera,"Corredor" + i);
			corredor.start();
		}

		System.out.println("Todos los corredores listos");
	}

}
