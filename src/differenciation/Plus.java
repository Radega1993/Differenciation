package differenciation;

public class Plus implements IOperations{
	
	private double res;
	
	public Plus(double number, double res) {

		res = res * number;
	}
	
	public double getRes() {
		return res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
	
}
