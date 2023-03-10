package com.dsr.clases.testers;

import com.dsr.clases.AlumnoB;
import com.dsr.clases.PersonaP;

public class TestPB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlumnoB a = new AlumnoB(123, 8.5, "Armando", 20);
		PersonaP b = new PersonaP("Fulanito", 28);
		System.out.println(a.getNombre());
		System.out.println(a.getPromedio());
		System.out.println(a.toString());
		System.out.println(b.toString());
		a.mostrarDatos();
		a.mostrarDatos("DeTal");

	}

}
