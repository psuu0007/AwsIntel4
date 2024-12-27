package five85;

import java.util.ArrayList;
import java.util.List;

public class BasicArrayList2 {

	public static void main(String[] args) {
		
		ArrayList tempList = new ArrayList();
		
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
		System.out.println(((Tv)tempList.get(1)).channel);
		
		Object obj = null;
		obj = tempList.get(0);
		nullTv = (Tv)obj;
		
		nullTv.channel = 1000;
		System.out.println(nullTv.channel);
		
	}
	
	static void listPrint(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("========끝냄========");
		System.out.println();
	}
	
}
