package ans.two83;

//오버로딩(Overloading)
public class Calc {

	String viewType = "";
	String viewForm = "";

	int add(int a, int b) {
		System.out.println("int a, int b");
		return a + b;
	}

	long add(long a, long b) {
		System.out.println("long a, long b");
		long result = a + b;

		return result;
	}

	long add(long a, int b) {
		System.out.println("long a, int b");
		long result = a + b;

		return result;
	}

	long add(int a, long b) {
		System.out.println("int a, long b");
		long result = a + b;

		return result;
	}

	double division(int a, int b) {
		double result = ((int)(a / (double)b * 10)) / 10.0 ;
		
		viewType = "int, int";
		viewForm = a + " / " + b + " = ";

		System.out.println(viewType);
		System.out.print(viewForm);
		
		return result;
	}
	double division(int a, long b) {
		double result = ((int)(a / (double)b * 10)) / 10.0 ;
		
		viewType = "int, long";
		viewForm = a + " / " + b + " = ";

		System.out.println(viewType);
		System.out.print(viewForm);
		
		return result;
	}
	double division(long a, long b) {
		double result = ((int)(a / (double)b * 10)) / 10.0 ;
		
		viewType = "long, long";
		viewForm = a + " / " + b + " = ";
		
		System.out.println(viewType);
		System.out.print(viewForm);
		
		return result;
	}
	double division(int a, double b) {
		double result = ((int)(a / b * 10)) / 10.0 ;
		
		viewType = "int, double";
		viewForm = a + " / " + b + " = ";
		
		System.out.println(viewType);
		System.out.print(viewForm);
		
		return result;
	}

}
