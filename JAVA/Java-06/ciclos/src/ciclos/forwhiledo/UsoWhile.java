package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile {
	Scanner entrada = new Scanner(System.in);

	public void cicloW() {
		System.out.println("Ciclo while");
		// Esta variable va a controlar al ciclo while en su iterador
		int iterador = 0;
		while (iterador < 10) {
			System.out.println("Iterador " + iterador);
			iterador = iterador + 1;
		}

	}

	// While uso centinela
	public void centinelaW() {
		System.out.println("Ciclo while centinela");
		// la palabra reservadaa final sirve para hacer que el valor de la variable sea
		// fijo, como en una constante
		final int centinela = -1;
		System.out.print("Introduzca una nota: ");
		int nota = entrada.nextInt();
		while (nota != centinela) {
			System.out.println("La nota es: " + nota);
			System.out.print("Introduzca una nota: ");
			nota = entrada.nextInt();

		}
		System.out.println("FIN");
	}

	// los metodos static no nesecitan crear/ declarar objetos para poder llamar sus
	// metodos, porque al ser static ya tienen los objetos creado en la memoria,
	// entonces solo se les llama.
	/*public static double banderaW() {
		System.out.println("Hola soy el metodo estatico");
		Math.pow(2, 2);*/
	
		
		//clase estatica Math tiene todos los metodos para hacer operaciones matematicas

	public void banderaW() {
		System.out.println("Ciclo while bandera");
		boolean valorb = false;
		while (!valorb) {
			System.out.println("Introduzca un valor numerico: ");
			int valorx = entrada.nextInt();
			if (valorx > 0 && valorx < 5) {
				int potaxio = (int) Math.pow(valorx, 2);
				System.out.println("el resultado --> " + potaxio);
				
			} else {
				valorb = true;
				System.out.println("BYE");

			}
			
		}
	
	
	}
}
