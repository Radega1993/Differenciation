package differenciation;

public class Exp implements IOperations{

	private double res;
	
	public Exp(double res) {
		
		this.res = Math.exp(res);

	}
	
	public double getRes() {
		return res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
}
