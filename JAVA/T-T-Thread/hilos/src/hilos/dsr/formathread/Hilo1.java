package hilos.dsr.formathread;

public class Hilo1 extends Thread{
	
	//metodo heredado de la clase padre Thread implementado en hilo1.
	//lo generamos desde source---> y generate constructor from superclass
	public Hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("se inicia el Thread o Hilo " + this.getName());
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Termina el Hilo o Thread " + this.getName());
	}

}
