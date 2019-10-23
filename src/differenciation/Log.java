package differenciation;

public class Log implements IOperations{

	private double res;
	
	public Log(double res) {
		
		this.res = Math.log(res);

	}
	
	public double getRes() {
		return res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
}
