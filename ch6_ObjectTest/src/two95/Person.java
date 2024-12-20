package two95;

public class Person {
	String name = "정현식";
	int age = 5;
	int height = 213;
	int weight = 1000;
	
	public Person() {
//		personData();
	}
	
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	
	void personData() {
		System.out.println("이름: " + name );
		System.out.println("나이: " + age + "살");
		System.out.println("키 : " + height + " cm" );
		System.out.println("몸무게: " + weight + " kg");

	}
	
}
