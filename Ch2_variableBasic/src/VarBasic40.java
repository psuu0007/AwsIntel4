
//키보드 입력받기

import java.util.Scanner;

public class VarBasic40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력해주세요:");
		int num = 0;
		char ch = 'A';
		String str = "형식지정자";
		
		num = scan.nextInt();
		
//		특수문자
		System.out.print("자\"바\"식 출력:\t" + num + "\n");
//		\b  \t  \n  \f  \r  \"  \'  \\ 
		System.out.print("자\\바식 출력:" + num + 0);
		
//		System.out.printf("C식 출력: %d %c %s", num, ch, str);
//		System.out.printf("C식 출력: %d %c %s", num, ch, str);
		
	}
	
}
