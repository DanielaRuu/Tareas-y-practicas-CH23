// Estructura de control multiple

package control;

import java.util.Scanner;

public class EstructuraMultiple {
Scanner dato = new Scanner(System.in);

//Practica para verificar si una letra es vocal
	public void vocal() {
	System.out.println("Introduzca una letra: ");
	//aquí abajo se le indica donde recibir el dato que el usuario introduce
	char letra = dato.next().charAt(0);
	switch(letra){
	case 'a': case 'A' :
	case 'e': case 'E' :
	case 'i': case 'I' :
	case 'o': case 'O' :
	case 'u': case 'U' :
		System.out.println(" es vocal ");
			break;
			
		default: 
			System.out.println("El caracter no es vocal ");
			break;
	}
	}
	
	//Practica para verificar notas aprobatorias o reprobatoria
	public void notas() {
		System.out.println("Introduzca la nota: ");
		//aquí abajo se le indica donde recibir el dato que el usuario introduce
		int nota = dato.nextInt();
		switch (nota) {
		case 10: System.out.println("Excelente"); break;
		case 9: System.out.println("Muy bien"); break;
		case 8: System.out.println("Bueno"); break;
		case 7: System.out.println("Regullar"); break;
		case 6: System.out.println("Deficiente"); break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: System.out.println("Reprobado");
			break;
			
			default:
				System.out.println("Fuera de rango");
				break;
		}
}
	
	
	/* Estructura de control ternario
	 *   ?: Operador Elvis o ternario (funciona como un if)
	 *   Sintaxis:
	 *   
	 *   variable = (PL) ? entrada verdad : entrada falso
	 *   
	 *   
	 */
	public void ternario() {
		System.out.print("Introduzca un valor numerico:  ");
		int entradaV = dato.nextInt();
		System.out.println("Introduzca otro valor numerico");
		int entradaF = dato.nextInt();
		int menor =(entradaV <= entradaF) ? entradaV : entradaF;
		System.out.println("------> " + menor);
				
	}
}
