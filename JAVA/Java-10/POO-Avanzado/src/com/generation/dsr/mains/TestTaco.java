package com.generation.dsr.mains;

import com.generation.dsr.clases.Taco;

public class TestTaco {

	public static void main(String[] args) {
		Taco suadero = new Taco();
		suadero.setGuisado("Suaderito");
		suadero.setNumeroDeTortilla(2);
		suadero.setTamañoDeTortilla("chiqui");
		suadero.setTipoDeTortilla("blanca");
		suadero.setPrecio(8);
		suadero.setNumDeTacos(5);
		
		Taco placero = new Taco();
		placero.setGuisado("chicharron");
		placero.setNumeroDeTortilla(1);
		placero.setTamañoDeTortilla("Regular");
		placero.setTipoDeTortilla("blanca");
		placero.setPrecio(5);
		placero.setNumDeTacos(3);
		
		System.out.println("---> " + suadero.toString());
		
		System.out.println("---> " + placero.toString());
		
		placero.setGuisado("chicharron");
		System.out.println("Tienes un taquito de " + placero.getGuisado());
		
		suadero.setGuisado("suadero");
		System.out.println("Tienes un taquito de " + suadero.getGuisado());
		
		//suadero.subirPrecio();
		
		//suadero.vender(5);
		//System.out.println("Son " + suadero.vender(5) + "pesos de 5 tacos de suadero");
	
		

	}

}
