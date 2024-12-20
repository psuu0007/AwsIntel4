package ans.two83;

//오버로딩(Overloading)
public class CalcTest {

	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		int numInt = 3;
		int numInt2 = 10;
		long numLong = 4;
		long numLong2 = 5;
		double numDouble = 3.0;
		double resultCalc = 0;
		
		resultCalc = calc.division(numInt, numInt2);
		System.out.println(resultCalc);
		System.out.println();
		
		resultCalc = calc.division(numInt, numLong);
		System.out.println(resultCalc);
		System.out.println();
		
		resultCalc = calc.division(numLong, numLong2);
		System.out.println(resultCalc);
		System.out.println();
		
		resultCalc = calc.division(numInt2, numDouble);
		System.out.println(resultCalc);
		System.out.println();
	}
	
}

