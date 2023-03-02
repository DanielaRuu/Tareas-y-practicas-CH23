package ciclos.control;

import java.util.Scanner;

import ciclos.forwhiledo.CicloDo;
import ciclos.forwhiledo.UsoFor;
import ciclos.forwhiledo.UsoWhile;

public class DoSwitch {
	//metodo
	public void controlador() {
		Scanner s = new Scanner(System.in);
		Menus mp = new Menus();
		UsoWhile objUW = new UsoWhile();
		UsoFor objUF = new UsoFor ();
		CicloDo objCD = new CicloDo();
		
		int opcion = 0;
		do {
			mp.menuPrincipal();
			System.out.print("Introduzca una opción: ");
			opcion = s.nextInt();
			switch (opcion) {
			case 1:
				objUW.cicloW();
				break;
			case 2:
				objUW.centinelaW();
				break;
			case 3:
				objUW.banderaW();
				break;
			case 4:
				objUF.cicloFor();
				break;
			case 5:
				objUF.letrasfor();
				break;
			case 6:
				objCD.digitosDo();
				break;

			default:
				break;
			}
			
		} while (opcion>0 && opcion<7);
		System.out.println("Terminamos bye!");

	}

}
