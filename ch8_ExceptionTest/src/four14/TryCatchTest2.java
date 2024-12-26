package four14;

//예외처리를 적용하고 예외가 있는 경우 무엇이 잘못되었는지를 콘솔에 출력하시오
public class TryCatchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = new String[3];
		
		strArr[4] = "예외처리 해봐";
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		
	}

}
