package ans.two83;

//오버로딩(Overloading)/더하기, 나누기만 구현한다/소수첨 두번째자리에서 내림처리
public class Calc_owr {

	int add(int a, int b) {
		System.out.println("int a, int b");
		int result = a + b;
		
		String view = a + " + " + b + " = ";
		System.out.println(view + " " + result);
		
		return result;
	}

	long add(int a, long b) {
		System.out.println("int a, long b");
		String view = a + " + " + b + " = ";
		long result = a + b;
		System.out.println(view + " " + result);
		return result;
	}

	long add(long a, int b) {
		System.out.println("long a, int b");
		long result = a + b;
		String view = a + " + " + b + " = ";
		System.out.println(view + " " + result);
		return result;
	}

	long add(long a, long b) {
		System.out.println("long a, long b");
		long result = a + b;
		String view = a + " + " + b + " = ";
		System.out.println(view + " " + result);
		return result;
	}

	double division(int a, int b) {
		System.out.println("int a, int b");
		double result = ((int) (((a * 1.0) / b) * 10)) / 10.0;
		String view = a + " / " + b + " = ";
		System.out.println(view + " " + result);
		return result;
	}

	double division(double a, int b) {
		System.out.println("int a, double b");
		double result = ((int) (((a * 1.0) / b) * 10)) / 10.0;
		String view = a + " / " + b + " = ";
		System.out.println(view + " " + result);
		return result;
	}

	double division(double a, double b) {
		System.out.println("double a, double b");
		double result = ((int) (((a * 1.0) / b) * 10)) / 10.0;
		String view = a + " / " + b + " = ";
		System.out.println(view + " " + result);
		return result;
	}

}
