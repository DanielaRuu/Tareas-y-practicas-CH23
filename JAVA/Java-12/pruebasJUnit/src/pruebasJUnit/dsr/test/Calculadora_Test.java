package pruebasJUnit.dsr.test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJUnit.dsr.app.Calculadora;

class Calculadora_Test {
	private Calculadora ct;
	private Calculadora ct1 = null;

	@BeforeEach
	public void configurandoBefore() {
		// TODO Auto-generated method stub
		ct = new Calculadora();
		System.out.println("Ejecutando BeforeEach --> configurandoBefore");
	}

	
	@AfterEach
	public void configurandoAfter() {
		// TODO Auto-generated method stub
		ct = null;
		System.out.println("Ejecutando AfterEach --> configurandoAfter()");
		System.out.println("-----****************-----");
	}

	
	@Test
	public void calculadoraNull() {
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("Ejecutando primer test --> calculadora");
	}

	
	@Test
	public void calculadoraNotNull() {
		assertNotNull(ct, "La clase esta instanciada");
		System.out.println("Ejecutando segundo test --> calculadora");
	}
	
	
	/******************Primeras Pruebas************************/
	@Test
	public void primerosAssert() {
		/*
		 * 1. Indicar qué se va a evaluar
		 * 2. Indicar lo que se va a realizar
		 * 3. Evaluar con el assert indicado
		 * */
		
		//primer paso
		int resultadoEsperado = 10;
		int resultadoActual;
		//segundo paso
		resultadoActual = ct.sumar(7, 3);
		//tercer paso
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test --> primerosAssert()");
	}
	
	
	//Otra forma de hacer los 3 pasos:
	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, calculadora.sumar(10,10));
		System.out.println("Ejecutando cuarto test --> primerosAssert()");
	}
	
	
	/******************t}Tipos de Test************************/
	
	@Test
	public void tiposAsserts() {
		// TODO Auto-generated method stub
		assertTrue(1==1);
		assertEquals("Generation", "Generation");
		assertNull(ct1);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		assertSame(c1, c3);
		assertNotSame(c2, c3);
		//los primeros 2 indices le indican los valores a comparar, 
		//el tercer indice le indica la tolerancia en cuanto a la diferencia 
		//que se puede aceptar en la comparacion de los valores
		assertEquals(1, 1.5,.5);
	}
	
	
	@Test
	public void validandosuma() {
		assertEquals(11, ct.sumar(5, 6));
	}
	
	
	@Test
	public void validandoResta() {
		assertEquals(50, ct.restar(56, 6));
	}
	
	
	@Test
	public void validandoRestaNegativa() {
		assertEquals(-10, ct.restar(10, 20));
	}
	
	
	
	@Test
	public void validandoDivision() {
		// TODO Auto-generated method stub
		assertEquals(2, ct.division(10, 5));
	}
	
	/*
	@Test
	public void validandoByZero() {
		//Esto: ()->     es una lamda 
		assertThrows(ArithmeticException.class, 
		()->ct.divisionByZERO(10, 0),"No se puede dividir por cero");
	} */
	
	
	//Esta notacion (disable) es para hacer que el test de un metodo no se ejecute, lo inhabilita o desactiva
	@Disabled("En espera")
	@Test
	public void validandoByZero() {
		//Esto: ()->     es una lamda 
		assertThrows(ArithmeticException.class, ()->ct.divisionByZERO(10, 0),"No se puede dividir por cero");
	}
	

	
}

