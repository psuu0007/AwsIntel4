package ans;

import java.util.Scanner;

public class ArrayBasic205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		구구단/2단만/결과값을 배열에 저장하고 출력할 때 활용하시오

		int[] numArr = new int[9];
//		String str = "";
//		String[] strArr = new String[9];

		for (int i = 0; i < 9; i++) {
			numArr[i] = 2 * (i + 1);
			System.out.println("2 * " + (i + 1) + " = " + numArr[i]);
		}
	}

}
