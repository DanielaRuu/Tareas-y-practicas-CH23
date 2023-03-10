package com.dsr.clases;

public class Cuadrado extends FigurasGeometricas {
	public double lado;

	
//Constructor
	public Cuadrado(double lado) {
		super("Cuadrado");
		this.lado = lado;
	}


//Metodo sobrecargado de clase padre
	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (lado * lado);
	}


//Metodos get y set
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}



	

}
