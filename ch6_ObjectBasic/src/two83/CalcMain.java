package two83;

//오버로딩(Overloading)
public class CalcMain {
	
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		int num1 = 3;
		int num2 = 10;
		
//		int result = 0;
		long result = 0;
		
		result = calc.add(num1, num2);
		System.out.println(result);
		
//		result = calc.add(num1, (long)num2);
		result = calc.add(num1, (long)num2);
		System.out.println(result);
		
	}
	
}
