package differenciation;

public class Sum implements IOperations{
	
	private double res;
	private double suma;
	
	public Sum(double res, double number) {
		
		this.res = res;
		
		suma = res+number;
	}
	
	public double getRes() {
		return suma;
	}

	public void setRes(double suma) {
		this.suma = res;
	}

	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
	
}