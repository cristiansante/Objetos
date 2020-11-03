
public abstract class transitorio extends Empleados{
	
	private String finaliza;
	
	public transitorio(String nombre, String ingreso, String finaliza) {
		super(nombre, ingreso);
		this.finaliza = finaliza;	
	}

	//abstract public double dineroAlmes();
	
	abstract public void agregarDinero();
	
	public String toString() {	
		String s = super.toString();
		s = s + finaliza;
		return s;
	}
	
}
