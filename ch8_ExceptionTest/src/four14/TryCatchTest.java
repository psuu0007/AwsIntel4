package four14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int myNum = 0;
		
		try {
			System.out.println("숫자만 입력하세요");
			myNum = scan.nextInt();
			
			System.out.println("내가 입력한 숫자: " + myNum);
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("한글은 입력하시면 안되요");
			
		}
		
	}

}
