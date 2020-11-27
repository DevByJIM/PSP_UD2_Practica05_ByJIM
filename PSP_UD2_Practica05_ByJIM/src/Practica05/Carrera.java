package Practica05;

public class Carrera {
	private int numCorredores;
	private static int ocupacion=5;
	
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
		System.out.println();
		System.out.println("El " + corredor.getName() + " empieza la vuelta");
		System.out.println("El " + corredor.getName() + " termina la vuelta");
		ocupacion--;
		if (ocupacion == 0) {
			System.out.println("La carrera a terminado.");
		}
	}
	
}
