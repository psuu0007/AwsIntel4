package five85;

import java.util.ArrayList;

public class TestArrayList1 {

   public static void main(String[] args) {
      
//      10, 100, 1000, 10000을 리스트에 담고 출력하시오
//      int numArr
//	   ArrayList numList
//	   strList
      ArrayList list1 = new ArrayList();
      
      list1.add(10);
      list1.add(100);
      list1.add(1000);
      list1.add(10000);
      
      System.out.println(list1.get(0));
      System.out.println(list1.get(1));
      System.out.println(list1.get(2));
      System.out.println(list1.get(3));
      
   }
   
}
