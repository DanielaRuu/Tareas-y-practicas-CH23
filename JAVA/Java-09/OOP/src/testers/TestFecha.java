package testers;

import OOP.clases.Fecha;

public class TestFecha {
	public static void main(String[] args) {
		Fecha f = new Fecha ();
		f.setDia(6);
		f.setMes(03);
		f.setAño(2023);
		
		System.out.println(f.diaMesAño());
		
		//Metodo toString (el de sobreescritura)
		System.out.println("---> " + f.toString());
	
		
	}

}
