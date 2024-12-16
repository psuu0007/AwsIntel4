
// 문자열 배열 다루기

import java.util.Scanner;

public class ArrayBasic205 {

	public static void main(String[] args) {

		String[] nameArr = new String[3];
		
		nameArr[0] = "홍길동";
		nameArr[1] = "이순신";
		nameArr[2] = "춘향이";
		
//		System.out.println(nameArr[0] == "홍길동");
		System.out.println("홍길동".equals(nameArr[0]));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 ㄱㄱ");
//		String str = scan.nextLine();
		String str = null;
		
		System.out.println(str);
//		System.out.println(str == nameArr[1]);
		System.out.println(nameArr[1].equals(str));
		
		if("이순신".equals(str)) {
			System.out.println(123243543);
		}
		
//		if(str.equals("이순신")) {
//			System.out.println(123243543);
//		}
	}

}
