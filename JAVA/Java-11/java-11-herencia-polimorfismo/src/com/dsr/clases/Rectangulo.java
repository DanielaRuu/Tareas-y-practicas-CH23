package com.dsr.clases;

import java.util.Scanner;

//Aqui ya se hizo herencia de la clase padre FigurasGeometricas a Rectangulo como clase hija
public class Rectangulo extends FigurasGeometricas{
	
	private double base;
	private double altura;

	//Constructor 
	public Rectangulo(double base, double altura) {
		//super viaja a la clase padre para accedeer al construtor de la clase padre, verifica los parametros e inicializa
		super("Rectangulo");
		this.base = base;
		this.altura = altura;
	}


	//metodo sobrecargado traido de clase padre, aquí si se le indica qué hacer sobreescribiendo el metodo agregando parametros
	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (base*altura);
	}


	
 //Metodos get y set
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
		Scanner datos = new Scanner(System.in);
		System.out.print("Introduzca la base: ");
		//Forma 1 de almacenar dato 
		double b = datos.nextDouble();
		setBase(b);
		
		System.out.print("Introduzca la altura: ");
		//Forma 2 de almacenar dato
		this.setAltura(datos.nextDouble());
		
		
	}

	
}
