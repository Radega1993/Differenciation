package differenciation;

public class Client {

	public static void main(String[] args) {
		System.out.println("Expressió a avaluar : sin(pi/2 + xˆ2) amb x = 4.0");
		
		Number x = new Number(4.0);
		Number pi = new Number(Math.PI);
		Number number = new Number(2.0);
		Division div = new Division(pi.getNumber(), number.getNumber());
		Pow pow = new Pow(x.getNumber(), 2);
		Sum suma = new Sum(div.getRes(), pow.getRes());
		Sin sin = new Sin(suma.getRes());
		
		Function loss = new Function();
		
		loss.addOperation(sin);
		loss.showFunction();
	}

}
