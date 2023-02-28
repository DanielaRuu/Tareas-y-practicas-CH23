package tiposDeDatosYVariables;

public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		 System.out.println("Puede conducir un coche");
		} else {
		 System.out.println("No puede conducir un coche");
		}


		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		System.out.println("El usuario es Juan Pérez");
		} else {
		 System.out.println("El usuario no es Juan Pérez");
		}

		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		 System.out.println("La condición es falsa");
		} else {
		 System.out.println("La condición es verdadera");
		}
		
		
		//Ejercicios 
		//1.Verificar si un número es par y positivo:
		
			int num = 6;
		if((num%2 == 0)&& (num > 0)) {
			System.out.println("Si es positivo y par");
		}
		else {
			System.out.println("No cumple las condiciones");
		}
		
		

		//2.Verificar si un número está dentro de un rango específico
		int nume = 10;
		if((nume >0) && (nume <= 50)) {
			System.out.println("El numero está dentro del rango");
		}
		else {
			System.out.println("El numero no está dentro del rango");
		}

		//3.Verificar si una cadena es igual a otra o no
		String cadena1 = "Hola";
		String cadena2 = "hola";
		
		if(cadena1 == cadena2){
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
				
	}

}

//EJEMPLOS
/*¿Es un número positivo y menor que 10?

		java

		int numero = 7;
		boolean esPositivoYMenorQue10 = numero > 0 && numero < 10;
		System.out.println(esPositivoYMenorQue10); // salida: true

		En este ejemplo, se tiene una variable numero de tipo int que contiene el valor 7. La variable esPositivoYMenorQue10 utiliza los operadores lógicos && (AND) para evaluar si el número es mayor que cero y menor que 10. Como ambas condiciones se cumplen, la respuesta es true.

		    ¿Es un número par o múltiplo de 3?

		java

		int numero = 9;
		boolean esParOMultiploDe3 = numero % 2 == 0 || numero % 3 == 0;
		System.out.println(esParOMultiploDe3); // salida: true

		En este ejemplo, se tiene una variable numero de tipo int que contiene el valor 9. La variable esParOMultiploDe3 utiliza los operadores lógicos || (OR) para evaluar si el número es par o múltiplo de 3. Para determinar si es par, se utiliza el operador % (módulo) para obtener el resto de la división entre el número y 2. Si el resto es cero, significa que el número es par. Para determinar si es múltiplo de 3, se utiliza el operador % para obtener el resto de la división entre el número y 3. Si el resto es cero, significa que el número es múltiplo de 3. Como el número 9 es múltiplo de 3, la respuesta es true.

		    ¿Es un número negativo o igual a cero?

		java

		int numero = 0;
		boolean esNegativoOIgualACero = numero <= 0;
		System.out.println(esNegativoOIgualACero); // salida: true

		En este ejemplo, se tiene una variable numero de tipo int que contiene el valor 0. La variable esNegativoOIgualACero utiliza el operador lógico <= (menor o igual que) para evaluar si el número es negativo o igual a cero. Como el número es igual a cero, la respuesta es true.
*/
