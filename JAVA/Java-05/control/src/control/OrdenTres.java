package control;

import java.util.Scanner;

public class OrdenTres {
Scanner dato = new Scanner(System.in);

public void numero () {
	System.out.println("Introduzca el primer numero: ");
	int vari1 = dato.nextInt();
	System.out.println("Introduzca el segundo numero: ");
	int vari2 = dato.nextInt();
	System.out.println("Introduzca el tercer numero: ");
	int vari3 = dato.nextInt();
	
	if (vari1 < vari2 && vari1 < vari3){
		System.out.println(vari1 + " es menor");
	}else if (vari2 < vari3 && vari2 < vari1){
		System.out.println(vari2 + "es menor");
	}else 
}
}
