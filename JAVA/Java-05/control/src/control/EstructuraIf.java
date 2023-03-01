//En este paquete van los metodos principales
//Estructura de control If
package control;

import java.util.Scanner;

public class EstructuraIf {
	//entrada es el objeto, new construye al objeto
Scanner entrada = new Scanner(System.in);

	public void controlIf() {
		// TODO Auto-generated method stub
		
		/*
		  
		if (condition) {
			
		}
	*/
		
		long nota = 4;
		if (nota > 5) {
			System.out.println("Nota aprobada" + nota); 
		}
		System.out.println("continua control de flujo...");
		
		/*
		 if (condition) {
			
		} else {

		} 
		
		*/
		
		if (nota >= 5) {
			System.out.println("Nota aprobada" + nota);
		} else {
			System.out.println("Nota no aprobada" + nota);
		}
		System.out.println("continua control de flujo...");

	}


public void divisible() {
	// TODO Auto-generated method stub
	System.out.print("Introduzca un numero: ");
	int dato1 =  entrada.nextInt();
	System.out.print("Introduzca otro numero: ");
	int dato2 = entrada.nextInt(); 
	if (dato1 % dato2 == 0) {
		System.out.println(dato1 + " es divisible entre " + dato2);
	}else { 
		System.out.println(dato1 + " no es divisible entre "+ dato2);
	}
	
}
	

public void compara() {
	System.out.print("Introduzca un numero: ");
	int valor1 =  entrada.nextInt();
	System.out.print("Introduzca otro numero: ");
	int valor2 = entrada.nextInt(); 
	if (valor1 > valor2) { System.out.println(valor1 + " es mayor a " + valor2);
		
	} else {System.out.println(valor1 + " es menor a " + valor2);

	}
}

public void anidado() {
	/*Sintáxis:
	if (condition) {
		
	} else if(condition){

	} else {
		
	}*/
	System.out.print("Introduzca un numero: ");
	int mayor1 =  entrada.nextInt();
	if (mayor1 > 0) {
		System.out.println("numero positivo " + mayor1);
		
	} else if(mayor1 < 0) {
		System.out.println("numero negativo " + mayor1);
	}
	else {
		System.out.println("numero igual a cero ");
	}
}
}





