package colecciones.dsr;

//si al importar se usa un asterisco importará todas las clases que contenga el paquete, o sea: import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MisCollection {

	public static void main(String[] args) {
 wrapperClass();
	}
	
	public void listasCollections() {
		// TODO Auto-generated method stub
		//Aqui estoy creando un objeto de una clase diferente (ArrayList), que esta implementando a list, es una clase hija de list
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);

	}
	
	//metodo imprimir
	private void imprimir(Collection collection) {
		// TODO Auto-generated method stub
		for (Object elementos : collection) {
			
		}

	}
	
	
//metodo
	 static void wrapperClass() {
		// TODO Auto-generated method stub
		 //datos primitivos byte, short, char, long, float, int, double
		 
		 byte numeroB = 12;
		 System.out.println("Tamaño de un byte " + Byte.SIZE);
		 System.out.println("Valor max " + Byte.MAX_VALUE);
		 System.out.println("Valor Min " + Byte.MIN_VALUE);
		 System.out.println(" ----> " + numeroB);
		 
		 int numeroI = 2147483647;
	 System.out.println("Tamaño de un entero bytes" + Integer.BYTES);
	 System.out.println("Tamaño de un entero " + Integer.SIZE);
	 System.out.println("Valor max " + Integer.MAX_VALUE);
	 System.out.println("Valor Min " + Integer.MIN_VALUE);
	 System.out.println(" ---> " + numeroI);
	 
	 System.out.println("Tamaño de un short bytes" + Short.BYTES);
	 System.out.println("Tamaño de un short " + Short.SIZE);
	 System.out.println("Valor max " + Short.MAX_VALUE);
	 System.out.println("Valor Min " + Short.MIN_VALUE);
	 
	 System.out.println("Tamaño de un long bytes" + Long.BYTES);
	 System.out.println("Tamaño de un long " + Long.SIZE);
	 System.out.println("Valor max " + Long.MAX_VALUE);
	 System.out.println("Valor Min " + Long.MIN_VALUE);
	 
	 System.out.println("Tamaño de un double bytes" + Double.BYTES);
	 System.out.println("Tamaño de un double " + Double.SIZE);
	 System.out.println("Valor max " + Double.MAX_VALUE);
	 System.out.println("Valor Min " + Double.MIN_VALUE);
	 
	 System.out.println("Tamaño de un float bytes" + Float.BYTES);
	 System.out.println("Tamaño de un float " + Float.SIZE);
	 System.out.println("Valor max " + Float.MAX_VALUE);
	 System.out.println("Valor Min " + Float.MIN_VALUE);
	 }

	}

