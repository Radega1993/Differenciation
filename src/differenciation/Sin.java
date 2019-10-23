package differenciation;

/**
 * 
 *Aproximación por Taylor del sin()
 */
public class Sin implements IOperations{

	private double res;
	
	public Sin(double res) {
		this.res = res;
		long s = 0;
		
		for(int i=0; i<10; i++) {
			Pow power = new Pow(res, 2*i+1);
			Pow signo = new Pow(-1, i);
			double value = 2*i+1;
			s += signo.getRes()*power.getRes() / factorial(value);
			
			
		}
		this.res = s;
	    
	}
	
	public long factorial (double valor) {
		long result = 1;
		for (int i = 1; i<=valor; i++) {
			result *= i;
		}
		return result;
	}
	

	
	public double getRes() {
		return res;
	}
	
	@Override
	public void showFunction() {
		System.out.println(res);
		
	}
}
