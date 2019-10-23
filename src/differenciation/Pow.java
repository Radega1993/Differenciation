package differenciation;

public class Pow implements IOperations{
	
	private double res;
	private double power;
	
	public Pow(double res, double number) {
		this.res = res;
		double aux = 1;
		for (int i = 1; i<=number; i++) {
			aux = aux * res;
		}
		power = aux;
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
