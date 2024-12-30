package five28.basic;

import java.util.Date;

public class TestDateMain1 {

   @SuppressWarnings("deprecation")
   public static void main(String[] args) {
      // TODO Auto-generated method stubDate now = new Date();

      Date now = new Date();

//		아래와 같이 한국의 날짜로 구현하시오

//		2024년12월27일 금요일

      System.out.print((now.getYear() + 1900) + "년");
      System.out.print((now.getMonth() + 1) + "월");
      System.out.print(now.getDate() + "일 ");

      String dayOfTheWeek = "";

      switch (now.getDay()) {
	      case 0: {
	         dayOfTheWeek = "일요일";
	         break;
	      }
	      case 1: {
	         dayOfTheWeek = "월요일";
	         break;
	      }
	      case 2: {
	         dayOfTheWeek = "화요일";
	         break;
	      }
	      case 3: {
	         dayOfTheWeek = "수요일";
	         break;
	      }
	      case 4: {
	         dayOfTheWeek = "목요일";
	         break;
	      }
	      case 5: {
	         dayOfTheWeek = "금요일";
	         break;
	      }
	      case 6: {
	         dayOfTheWeek = "토요일";
	         break;
	      }
      }
      System.out.println(dayOfTheWeek);


   }

}
