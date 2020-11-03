
public class administrativo extends dePlanta{
	
	private double bono;
	
	public administrativo(String nombre, String ingreso, String seccion,double sueldo) {
		super(nombre,ingreso,seccion,sueldo);
		this.bono = 5000;
	}

//	public double dineroAlmes() {
//		return sueldo + bono;
//	}
	
	public void agregarDinero() {
		super.dinero = sueldo+bono;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
