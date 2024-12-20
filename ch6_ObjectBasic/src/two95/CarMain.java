package two95;

// this 자기자신, this() 생성자에서 다른 생성자 호출하기
public class CarMain {
	
//	같은 클래스의 멤버들 간에 서로 호출할 수 있는 것처럼 
//	생성자 간에도 서로 호출이 가능하다
//	
//	*만족해야 하는 조건
//	-생성자의 이름으로 클래스이름 대신 this를 사용한다
//	-한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다
	
//	this - 인스턴스 자신을 가리키는 참조변수. 인스턴스의 주소가 저장되어 있다
//	모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재한다
//	this(), this(매개변수들) - 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다
	
	public static void main(String[] args) {
		String color = "";
		String gearType = "";  // 자동, 수동
		int door = 0;			// 문의 갯수

//		Car car = new Car();
//		
//		System.out.println(car);
//		car.testMethod();
		
//		car.color = "red";
//		car.gearType = "manual";
//		car.door = 4;
		
		color = "blue";
		gearType = "auto";
		door = 2;
		
		Car car2 = new Car(color, gearType, door);
		
		car2.carInfo();
		
	}
	
	
}
