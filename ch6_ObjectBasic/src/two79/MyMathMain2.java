package two79;

public class MyMathMain2 {

	public static void main(String[] args) {
		
		MyMath2 myMath = new MyMath2();
		
		int result1 = 0; 
		int num1, num2 = 0;
		
		num1 = 10;
		num2 = 3;
		
//		메서드 호출 방법 call
		result1 = myMath.add(num1, num2);
		System.out.println(result1);
		
		myMath.subtract(num1, num2);
		
		
	}
	
}
