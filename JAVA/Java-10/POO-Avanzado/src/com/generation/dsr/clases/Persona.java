package com.generation.dsr.clases;

public class Persona {
	private String nombre;
	private int edad;
	private int nss;
	
	
	//Constructor vacio
	public Persona() {
		super();
	}
	
	//Constructor sobrecargado
	public Persona(String nombre, int edad, int nss) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}
	
	//Mètodos get y set
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	
	

}
