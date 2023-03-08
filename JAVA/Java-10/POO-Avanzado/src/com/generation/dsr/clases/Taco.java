package com.generation.dsr.clases;

public class Taco {
 public String tipoDeTortilla;
 public String guisado;
 public int numeroDeTortilla;
 public String tamañoDeTortilla;
 public float precio;
 public int numDeTacos;
 
 
 
public Taco() {
}

public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamañoDeTortilla, float precio, int numDeTacos) {
	super();
	this.tipoDeTortilla = tipoDeTortilla;
	this.guisado = guisado;
	this.numeroDeTortilla = numeroDeTortilla;
	this.tamañoDeTortilla = tamañoDeTortilla;
	this.precio = precio;
	this.numDeTacos = numDeTacos;
}

//Metodo toString
@Override
public String toString() {
	return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla=" + numeroDeTortilla
			+ ", tamañoDeTortilla=" + tamañoDeTortilla + ", precio=" + precio + ",numDeTacos=" + numDeTacos + "]";
}


//Metodos get y set
public String getTipoDeTortilla() {
	return tipoDeTortilla;
}

public void setTipoDeTortilla(String tipoDeTortilla) {
	this.tipoDeTortilla = tipoDeTortilla;
}

public String getGuisado() {
	return guisado;
}

public void setGuisado(String guisado) {
	this.guisado = guisado;
}

public int getNumeroDeTortilla() {
	return numeroDeTortilla;
}

public void setNumeroDeTortilla(int numeroDeTortilla) {
	this.numeroDeTortilla = numeroDeTortilla;
}

public String getTamañoDeTortilla() {
	return tamañoDeTortilla;
}

public void setTamañoDeTortilla(String tamañoDeTortilla) {
	this.tamañoDeTortilla = tamañoDeTortilla;
}

public float getPrecio() {
	return precio;
}

public void setPrecio(double d) {
	this.precio = (float) d;
}

public int getNumDeTacos() {
	return numDeTacos;
}

public void setNumDeTacos(int numDeTacos) {
	this.numDeTacos = numDeTacos;
}





 
}
