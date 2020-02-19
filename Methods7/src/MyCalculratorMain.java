
public class MyCalculratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculator calc = new MyCalculator();
		int a = 3;
		int b = 5;
		
		System.out.println(a + ", " + b);
		
		int sum = 0;
		sum = calc.add(a, b);
		System.out.println("더하기");
		System.out.println(sum);
		
		int sum1 = 0;
		sum1 = calc.sub(a, b);
		System.out.println("빼기");
		System.out.println(sum1);
		
		int sum2 = 0;
		sum2 = calc.mul(a, b);
		System.out.println("곱하기");
		System.out.println(sum2);
		
		double sum3 = 0;
		sum3 = calc.div(a, b);
		System.out.println("나누기");
		System.out.println(sum3);

	}

}
