package differenciation;

public class Cos implements IOperations{

	private double res;
	
	public Cos(double res) {
		
		Sin sin = new Sin(res);
		Pow pow = new Pow (sin.getRes(), 2);
		
		this.res = Math.sqrt(1-pow.getRes());

	}
	
	public double getRes() {
		return res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
}
