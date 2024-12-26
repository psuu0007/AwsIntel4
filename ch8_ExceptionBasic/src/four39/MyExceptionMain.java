package four39;

import java.util.Scanner;

public class MyExceptionMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자 입력");

        Test t = new Test();
        
        try {
            int num = scan.nextInt();
            t.view(num);
            // 0 입력 시 MyException을 던짐

            System.out.println(100 / num);
        } catch (MyException e) {
            // MyException 처리
            System.out.println(e.getMessage());
            e.myIns();
        } catch (ArithmeticException e) {
            // 다른 ArithmeticException 처리
            System.out.println("산술 오류: " + e.getMessage());
        } catch (Exception e) {
            // 기타 예외 처리
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
