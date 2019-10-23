package differenciation;

public class Pow implements IOperations{
	
	private double res;
	private double power;
	
	public Pow(double res, double number) {
		this.res = res;
		
		for (int i = 1; i<=number; i++) {
			res = res * number;
		}
		power = res;
	}
	
	public double getRes() {
		return power;
	}
	
	public void setRes(double power) {
		this.power = res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
	
}
