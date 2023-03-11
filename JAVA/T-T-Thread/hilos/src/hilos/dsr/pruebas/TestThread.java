package hilos.dsr.pruebas;

import hilos.dsr.formathread.Hilo1;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Procesos que se van a ejecutar dentro de la clase Hilo1
		Thread h = new Hilo1("Pamela");
		h.start();
		//start inicializa el proceso
		Thread h0 = new Hilo1("Maria");
		h0.start();
		Thread h1 = new Hilo1("Raul");
		h1.start();
		
		
		
		//Al ingresar bloque try-catch el estado cambia a TERMINATED
		/*try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		//Al inicializarlo, get.state arrojará RUNNABLE (antes de ingresar bloque try-catch
		System.out.println(h.getState());
		
		

	}

}
