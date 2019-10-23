package differenciation;

public class Number implements IOperations {
	
	private double number;
	
	public Number(double number) {
		this.number = number;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(Double number) {
		this.number = number;
	}

	@Override
	public void showFunction() {
		System.out.println(number);
		
	}
	
	
}
