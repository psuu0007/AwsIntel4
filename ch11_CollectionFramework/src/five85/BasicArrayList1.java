package five85;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BasicArrayList1 {

	public static void main(String[] args) {
		
//		배열 immutable, 불변
		int[] numArr = new int[5]; 
		
//		mutable, 가변
		ArrayList list1 = new ArrayList(5); 

		System.out.println("리스트에 데이터가 있나 없나 판단: "+ list1.isEmpty());
		
		Random rand = new Random(1);
		
//		rand.nextInt(100);
		
//		list1.add(1);
		list1.add(new Integer(1));
		list1.add(rand.nextInt(100));
		list1.add(rand.nextInt(100));
		list1.add(rand.nextInt(100));
		list1.add(new Integer(5));
		
		
//		numArr[5] = 5;
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		
		System.out.println("list 총길이: " + list1.size());
		
//		정렬가능
		Collections.sort(list1);
		
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1.get(3));
		System.out.println(list1.get(4));
		
//		추가
		list1.add("B");
		list1.add("100");
		list1.add(3, "A");
		listPrint(list1);
		
//		수정
		list1.set(0, "신기하네");
		listPrint(list1);
		System.out.println("list 총길이: " + list1.size());
		
//		삭제
		list1.remove(list1.size()-1);
		listPrint(list1);
		System.out.println("list 총길이: " + list1.size());
	}
	
	static void listPrint(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========끝냄========");
		System.out.println();
	}
	
}
