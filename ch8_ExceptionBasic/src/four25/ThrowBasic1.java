package four25;

import java.util.InputMismatchException;

// 예외 발생시키기
public class ThrowBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		프로그래머가 고의로 예외를 발생시킬 수 있다.
//		1. 연산자 new 를 이용해서 발생시키려는 예외 클래스의 객체를 만든 다음
//		Exception e = new Exception("고의로 발생시켰음");
//		
//		2.키워드 throw를 이용해서 예외를 발생시킨다
//		throw e;
		
		InputMismatchException ime = new InputMismatchException("쉽죠?");
		
		throw ime;
		
//		throw new InputMismatchException();
		
//		컴파일러가 예외처리를 확인하지 않는 RuntimeException 클래스들은 unchecked예외
//		라고 부르고, 
//		예외처리를 확인하는 Exception 클래스들은 checked 예외라고 부른다
		
	}

}
