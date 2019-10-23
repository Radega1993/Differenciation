package differenciation;

public class Sin implements IOperations{

	private double res;
	
	public Sin(double res) {
		
		this.res = Math.sin(res);

	}
	
	public double getRes() {
		return res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
}
