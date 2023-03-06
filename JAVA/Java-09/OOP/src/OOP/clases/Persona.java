package OOP.clases;

public class Persona {
	//Al agregarle -private- a los atributos se vuelven miembros de clase, así nddie puede tener acceso a ellos más que la clase, están encapsulados.
	public String nombre = "Juan";
	private int edad;
	private double altura;
	private double peso;
	private String signoZ;
	
	//Metodo constructor sobrecargado
	public Persona() {
	
	}
	//Metodo para p0
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	//Método para p1
	public String datosPersona() {
		// TODO Auto-generated method stub
		return this.nombre + " " + this.edad + " " + this.altura + " " + this.peso + " " + this.signoZ;

	}

	//Esta es otra forma de acceder: con el metodo constructor que se genera desde -source-.Ls diferencia con el método constrcutor es que se le tienen que asignar valores a todos los atributos para que pueda correrlo.
	public Persona(String nombre, int edad, double altura, double peso, String signoZ) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
		this.signoZ = signoZ;
	}
	//Aquí ya generamos metodos get y set desde -source-, se pueden correr los atributos por separado, no es necesario asignarle valores a todos los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getSignoZ() {
		return signoZ;
	}
	public void setSignoZ(String signoZ) {
		this.signoZ = signoZ;
	}

}


