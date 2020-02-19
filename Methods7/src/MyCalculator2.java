/*
 * 
 * 더하기 빼기 곱하기 나우기
 * 기능을 구현하시오
 * 나누었을 대 소수점은 전부 표현한다.
 * 
 * 
 * */
public class MyCalculator2 {
	
	void add(int a, int b) {
		int sum = 0;
		
		sum = a + b;	
		
		System.out.println(a + " + " + b + " = " + sum);
	}
	
	void sub(int a, int b) {
		int sum = 0;
		
		sum = a - b;
		
		System.out.println(a + " - " + b + " = " + sum);
	}
	
	void mul(int a, int b) {
		int sum = 0;
		
		sum = a * b;
		
		System.out.println(a + " * " + b + " = " + sum);
	}
	
	void div(double a, double b) {
		double sum = 0;
		
		sum = a / b;
		
		System.out.println(a + " / " + b + " = " + sum);
	}
	
	void div1(double a, double b) {
		double sum = 0;
		
		sum = a % b;
		
		System.out.println(a + " % " + b + " = " + sum);
	}

}
