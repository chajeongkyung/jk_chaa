/*
 * 
 * 더하기 빼기 곱하기 나우기
 * 기능을 구현하시오
 * 나누었을 대 소수점은 전부 표현한다.
 * 
 * 
 * */
public class MyCalculator {
	
	int add(int a, int b) {
		int sum = 0;
		
		sum = a + b;
		
		return sum;
	}
	
	int sub(int a, int b) {
		int sum = 0;
		
		sum = a - b;
		
		return sum;
	}
	
	int mul(int a, int b) {
		int sum = 0;
		
		sum = a * b;
		
		return sum;
	}
	
	double div(double a, double b) {
		double sum = 0;
		
		sum = a / b;
		
		return sum;
	}

}
