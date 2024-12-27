package four90;

import java.util.Scanner;

public class WrapperBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		래퍼(Wrapper) 클래스
		
		String str = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력해줄래?");
		str = scan.nextLine();
		
		int n = 0;
		
//		System.out.println(n * str);
//		문자열을 숫자로 변환하기
		int tempStrNum = Integer.parseInt(str);
		
		System.out.println(n * tempStrNum);
		
		Double numDouble = Double.valueOf("30.1456");
		System.out.println(numDouble * 10);
	}

}
