package Practica05;

public class Corredor extends Thread{

	Carrera carrera;
	public Corredor(Carrera carrera, String nombre) {
		super(nombre);
		this.carrera = carrera;
		System.out.println("El " + this.getName() + " se coloca en su posición");
		
	}
	
	
	@Override
	public void run() {
				
		carrera.CorredorListo();

		carrera.Correr(this);

	}
}
