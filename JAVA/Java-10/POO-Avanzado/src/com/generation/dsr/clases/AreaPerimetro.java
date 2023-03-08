package com.generation.dsr.clases;

public class AreaPerimetro {
	
	public double areaCuadrado(double lado) {
		double area = lado*lado;
		return area; 

	}
	
	public double perimetroCuadrado(double lado) {
		double perimetro = lado*4;
		return perimetro; 

	}
	
	public double areaTriangulo(int base, int altura ) {
		
		return (base*altura)/2; 
	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		
		return (ladoA+ladoB+ladoC); 

	}
	
public double areaCirculo(double pi, double radio ) {
		
		return (pi * (radio*radio)); 
	}
	
	public double perimetroCirculo(double diametro, double pi) {
		
		return (diametro * pi); 

	}
	
	

}
