package str.answer;

public class StringLv1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String originStr = "자바를 자바라"; // 기준
		String changeStr = ""; // 결과

//		changeStr = originStr.replace("자바", "db");
		
		String str = "";
		
//      자바를 자바라를 db를 db라로 변경하여 출력하시오 
		int idx1 = originStr.indexOf("자바");
		int idx2 = originStr.lastIndexOf("자바");
		str = "db";
		
		changeStr = str + originStr.substring(idx1 + 2, idx2) 
			+ str + originStr.substring(idx2 + 2);

//      System.out.println(idx1);
//      System.out.println(idx2);
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}