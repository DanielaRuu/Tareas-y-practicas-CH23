package Funciones;

public class Funciones { // clase llamada Funciones

	// Las funciones se pueden declarar en cualquier lugar de la clase (si retorna
	// valores)
	public static int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}// cierre sumar

	public static int restar(int num1, int num2) {
		int resultadoResta = num1 - num2;
		return resultadoResta;
	}// cierre restar

	public static int multiplicar(int num1, int num2) {
		int resultadoMult = num1 * num2;
		return resultadoMult;
	}// cierre multiplicar

	public static int dividir(int num1, int num2) {
		int resultadoDiv = num1 / num2;
		return resultadoDiv;
	}// cierre dividir

	// Funcion para imprimir asteriscos (void)
	public static void imprimirAsteriscos() {
		System.out.println("*******************");
	}// Cierre imprimirAsteriscos

	// Funcion que combina distintos tipos de valores
	public static float sumaDecimal(float valor1, int valor2) {
		return valor1 + valor2;

		/*
		 * también se puede así int resultadoDecimal = (int) (valor1 + valor2); return
		 * resultadoDecimal;
		 */

	}// Cierre sumaDecimal

	// Funcion que usa Strings como argumentos
	public static String awitaDeLimon(String ingrediente1, String ingrediente2, String ingrediente3) {
		String recetaCompletada = ingrediente1 + ingrediente2 + ingrediente3;
		return recetaCompletada;
	} //Cierre awitaDeLimon
	
	
	
	
	
     
	

//Este metodo tiene como funcion, ejecutar cosas
	public static void main(String[] args) {

//Las invocaciones de la funcion se hacen generalmente dentro del metodo principal o main
		System.out.println("El resultado de la suma es: " + sumar(5, 8));

		imprimirAsteriscos();

		System.out.println("El resultado de la suma decimal es: " + sumaDecimal(5.7f, 5));

		System.out.println(
				"Estos son los ingrediente para preparar awita de limon: " + awitaDeLimon("agua ", "limón ", "azucar "));

		
		//Funciones de la biblioteca de matematicas (Math)
		
		double valorEjemplo = 7.65497834d;
		System.out.println("La raiz cuadradaa de mi valor es: " + Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es: " + Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valor es: " + Math.pow(valorEjemplo, 2));
		
		
	
		//Ejercicio Torre

		  //Calcula la altura de una torre que se encuentra a 100 metros de una persona, que observa la punta de la torre         con un angulo de elevacion de 30°
		 /*
		 *
		 *Levantamiento de requerimientos (lo que se necesita para hacerlo)
		 *-Tipos de datos
		 *-Torre recta (90°)
		 *-Estatura de la persona
		 *-Angulo de 30°
		 *-Base de 100 mts
		 *-Altura x
		 *-Usar funciones de la libreria
		 *-Impresiones en consola de todos los datos
		 * --tu base
		 * --tu altura
		 * -Datos del tipo double o float*/
		   
		        double anguloElevacion = 30; // Ángulo de elevación en grados
		        double distanciaBase = 100; // Distancia de la base de la torre en metros
		        double alturaTorre = distanciaBase * Math.tan(Math.toRadians(anguloElevacion)); // Fórmula para calcular la altura
		        System.out.println("Base: " + distanciaBase + " m"); // Imprimir la base
		        System.out.println("Altura: " + alturaTorre + " m"); // Imprimir la altura
		    
		
		
	}// cierre metodo main

	
	

}// cierre de clase Funciones





/*
 * 
 * 
 * Tipos de funciones bàsicas: -No retornan valores: No devuelven nadaa, no se
 * especifica nada, y no usan la palabra return -Si retornan valores: Se
 * especifica el tipo de dato del argumento, el tipo de valor que regresa y se
 * usa return para esto
 * 
 * 
 * - Sintaxis de las funciones que si retornan valores tipoDeRetorno
 * nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) { //
 * Cuerpo de la función }
 * 
 * - Sintaxis de las funciones que no retornan valores palabraReservada
 * nombreDeLaFuncion(){ //cuerpo de la funcion }
 * 
 * Cosas que debemos tomar en cuenta al momento de crear nuestras funciones: -
 * Deben de llevar un nombre unico - Opcionalmente podran recibir argumentos y
 * devolver el resultado - Se debe especificar el tipo de dato que vamos a pasar
 * como argumnto, y el resultado final de nuestra funcion - Cuidar el orden en
 * como estamos agregando nuestros parametros o argumentos.
 * 
 * 
 * 
 * 
 *
 */
