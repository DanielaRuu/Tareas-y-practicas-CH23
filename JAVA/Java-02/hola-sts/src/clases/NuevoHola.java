package clases;

import java.util.Scanner;

public class NuevoHola {
	//clase Scanner
	
	//Esto es un objeto (nombre), pero también es una variable y el private también lo hace un miembro de datos
	private String nombre;
	//para innicializar la variable (objeto de tipo string) usamos el metodo constructor

	//este es el método constructos, para generarlo se da clic derecho y en la opcion source se selecciona generator constructor usando fields
	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	
	public void saaludo() {
		System.out.println("Hola desde java con sts de nuez " + this.nombre);
	
	}
	
	public void saludoconNombre() {
		System.out.print("Hola, tu eres: " + this.nombre);
	}
}
