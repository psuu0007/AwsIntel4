
public class People {
	
	String name = ""; // 사람 이름
	int fruitCount = 0; // 과일 소지수
	
	// 과일을 받으면
	void getFruit(String fruit){
		if(fruit != null){
			fruitCount++; 
			fruit = name + "이(가) 소지한 " + fruit;
		}
		
		fruit = "사과 아님 ㅋㅋ";
		System.out.println(fruit);
	}

	void info() {
		System.out.println("People [name=" + name + ", fruitCount=" + fruitCount + "]"); 
	}
	
}
