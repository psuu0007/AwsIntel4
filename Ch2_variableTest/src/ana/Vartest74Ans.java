package ana;

//기본형 타입
//실수 하나를 키보드 입력을 받는다.
//형변환 두 숫자를 교체하시오
import java.util.Scanner;

public class Vartest74Ans {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double num1 = 0.0;
		int num2 = 0;
		int swap1 = 0;
		double swap2 = 0.0;
		
		System.out.print("실수 입력: ");
		num1 = scan.nextDouble();
		System.out.print("정수 입력: ");
		num2 = scan.nextInt();
		
	//1번	
		swap2=(double)num2;
		swap1=(int)num1;
		
		System.out.println("바뀐 두 수: "+swap1+" "+swap2);
	//2번
		System.out.print("바뀐 두 수: "+(int)num1+" "+(double)num2);
		
	}
}
