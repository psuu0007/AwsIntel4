package ana;


// 반복문-break
import java.util.Scanner;

public class ControlTest175 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		switch 문에서 배웠던 것이다. 모든 반복문에서
//		break 문을 사용할 수 있다.
//		break 문은 자신이 포함된 가장 가까운 반복문을 벗어난다
//		주로 if 문과 함께 사용되어 특정 조건을 만족하면 반복문을 벗어나도록 구현한다

		Scanner scan = new Scanner(System.in);

		int input = 0;
		int sum = 0;
		int count = 0;

		while (true) {
			System.out.print("금액을 입력하세요. 0을 입력하면 종료됩니다.");
			input = scan.nextInt();
			if (input == 0) {
				System.out.println(count + "번 구매한 총 금액은 " + sum + "입니다.");
				System.out.println("구매해 주셔서 감사합니다.");
				break;
			}
			sum = sum + input;
			count++;
			System.out.println("누적금액: " + sum);
		}
		System.out.println("프로그램 종료.");

	}

}