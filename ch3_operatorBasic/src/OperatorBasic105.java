
// 내림처리 방법
public class OperatorBasic105 {

	public static void main(String[] args) {
		
		double num = 3.141592; 
		double resultNum = 0.0;
//							314         -> 3.14
		resultNum = (int)(num * 100) / 100.0;
		
		System.out.println("소수점 3번째 자리에서 내림 즉 2자리까지만 출력");
		System.out.println(num + " -> " + resultNum);
		
	}
	
}
