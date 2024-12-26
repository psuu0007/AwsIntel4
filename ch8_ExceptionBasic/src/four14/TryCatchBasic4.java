package four14;

import java.util.Scanner;

public class TryCatchBasic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println(1);
		System.out.println(2);
		
		
		
		try {
			System.out.println("입력 ㄱㄱ");
			int str = scan.nextInt();
			System.out.println(3);
//			System.out.println(0/0);
//			System.out.println(str.equals("null 예외수행"));
			System.out.println(str * 10);
			System.out.println(4);
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			// TODO: handle exception
			System.out.println("이건 수학과 관련된 예외처리가 있는 클래스야");
			System.out.println(5);
		} catch (NullPointerException ne) {
			ne.printStackTrace();
			// TODO: handle exception
			System.out.println("이건 null과 관련된 예외처리가 있는 클래스야");
			System.out.println(6);
		}
		
		System.out.println(7);
		
		
	}

}
