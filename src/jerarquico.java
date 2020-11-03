
public class jerarquico extends dePlanta{

	public jerarquico(String nombre, String ingreso, String seccion,double sueldo) {
		super(nombre, ingreso, seccion,sueldo);		
	}
	
//	public double dineroAlmes() {		
//		return sueldo + (sueldo*10/100);
//	}
	
	public void agregarDinero() {
		super.dinero=sueldo+(sueldo*10/100);
	}
	
	public String toString() {
		return super.toString();
	}
}
