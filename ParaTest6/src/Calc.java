
public class Calc {
	
	void add(int a, int b) {
		int sum = 0;
		
		sum = a + b;
		System.out.println("add(int a, int b)수행");
		System.out.println(sum);
	}
	
	void add(double a, int b) {
		double sum = 0;
		
		sum = a + b;
		System.out.println("add(double a, int b)수행");
		System.out.println(sum);
	}
	
	void add(int a, double b) {
		double sum = 0;
		
		sum = a + b;
		System.out.println("add(int a, double b)수행");
		System.out.println(sum);
	}
	
	void add(double a, double b) {
		double sum = 0;
		
		sum = a + b;
		System.out.println("add(double a, double b)수행");
		System.out.println(sum);
	}
	void add(int[] numArr) {
		int sum = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}
		
		System.out.println("add(int[] numArr)수행");
		System.out.println(sum);
	}
	
//====================sub====================
	
	void sub(int a, int b) {
		int sum = 0;
		
		sum = a / b;
		System.out.println("sub(int a, int b)수행");
		System.out.println(sum);
	}
	
	void sub(double a, int b) {
		double sum = 0;
		
		sum = a / b;
		System.out.println("sub(double a, int b)수행");
		System.out.println(sum);
	}
	
	void sub(int a, double b) {
		double sum = 0;
		
		sum = a / b;
		System.out.println("sub(int a, double b)수행");
		System.out.println(sum);
	}
	
	void sub(double a, double b) {
		double sum = 0;
		
		sum = a / b;
		System.out.println("sub(double a, double b)수행");
		System.out.println(sum);
	}

}
