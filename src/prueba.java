
public class prueba {

	public static void main(String[] args) {
		
		administrativo a = new administrativo ("ua","12/01/1997","bodega",25000);		
		jerarquico j = new jerarquico("cr","13/04/2001","lalala",32000);
		
		vendedores v = new vendedores("lala","15/07/2004","30/12/2005",42000);
		fleteros f = new fleteros("lolo","01/09/2002","06/12/2003",50000);
		
		System.out.println(a.dineroAlmes());
		System.out.println(j.dineroAlmes());
		
		System.out.println(v.dineroAlmes());
		System.out.println(f.dineroAlmes());
	}
}
