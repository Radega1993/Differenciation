package differenciation;

/**
 * 
 * @author raul
 *Aproximación por Taylor del sin()
 */
public class Sin implements IOperations{

	private double res;
	
	public Sin(double res) {
		this.res = res;
		
		double s = 0.0;
		double signo = 1.0;
		
		for(int i=0; i<10; i+=2) {
			Pow power = new Pow(res, i);
			s += signo*power.getRes() / factorial(i);
			signo *= -1;
		}
		this.res = s;
	    
	}
	
	public int factorial (double valor) {
		int result = 1;
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
