package OOP.clases;

public class Fecha {
	private int dia;
	private int mes;
	private int año;

	// Metodo sobrecargado
	public Fecha() {
		super();
	}

//Metodo constructor
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}

	public String diaMesAño() {
		return "La fecha es: --> " + this.dia + "/" + this.mes + "/" + this.año;

	}
	
	
//Metodo sobreescrito (no es de la clase Fecha, está siendo heredado de la clase padre 'Object', se puede generar desde source y la opcion 'Generate toString'
@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}

	//Metodos get y set
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

}
