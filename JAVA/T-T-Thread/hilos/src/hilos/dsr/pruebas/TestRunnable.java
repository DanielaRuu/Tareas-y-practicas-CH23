package hilos.dsr.pruebas;

import hilos.dsr.formarunnable.Hilo2;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Forma1
		Hilo2 ht = new Hilo2("Pedro");
		Thread nose = new Thread(ht);
		nose.start();
		//Forma2
		new Thread(new Hilo2("Canica")).start();
		new Thread(new Hilo2("Nina")).start();
	}

}
