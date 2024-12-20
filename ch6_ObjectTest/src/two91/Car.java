package two91;

// 생성자Constructor
public class Car {
	
	String color = "";
	String gearType = "";  // 자동, 수동
	int door = 0;			// 문의 갯수
	
	Car(){
		// 기본 생성자
		System.out.println("아하 기본 생성자 실행했네");
	};
	
	Car(String c, String gt, int d){
		
		color = c;
		gearType = gt;
		door = d;
	}
	
	
	
}
