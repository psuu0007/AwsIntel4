package ana;

//중첩 for문으로 구현해보자
public class ControlTest163_2 {
	public static void main(String[] args) {
		// 10,9,8,7,6,
		// 사각형을 출력하시오
		for (int i = 0; i < 9; i++) {

			for (int j = 0; j < 8; j++) {

				System.out.print((j + 2) + " * " + (i + 1) + " = " 
					+ (j + 2) * (i + 1) + "\t ");

			}

			System.out.println();

		}

	}

}
