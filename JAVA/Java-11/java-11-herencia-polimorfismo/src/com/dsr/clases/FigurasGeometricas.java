package com.dsr.clases;

//clase abstracta: contenido de metodos abstractos.
public abstract class FigurasGeometricas {
	private String nombre;
	
	//constructor metodo implementado
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}
	
	//metodo abstracto solo se declara, no se le dice què hacer, por eso no lleva llaves, va a ser implementado en clases hijas.
	public abstract double areas();
	
	public abstract void pedirDatos();

	@Override
	public String toString() {
		return "FigurasGeometricas [nombre=" + nombre + ", areas()=" + areas() + "]";
	}

	
	

}
