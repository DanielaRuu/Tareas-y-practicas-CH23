package colecciones.dsr;

//si al importar se usa un asterisco importará todas las clases que contenga el paquete, o sea: import java.util.*;
import java.util.*;
/*import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;*/

public class MisCollection {

	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//wrapperClass();
		//imprimir(c.listasCollections());
		//imprimir(c.setCollections());
		mapCollections();
	}
	
	private static void mapCollections() {
			Map miMap = new HashMap();
			miMap.put("valor1", "Juan");
			miMap.put("valor2", "Maria");
			miMap.put("valor3", "Arturo");
			miMap.put("valor3", "Karla");
			miMap.clear();
			miMap.remove("valor3");
			imprimir(miMap.keySet());
			imprimir(miMap.values());
			
			
			//return miMap;
	}
	
	
	Set setCollections() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.add("tres");
		miSet.add("cuatro");
		
		boolean c = miSet.contains("1");
		System.out.println("--->" + c);
		miSet.clear();
		boolean c1 = miSet.isEmpty();
		System.out.println("--->" + c1);
		
		Object[] A = miSet.toArray();
		for (int i = 0; i < A.length; i++) {
			System.out.println("Este es un set en arreglo " + A[i]);
			
		}
		
		
		
		return miSet;

	}
	
	private List listasCollections() {
		// TODO Auto-generated method stub
		//Aqui estoy creando un objeto de una clase diferente (ArrayList), que esta implementando a list, es una clase hija de list. En conjunto es una referencia.
		List miLista = new ArrayList();
		System.out.println(miLista + "Tamaño de la lista antes " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());
		
		miLista.add("1");
		miLista.add(0,2);
		miLista.add(3);
		miLista.add(0, "pato");
		
		//set quita u oculta un elemento, en el parntesis se le indica la posicion del elemento a quitar u ocultar, y la coleccion que modificara
		miLista.set(0, miLista);
		//remove si quita el elemento definitivamente, en el parentesis se le indica el indice o nombre del elemento a remover
		miLista.remove(0);
		
		
		System.out.println(miLista + "Tamaño de la lista despues " + miLista.size());
		System.out.println("esta vacia " + miLista.isEmpty());
		
		//contains confirma con true o false si un elemento esta contenido en la coleccion, en el parentesis se le indica el nombre del elemento
		boolean e = miLista.contains(2);
		System.out.println("---> " + e);
		
		return miLista;

	}
	
	//metodo imprimir
	private static void imprimir(Collection collection) {
		// TODO Auto-generated method stub
		for (Object elementos : collection) {
			System.out.println("elementos " + elementos);
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

