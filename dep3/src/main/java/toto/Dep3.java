package toto;

public class Dep3 {
	public Dep3(){
		
	}
	
	public void toto()
	{
		System.out.println("Toto In the dep3");
		Dep4 dp = new Dep4();
		dp.toto();
	}
}
