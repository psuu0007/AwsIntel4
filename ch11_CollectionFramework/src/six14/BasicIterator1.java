package six14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicIterator1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
//		Iterator(이터레이터)
//		컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하였다
//		Iterator를 얻은 다음 반복문, 주로 while문을 사용해서
//		컬렉션 클래스의 요소들을 읽어 올 수 있다
//		hasNext() 읽어 올 요소가 남았는지 확인한다
//		next() hasNext()가 true인 경우 안전하게 그 요소를 불러(읽어)온다
		
		
	}
	
}
