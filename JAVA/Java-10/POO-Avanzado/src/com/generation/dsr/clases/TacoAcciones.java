package com.generation.dsr.clases;

public class TacoAcciones {
	
	Taco suadero = new Taco();
	Taco placero = new Taco();

	
	//public void preparar() {
		// TODO Auto-generated method stub

	//}
	
	public float  vender(int numDeTacos) {
		return (suadero.precio*suadero.numDeTacos);

	}


	//public ponerSalsa() {
		

	//}
	
	public void subirPrecio() {
		 suadero.setPrecio(9.50);
		System.out.println(suadero.getPrecio());
		
		

	}

}
