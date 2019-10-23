package differenciation;

public class Division implements IOperations{

	public double res;
	public double number;
	private double division;
	
	public Division (double res, double number) {
		
		this.res = res;
		this.number = number;
		
		division = res/number;
	}
	
	public double getRes() {
		return division;
	}
	
	public void setRes(double division) {
		this.division = res;
	}

	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
	
}
