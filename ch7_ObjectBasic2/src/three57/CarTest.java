package three57;

import three57.basic.Car;
import three57.basic.FireEngine;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = null;
//		소방차 1대
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		fe1.water();
		
//*		참조변수의 형변환
//기본형 변수와 같이 참조변수도 형변환이 가능하다
//단, 서로 상속관계에 있는 클래스사이에서만 가능하기 때문에
//자식타입의 참조변수를 부모타입의 참조변수로 
//부모타입의 참조변수를 자식타입의 참조변수로의 형변환만 가능하다
//
//*자식타입 -> 부모타입: 형변환 생략가능
//자식타입 <- 부모타입: 형변환 생략불가
		
//		car = fe1;
		car = (Car)fe1;
//		car.drive();
//		car.stop();
//		car.water();
		
		fe2 = (FireEngine)car;
//		fe2 = car;
		fe2.water();
		
	}
	
}
