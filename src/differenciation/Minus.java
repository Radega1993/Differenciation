package differenciation;

public class Minus implements IOperations{
	

	private double res;
	
	public Minus(double number, double res) {

		res -= number;
	}
	
	public double getRes() {
		return res;
	}

	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
	
}