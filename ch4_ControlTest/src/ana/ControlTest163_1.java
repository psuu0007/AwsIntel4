package ana;

//중첩 for문으로 구현해보자
public class ControlTest163_1 {
	public static void main(String[] args) {
		// 10,9,8,7,6,
		// 사각형을 출력하시오

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 9; j++) {
			
				System.out.print((i+2)+" * "+(j+1)+" = "+(i+2)*(j+1));
				System.out.println();
			}

//			System.out.println("");

		}

	}
	
}
