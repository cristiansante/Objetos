
public abstract class Empleados {
	
	private String nombre;
	private String ingreso;
	protected double dinero; //segun la profe no va
	
	public Empleados(String nombre, String ingreso) {		
		this.nombre = nombre;
		this.ingreso = ingreso;
		this.dinero = 0;
	}
	
	//abstract public double dineroAlmes();
	
	abstract public void agregarDinero(); //se implementa en las subclases
	
	public double dineroAlmes() { //solamente devuelve la variable
		return this.dinero;
	}
	
	public String toString() {
		return "nombre"+ nombre + "fecha" + ingreso;
	}
}
