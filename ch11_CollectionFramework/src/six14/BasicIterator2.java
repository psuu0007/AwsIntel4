package six14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicIterator2 {

	public static void main(String[] args) {
		
		String[] strArr = new String[4];
		
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = i + "학생";
		}
		
		for (String name : strArr) {
			System.out.println(name);
		}
		
	}
	
}
