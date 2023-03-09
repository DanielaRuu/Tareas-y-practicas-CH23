package ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExceptions{

	public static void main(String[] args) {
		Scanner dato = new Scanner (System.in);
		System.out.println("introduzca un valor: ");
		int divisor;
		
		
		try {
			divisor=Integer.parseInt(dato.next());
			int division = 10/divisor;
			System.out.println("--->" + division);
			
		}catch(ArithmeticException ae) {
			System.out.println("Capturando la excepción" + ae.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println("el dato es un caracter " + nfe.getMessage());
		}finally {
			System.out.println("Este bloque es opcional y se va a ejecutar con o sin la excepcion");
		}
		
		System.out.println("continuamos con el flujo de la aplicación");

	}

}
