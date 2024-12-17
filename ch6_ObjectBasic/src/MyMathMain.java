
public class MyMathMain {

	public static void main(String[] args) {
		
		MyMath myMath = new MyMath();
		
		int result1 = 0; 
		
//		메서드 호출 방법 call
		result1 = myMath.add(5, 3);
		System.out.println(result1);
		
		result1 = myMath.subtract(5, 3);
		System.out.println(result1);
		
	}
	
}
