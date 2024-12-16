
//자동 형변환
public class VarBasic82 {

	public static void main(String[] args) {
		/*
		 * 
		 * 형변환 방법 
		 * (타입)피연산자
		 */
	/*
		1		2		4		8		4		8byte
		byte -> short -> int -> long -> float -> double
				char  ->
		기본형의 자동 형변환이 가능한 방향
		
		자동 형변환의 규칙
		좁은 타입에서 넓은 타입으로 형변환하는 경우에는 값 손실이 없으므로
		두 타입 중에서 표현범위가 더 넓은 쪽으로 형변환된다
		
		큰 값에서 작은 값으로의 자동 형변환은 불가능하고 꼭 연산 및 대입을
		하려는 경우에는 casting 연산을 수행해야 한다
		
		1.boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
		2.기본형과 참조형은 서로 형변환할 수 없다
		3.서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
		값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다
		* 기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다
		
	*/
		int intNum = 42;
		double doubleNum = 0;
		
		System.out.println("인트값: " + intNum);
		System.out.println("실수값: " + doubleNum);
		
		doubleNum = intNum;
		System.out.println("실수값: " + doubleNum);
		
		intNum = (int)doubleNum;
		System.out.println("인트값: " + intNum);
		
//		long longNum = 2100000000 + 100000000;
		long longNum = 9142;
		System.out.println("longNum: " + longNum);
		
		intNum = (int)longNum;
		System.out.println("intNum: " + intNum);
		
		longNum = intNum;
		System.out.println("longNum: " + longNum);
		
		doubleNum = longNum;
		System.out.println("doubleNum: " + doubleNum);
		
		longNum = (long)(doubleNum + 0.11114532);
		System.out.println("longNum: " + longNum);
		
		float floatNum = 9000L;
		System.out.println("floatNum: " + floatNum);
		
//		longNum = floatNum;
//		System.out.println("longNum: " + longNum);
	}
	
}
