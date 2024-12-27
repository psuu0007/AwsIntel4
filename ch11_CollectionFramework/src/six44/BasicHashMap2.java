package six44;

import java.util.HashMap;
import java.util.Scanner;

public class BasicHashMap2 {

	public static void main(String[] args) {

		HashMap<String, String> accountMap = new HashMap<String, String>();

		accountMap.put("pju", "1234");
		accountMap.put("jhs", "7933");
		accountMap.put("ur", "0000");
		accountMap.put("ub", "1234");
		accountMap.put("ur", "9999");

		Scanner sc = new Scanner(System.in);

		while (true) {

			String id = "";
			System.out.println("id와 password를 입력해주세요");
			id = sc.nextLine().trim();

//		sc.nextLine();

			System.out.println("pwd");
			String pwd = "";
			pwd = sc.nextLine();

			if (accountMap.containsKey(id) == false) {
				System.out.println("입력하신 id는 존재하지 않습니다 다시 입력");
				continue;
			} else {
				if (accountMap.get(id).equals(pwd) == false) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력");

				} else {
					System.out.println("id와 비밀번호가 일치합니다.");
					break;
				}
			}

		}

		System.out.println("인증시스템 종료");
	}

}
