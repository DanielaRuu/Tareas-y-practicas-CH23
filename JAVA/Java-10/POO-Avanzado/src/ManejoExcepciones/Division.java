package ManejoExcepciones;

public class Division {
	private int numerador;
	private int denominador;
	
	
	public Division(int numerador, int denominador) throws OperacionExceptions {
		
		if(denominador==0) {
			throw new OperacionExceptions("el denominador es un cero");
			
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarD() {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la división es: " + (this.numerador/this.denominador));

	}

	
	
}


