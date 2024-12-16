
// 조건문 if-else-if
public class ControlBasic140 {

	public static void main(String[] args) {
		
//		
//		if(조건식1) {
//			//조건식이 참일 때 수행될 문장들을 적는다
//		}else if(조건식2){
//			조건식2의 결과가 참일 때 수행될 문장들을 적는다
//		}else if(조건식3){
//			조건식3의 결과가 참일 때 수행될 문장들을 적는다
//		},,,원하는 만큼 조건식을 구성할 수 있다
//		else if(조건식n){
//			조건식n의 결과가 참일 때 수행될 문장들을 적는다
//		}
		
		int scoreNum = 85;
		
		if(scoreNum >= 90) {
			System.out.println(scoreNum + "합격입니다.");
		}else if(scoreNum >= 80) {
			System.out.println(scoreNum + "B학점");
		}else if(scoreNum >= 60) {
			System.out.println("커트라인");
		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
