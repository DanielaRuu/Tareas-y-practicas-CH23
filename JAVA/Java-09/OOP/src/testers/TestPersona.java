package testers;

import OOP.clases.Persona;

public class TestPersona {
	public static void main(String[] args) {
		Persona p = new Persona();
		System.out.println("--->" + p.nombre);
		//Metodo Set reasigna
		p.setNombre("Maria");
		//Metodo get permite acceder para imprimir
		System.out.println("---> " + p.getNombre() );
		
		Persona p0 = new Persona("Pepe");
		System.out.println("---> " + p0.getNombre());
		
		Persona p1 = new Persona ("Fulanito", 20 , 1.60, 70.5, "Leo");
		System.out.println("----> " + p1.datosPersona());
		
	}

}


