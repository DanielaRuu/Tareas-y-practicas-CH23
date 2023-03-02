package ciclos.forwhiledo;

public class UsoFor {
	public void cicloFor() {
		System.out.println("Uso de ciclo For");
		for (int i = 0; i <= 10; i++) {
			System.out.println("el iterador --> " + i);
			
		}

	}
	public void letrasfor() { 
		System.out.println("For con letras");
		
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print("soy -->" + i + ", ");
			char letra = (char) i;
			System.out.println();
			System.out.print("soy ---> " + letra + ", "); 
		
		/*Forma 2 de lograrlo: for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println("soy --> " + Character.toSting((char)i) + ", ");
			
		Forma 3 de lograrlo: for (int i = 'A'; i <= 'Z'; i++) {
			System.out.println("soy --> " + (char)i + ", ");*/
			
		}

	}

}
