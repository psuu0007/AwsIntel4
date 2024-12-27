package five85;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      ArrayList numList1 = new ArrayList();

      int num = 10;

      for (int i = 0; i < num; i++) {
         numList1.add(num - i);
      }

//      for (int i = 0; i < numList1.size(); i++) {
//         System.out.println(numList1.get(i));
//      }

//      try {
         for (int i = 0; i < numList1.size(); i++) {
            if (numList1.isEmpty() == true) {
               System.out.println("비었음");
               break;
            }

            for (int j = 0; j < numList1.size(); j++) {
               System.out.print(numList1.get(j) + "\t");
               i--;
            }
            System.out.println();
            numList1.remove(numList1.size() - 1);
         }

//      } catch (Exception e) {
         // TODO: handle exception
//      }

   }

}
