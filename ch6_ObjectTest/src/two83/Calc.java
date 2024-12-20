package two83;

//오버로딩(Overloading)
public class Calc {

//	더하기, 나누기만 구현한다
	
//	소수점 2번째 자리에서 내림처리한다 첫번째 자리 까지 구하기
//	123.1
	
//	나누기도 오버로딩으로 int, double, double, int, double, double 이렇게 3개 구현해본다
	
	int add(int a, int b) {
		System.out.println("int a, int b");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.println("int a, long b");
		long result = a + b;
		
		return result;
	}
	
	long add(long a, int b) {
		System.out.println("long a, int b");
		long result = a + b;
		
		return result;
	}
	
	long add(long a, long b) {
		System.out.println("long a, long b");
		
		long result = a + b;
		return result;
	}
	
}
