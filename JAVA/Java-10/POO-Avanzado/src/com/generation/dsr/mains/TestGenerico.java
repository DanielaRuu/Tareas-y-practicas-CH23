package com.generation.dsr.mains;

import com.generation.dsr.clases.ClaseGenerica;

public class TestGenerico {
	public static void main(String[] args) {
		
		ClaseGenerica <Integer> intObj = new ClaseGenerica <Integer>(55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica <String>("prueba");
		
		intObj.claseTipo();
		caracteresObj.claseTipo();
	}

}
