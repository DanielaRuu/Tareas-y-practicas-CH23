class HolaMundi{
	public static void main (String [] args){
		System.out.print("Hola mundo desde Java");
//Instancia en 3 pasos
//1.La referencia: aqui estoy declarando el objeto de tipo clase:
		Saludo objSaludo;
//2.Crear el objeto con el operador new y em método constructor
		objSaludo = new Saludo();
//3.LLamar, pedir, solicitar la acción del método saludar con el operador punto:
		objSaludo.saludar();
	}
}
