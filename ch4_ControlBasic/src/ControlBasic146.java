
// 조건문 switch
public class ControlBasic146 {

	public static void main(String[] args) {
		
//		switch (조건식) {
//		case 값1:
//			조건식의 결과가 값1과 같을 경우 수행될 문장들	
//		break;
//
//		case 값2:
//			조건식의 결과가 값2와 같을 경우 수행될 문장들
//		break;
//		default:
//			조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
//			break;
//		}
		
//		스위치문의 조건식은 결과값이 반드시 정수이어야 하며
//		이 값과 일치하는 case문으로 이동하기 때문에 
//		case문의 값 역시 정수이어야 한다
//		switch와 case문은 정수 상수 또는 문자열만 가능하다
		int level = 3;
		
		switch (level) {
			case 1:
				System.out.println("읽기 권한 획득");
				break;
			case 2:
				System.out.println(level);
				System.out.println("쓰기 권한 획득");
				break;
			case 3:
				System.out.println(level);
			case 4:
				System.out.println("4번 수행함");
				
			default:
				System.out.println("권한을 획득했습니다.");
				break;
		}
		
	}
	
}
