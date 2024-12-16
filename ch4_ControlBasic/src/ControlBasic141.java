
// 조건문 if-else-if-else문
public class ControlBasic141 {

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
//		}else{
//			위의 모든 조건식이 거짓일 때 수행될 문장들을 적는다
//		}
		
		int num = 0;
		
		if(num == 0) {
			System.out.println("0입니다.");
		}
		
		if(num != 0) {
			System.out.println("0이 아닙니다.");
		}
		
		if(num == 0) {
			System.out.println("0입니다.2");
		}else if(num != 0){
			System.out.println("0이 아닙니다.2");
		}
		
		if(num == 0) {
			System.out.println("0입니다.2");
		}else {
			System.out.println("0이 아닙니다.2");
		}
		
		
	}
	
}
