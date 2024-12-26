package four39;

public class Test {

	void view(int num) throws MyException{
		System.out.println("MyException 발생함");
		
		if (num == 0) {
            throw new MyException("0으로 나눌 수 없습니다!");
        }
	}
	
}
