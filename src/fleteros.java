
public class fleteros extends transitorio{
	
	double valorTotalKm;

	public fleteros(String nombre, String ingreso, String finaliza, double valorTotalKm) {
		super(nombre, ingreso, finaliza);
		this.valorTotalKm = valorTotalKm;
	}
	
//	public double dineroAlmes() {
//		return valorTotalKm;
//	}
	
	public void agregarDinero() {
		super.dinero = valorTotalKm;
	}
	
	public String toString() {
		return super.toString();
	}
}
