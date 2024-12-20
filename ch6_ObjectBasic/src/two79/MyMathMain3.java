package two79;

public class MyMathMain3 {

	public static void main(String[] args) {
		
		MyMath3 myMath3 = new MyMath3();
		
		int result1 = 0; 
		
		myMath3.a = 100;
		myMath3.b = 10;
		
//		메서드 호출 call
		result1 = myMath3.add();
		System.out.println(result1);
		
		myMath3.subtract();
		
		
	}
	
}
