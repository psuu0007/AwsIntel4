package six44;

import java.util.HashMap;

public class BasicHashMap1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> numMap = new HashMap<String, Integer>();
		
		numMap.put("원", 1);
		numMap.put("투", 2);
		numMap.put("쓰리", 3);
		numMap.put("포", 4);
		
		System.out.println(numMap.get(0));
		System.out.println(numMap.get("원"));
		System.out.println(numMap.get(1));
	
		System.out.println(numMap.get("쓰리"));
		System.out.println(numMap.get("포"));
		
		System.out.println(numMap.size());
		
		System.out.println(numMap.isEmpty());
		
	}
	
}
