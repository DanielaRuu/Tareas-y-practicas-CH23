package com.dsr.clases;

public class Triangulo extends FigurasGeometricas{
	public double base;
	public double altura;
	
	
	//Constructor
	public Triangulo(double base, double altura) {
		super("Triangulo");
		this.base = base;
		this.altura = altura;
	}



	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
