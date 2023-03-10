package com.dsr.clases.testers;

import com.dsr.clases.Circulo;
import com.dsr.clases.Cuadrado;
import com.dsr.clases.FigurasGeometricas;
import com.dsr.clases.Rectangulo;
import com.dsr.clases.Triangulo;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		//asi es una instancia porque el objeto se crea con una clase concreta -rectangulo-:
		//Rectangulo renctangulo = new Rectangulo(10,2);
		
		//asi es una referencia porque se crea con una clase padre abstracta -FigurasGeometricas- pero de la clase que lo implementa -rectangulo-:
		FigurasGeometricas rectangulo = new Rectangulo(10,2);
		System.out.println(rectangulo.areas());
		
		FigurasGeometricas circulo = new Circulo(2);
		System.out.println(circulo.areas());
		
		FigurasGeometricas cuadrado = new Cuadrado(5);
		System.out.println("El area del cuadrado es: " + cuadrado.areas());
		
		FigurasGeometricas triangulo = new Triangulo(4, 8);
		System.out.println("El area del triangulo es: " + triangulo.areas());
		
		System.out.println(rectangulo.toString());
		System.out.println(circulo.toString());
		
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		System.out.println(rectangulo.areas());

	}

}
