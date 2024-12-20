package two83;

//오버로딩(Overloading)
public class Calc {

//	오버로딩이란
//	메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 때문에
//	각기 다른 이름을 가져야 한다
//	
//	한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것을 
//	'메서드 오버로딩' 또는 간단히 오버로딩 이라 부른다
//	
//	사전적 의미로는 과적하다, 즉 많이 싣는 것을 뜻한다
//	
//	*오버로딩의 조건
//	1.메서드 이름이 같아야 한다
//	2.매개변수의 개수 또는 타입이 달라야 한다
//	반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다
	
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
