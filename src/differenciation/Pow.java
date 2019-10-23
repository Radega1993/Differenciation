package differenciation;

public class Pow implements IOperations{
	
	private double res;
	private double power;
	
	public Pow(double res, double number) {
		this.res = res;
		
		power = Math.pow(res, number);
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
