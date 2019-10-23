package differenciation;

public class Cos implements IOperations{

	private double res;
	
	public Cos(double res) {
		
		this.res = Math.cos(res);

	}
	
	public double getRes() {
		return res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
}
