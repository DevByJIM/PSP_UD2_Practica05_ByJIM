package Practica05;

public class Main {

	public static void main(String[] args) {
		
		Carrera carrera = new Carrera();
		Corredor corredor;
		
		for(int i=1; i<=5 ; i++) {
			corredor = new Corredor(carrera,"Corredor" + i);
			corredor.start();
		}
		

	}

}
