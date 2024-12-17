
public class MyMath2 {
//	return문은 현재 실행 중인 메서드를 종료하고 호출한 메서드로 되돌아간다
//	return이 없는 경우 리턴타입은 void로 작성한다
//	모든 메서드에는 적어도 하나의 return문이 있어야 한다.
	
	int add(int a, int b) {
		int result = a + b;
		
		return result;
	}
	
	void subtract(int a, int b) {
		
		int resultNum = 0;
		
		resultNum = a + b;
		
		System.out.println(resultNum);
		
	}
}
