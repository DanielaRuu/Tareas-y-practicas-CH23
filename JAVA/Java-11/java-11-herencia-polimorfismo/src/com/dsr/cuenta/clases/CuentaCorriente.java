package com.dsr.cuenta.clases;

public class CuentaCorriente extends Cuenta{
	private float sobregiro = 0;
	

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// TODO Auto-generated constructor stub
	}

	
	
	public void consignar(float nCantidad) {
		this.saldo += nCantidad;
	}
	
	public void retirar (float nCantidad ) {
		this.saldo -= nCantidad;
	}


	
	public void extractoMensual() {
		
	}
	
	public void imprimir () {
		
	}

}



