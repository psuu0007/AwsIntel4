package five28.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateMain2 {

   @SuppressWarnings("deprecation")
   public static void main(String[] args) {
      // TODO Auto-generated method stubDate now = new Date();

      Date now = new Date();

//		아래와 같이 한국의 날짜로 구현하시오

//		2024년12월27일 금요일

      String koreaDateStr = "";
//      형식
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 E요일 H시 m분 s초");
      
      koreaDateStr = sdf.format(now);

      System.out.println(koreaDateStr);
   }

}
