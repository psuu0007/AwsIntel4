package ana;
import java.util.Scanner;
// 조건문 if-else-if 중첩문
public class ControlTest140_2 {

	public static void main(String[] args) {

//		숫자를 하나 키보드로 입력 받는데 
//		-999을 입력받으면 프로그램을 종료한다
//		-999가 아닌 수를 입력받은 후
//		
//		다시 숫자를 입력받는데
//		1이면 남성
//		2이면 여성이라고 출력한다
//		
//		출력형태
//		프로그램을 켜실려면 -999가 아닌 숫자를 입력해주세요
//		종료하실려면 -999를 입력해주세요
//		
//		숫자를 입력해주세요
//		1.남성, 2.여성
//		
//		1인 경우
//		남성을 선택했습니다
//		
//		2인 경우
//		여성을 선택했습니다

		Scanner sc = new Scanner(System.in);
		System.out.println("-999가 아닌 수를 입력하세요.");
		int num = sc.nextInt();

		if (num != -999) {
			System.out.println("1.남성 \n2.여성");
			int gender = sc.nextInt();
			if (gender == 1) {
				System.out.println("남성을 선택했습니다"); // IF문에 IF문 //

			} else if (gender == 2) {
				System.out.println("여성을 선택했습니다");
			}
		} else if (num == -999) {
			System.out.println("프로그램을 종료");
		}
	}

}
