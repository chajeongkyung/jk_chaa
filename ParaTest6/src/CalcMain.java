import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산할 두 실수를 입력해주세요.");
		
		double num = sc.nextDouble();
		double num2 = sc.nextDouble();
	
		
		Calc cal = new Calc();
		
		int[] numArr = new int[10];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 4;
		
		cal.add(num, num2);
		cal.sub(num, num2);
		cal.add(numArr);

		
		
	}

}
