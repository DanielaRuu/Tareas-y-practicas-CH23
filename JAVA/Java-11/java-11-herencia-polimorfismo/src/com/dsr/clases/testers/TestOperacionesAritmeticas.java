package com.dsr.clases.testers;

import com.dsr.clases.Mensajes;
import com.dsr.clases.OperacionesAritmeticas;
import com.dsr.clases.Suma;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		
		//Se puede hacer instancia o referencia: 
		
		//aqui la instancia:
		Suma sum= new Suma(5,2);
		
		//aqui la referencia:
		OperacionesAritmeticas sumi = new Suma(10,3);
		//aqui otra referencia:
		Mensajes sss = new Suma();
		
		System.out.println("Suma " + sum.sumar());
		System.out.println("Operaciones Aritmeticas " + sumi.sumar());
		sum.mensaje();
		sss.mensaje();

	}

}
