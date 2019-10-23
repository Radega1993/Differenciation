package differenciation;

public class Client {

	public static void main(String[] args) {
		System.out.println("Expressió a avaluar : sin(pi/2 + xˆ2) amb x = 4.0");
		
		Number x = new Number(4.0);
		Number pi = new Number(Math.PI);
		Number number = new Number(2.0);
		Division div = new Division(pi.getNumber(), number.getNumber());
		Pow pow = new Pow(x.getNumber(), number.getNumber());
		Sum suma = new Sum(div.getRes(), pow.getRes());
		Sin sin = new Sin(suma.getRes());
		
		Function loss = new Function();
		
		loss.addOperation(sin);
		System.out.println("solució computada");
		loss.showFunction();
		
		double real = Math.sin(pi.getNumber()/number.getNumber() + Math.pow(x.getNumber(), number.getNumber()));
		System.out.println("solució real");
		System.out.println(real);

		
		
		double diferencia = sin.getRes() - real;
		System.out.println("Diferencia valor " + diferencia);
		
	}
	 
}
