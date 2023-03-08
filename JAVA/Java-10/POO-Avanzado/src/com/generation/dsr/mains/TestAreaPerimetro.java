package com.generation.dsr.mains;

import com.generation.dsr.clases.AreaPerimetro;
import com.generation.dsr.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro ();
		FigurasGeometricas fg = new FigurasGeometricas();
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("Area de un cuadrado ---> " + fg.getArea());
		

		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("Perimetro del cuadrado --> " + fg.getPerimetro());
		
		
		fg.setArea(ap.areaTriangulo(4, 6));
		System.out.println("Area de un triangulo -->" + fg.getArea());
		
		fg.setPerimetro(ap.perimetroTriangulo(4, 5, 5));
		System.out.println("Perimetro de un triangulo --> " + fg.getPerimetro());
		
		
		fg.setArea(ap.areaCirculo(3.1416, 5));
		System.out.println("Area de un triangulo --> " + fg.getArea());
		
		fg.setPerimetro(ap.perimetroCirculo(10, 3.1415));
		System.out.println("Perimetro de un circulo --> " + fg.getPerimetro());
	}

}
