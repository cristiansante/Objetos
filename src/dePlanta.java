
public abstract class dePlanta extends Empleados{
	
	private String seccion;
	protected double sueldo;
	
	public dePlanta(String nombre,String ingreso,String seccion,double sueldo) {
		super(nombre,ingreso);
		this.seccion = seccion;
		this.sueldo = sueldo;
	}
	
	//abstract public double dineroAlmes();
	
	abstract public void agregarDinero();
	
	public String toString() {
		String s = super.toString();
		s = s+ seccion;		
		return s;
	}
}
