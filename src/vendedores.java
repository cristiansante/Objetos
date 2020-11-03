
public class vendedores extends transitorio{
	
	private double totalVentas;

	public vendedores(String nombre, String ingreso, String finaliza, double totalVentas) {
		super(nombre, ingreso, finaliza);
		this.totalVentas = totalVentas;
	}
	
//	public double dineroAlmes() {	
//		return totalVentas*20/100;
//	}
	public void agregarDinero() {
		super.dinero = totalVentas*20/100;
	}
	
	public String toString() {
		return super.toString();
	}
}
