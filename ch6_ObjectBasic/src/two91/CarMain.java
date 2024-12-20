package two91;

public class CarMain {
	
	public static void main(String[] args) {
		String color = "";
		String gearType = "";  // 자동, 수동
		int door = 0;			// 문의 갯수

		Car car = new Car();
		
		car.color = "red";
		car.gearType = "manual";
		car.door = 4;
		
		System.out.println(car.color);
		System.out.println(car.gearType);
		System.out.println(car.door);
		System.out.println();
		
		color = "blue";
		gearType = "auto";
		door = 2;
		
		Car car2 = new Car(color, gearType, door);
		
		System.out.println(car2.color);
		System.out.println(car2.gearType);
		System.out.println(car2.door);
		
	}
	
	
}
