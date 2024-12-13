package ana;
//형변환
import java.util.Scanner;

public class VarTest74Ans2 {
	public static void main(String[] args) {
		
//		실수 하나를 키보드 입력을 받는다
//		
//		11.123
//		
//		서로 값이 좀 달라진다고 쳐도 일단 그냥 두 숫자가 바뀌어서 출력되면 성공
		double doubleOne;
		int temp1;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("실수를 하나 입력해주세요:");
		doubleOne = scan.nextDouble();
		
		int num = 0;
		
		num = 100;
		temp1 = (int)doubleOne;
		doubleOne = num;
		num = temp1;
		
		System.out.println(num);
		System.out.println(doubleOne);

	}

}
