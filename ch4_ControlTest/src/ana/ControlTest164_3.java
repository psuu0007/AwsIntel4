package ana;

public class ControlTest164_3 {

	public static void main(String[] args) {

//      삼각형을 출력하시오
//          *
//         **
//        ***
//       ****
//      *****
		for (int i = 0; i <= 4; i++) {
			for (int k = 3; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}