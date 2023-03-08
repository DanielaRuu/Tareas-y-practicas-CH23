package com.generation.dsr.clases;

public class FigurasGeometricas {
	private double perimetro;
	private double area;
	
	//Se llama constructor porque inicializa variables,tambièn es un mètodo
	public FigurasGeometricas() {
		super();
	}


	public FigurasGeometricas(double perimetro, double area) {
		super();
		this.perimetro = perimetro;
		this.area = area;
	}

//GET SET  --> BEAN POJO
	public double getPerimetro() {
		return perimetro;
	}


	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	

}
