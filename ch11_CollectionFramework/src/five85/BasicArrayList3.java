package five85;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayList3 {

	public static void main(String[] args) {
//		제너릭스(Generics)
//		지너릭스는 다양한 타입의 객체들을 다루는 메서드나
//		컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능이다
//		객체의 타입을 컴파일시에 체크하기 때문에 객체의 타입 안정성을 높이고
//		형변환의 번거로움이 줄어든다
//		
//		*제너릭스 장점
//		타입 안정성을 제공한다
//		타입체크와 형변환을 생략할 수 잇으므로 코드가 간결해 진다
		
		ArrayList<Tv> tempList = new ArrayList<Tv>();
		
		Tv tv = new Tv();
		Tv tv2 = new Tv();
		tv2.channel = 10;
		
//		다형성
		tempList.add(tv);
		tempList.add(tv2);
		
		Tv nullTv = null;
		
		System.out.println(nullTv);
		
		System.out.println(tempList.get(0));
		System.out.println(((Tv)tempList.get(0)).channel);
		
//		현업용 코드
		System.out.println(tempList.get(1).channel);
		
	}
	
	static void listPrint(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========끝냄========");
		System.out.println();
	}
	
}
