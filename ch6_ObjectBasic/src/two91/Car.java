package two91;

// 생성자Constructor
public class Car {
/*
	생성자란?
	인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'이다
	생성자 역시 메서드처럼 클래스 내에 선언된다
	
	*생성자의 조건
	1.생성자의 이름은 클래스의 이름과 같아야 한다
	2.생성자는 리턴 값이 없다
	3.생성자도 오버로딩이 가능하므로 하나의 클래스에 여러 개의 생성자가 존재할 수 있다
	
	ex:
	Card c = new Card();
	1.연산자 new에 의해서 메모리(heap)에 Card 클래스의 인스턴스가 생성된다
	2.생성자 Card()가 호출되어 수행된다
	3.연산자 new의 결과로, 생성된 Card 인스턴스의 주소가 반환되어 
	참조변수 c에 저장된다
	
	**'클래스이름()' 바로 생성자 였던 것이다!
	
	*기본 생성자(default constructor)
	모든 클래스에는 반드시 하나 이상의 생성자가 정의되어야 한다
	
	기본 생성자가 컴파일러에 의해서 추가되는 경우는 
	클래스에 정의된 생성자가 하나도 없을 때 뿐이다.
	*/
	
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
