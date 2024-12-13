
//형변환 
//소수점이 모두 표현되도록 코드를 변경하시오
import java.util.Scanner;

public class VarTest82 {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		
		double resultNum = 0.0;
		Scanner scan = new Scanner(System.in);
//		출력문 단축키 = syso타이핑 후 ctrl + space
		System.out.println("두 수의 나눈 값의 몫을 구하여라");
		
		System.out.println("첫번째 값: ");
		x = scan.nextInt();
		
		System.out.println("두번째 값: ");
		y = scan.nextInt();
		
		resultNum = x / y;
		
		System.out.println(x + " / " + y + " = " + resultNum);
		
	}
	
}
