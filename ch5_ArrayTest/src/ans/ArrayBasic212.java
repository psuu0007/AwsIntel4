package ans;


//문자열 배열 다루기

import java.util.Scanner;

public class ArrayBasic212 {

	public static void main(String[] args) {

//      홀짝 게임, 아파트, 술게임, 롤, 오버워치라는 문자열을 배열에
//		있다
//      
//      사용자가 원하는 게임을 문자열로 입력한다

//		있으면 게임이 존재합니다 라고 출력하고
//		없으면 게임이 존재하지 않습니다 설치하겠습니까?
//				
//		라고 출력하는 프로그램을 구현

//		System.out.println(nameArr[1].equals(str));
		Scanner sc = new Scanner(System.in);
		String str = "";
		String[] nameArr = { "홀짝 게임", "아파트", "술게임", "롤", "오버워치" };
		boolean x = false;

		System.out.println("원하는 게임을 입력하세요");

		str = sc.nextLine();

		for (int i = 0; i < nameArr.length; i++) {
			if(nameArr[i].equals(str)) {
				System.out.println("게임이 존재합니다");
				break;
			} else if(i == nameArr.length-1) {
				System.out.println("게임이 존재하지 않습니다 설치하겠습니까?");
			}
		}

//		for (int i = 0; i < nameArr.length; i++) {
//			if (nameArr[i].equals(str)) {
//				x = true;
//				break;
//			}
//		}
//
//		if (x == true) {
//			System.out.println("게임이 존재합니다");
//		} else {
//			System.out.println("게임이 존재하지 않습니다 설치하겠습니까?");
//		}

	}

}
