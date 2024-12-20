
public class People {
	
	String name = ""; // 사람 이름
	int fruitCount = 0; // 과일 소지수
	
	// 과일을 받으면
	void getFruit(Fruit fruit){
		
		if(fruit != null){
			fruitCount++; 
			fruit.name = name + "이(가) 소지한 " + fruit.name;
		}
		
		fruit.name = "사과 아님 ㅋㅋ";
		System.out.println(fruit.name);
	}

	void info() {
		System.out.println("People [name=" + name + ", fruitCount=" + fruitCount + "]"); 
	}
	
}
