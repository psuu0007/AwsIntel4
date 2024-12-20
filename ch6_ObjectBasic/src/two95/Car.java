package two95;

public class Car {
	
	String color = "무색";
	String gearType = "수동";  // 자동, 수동
	int door = 0;			// 문의 갯수
	
	Car(){
		System.out.println(this);
		// 기본 생성자
//		this("black", "자동", 4);
		System.out.println("아하 기본 생성자 실행했네");
		
	};
	
//	Car(String c, String gt, int d){
//		
//		this.color = c;
//		gearType = gt;
//		door = d;
//	}
	
//	변수명은 명확해야 한다
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	void testMethod() {
		
		System.out.println("this란 뭘까?");
		System.out.println(this);
		System.out.println(this.color);
		System.out.println(this.gearType);
		
		this.carInfo();
	}
	
	void carInfo() {
		
		System.out.println("===자동차 정보===");
		System.out.println(color);
		System.out.println(gearType);
		System.out.println(door);
		
		System.out.println();
	}
	
}
