package Practica05;

import java.util.concurrent.Semaphore;

public class Carrera {
	private static int numCorredores;
	Semaphore semaf = new Semaphore(1, false);
	
	public Carrera() {
		
	}
	
	public synchronized void CorredorListo() {
		numCorredores++;
		
		if(numCorredores == 5) {
			System.out.println("Todos los corredores listos");
			System.out.println("Comienza la carrera:");
			notifyAll();
		}else {
			try {
				wait();
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
			
	}
	
	public synchronized void Correr(Corredor corredor) {

		System.out.println("El " + corredor.getName() + " empieza la vuelta");
		System.out.println("El " + corredor.getName() + " termina la vuelta");
		
	}
	
}
