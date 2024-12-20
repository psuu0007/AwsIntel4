package two95;

public class PersonMain {
	public static void main(String[] args) {
		
		String name = "정현식";
		int age = 5;
		int height = 213;
		int weight = 1000;
		
		Person person = new Person();
		Person person2 = new Person("최유혁", 7, 190, 130);
//		정현식을 수정한 거다 싶어서....
		
		person.personData();
		person2.personData();
	}
}
