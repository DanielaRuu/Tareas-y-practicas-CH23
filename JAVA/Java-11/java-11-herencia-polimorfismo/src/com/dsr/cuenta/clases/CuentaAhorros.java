package com.dsr.cuenta.clases;

public class CuentaAhorros extends Cuenta{
	private boolean activa;
	
	public CuentaAhorros(float saldo, float tasaAnual) {
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
