import java.util.Scanner;

public class ForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num = 0;
		int sum = 0;
		
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요(끝내려면 0을 입력)");
		
		flag = true;
		//무한루프
		while(flag) {
			System.out.println(">>");
			num = scan.nextInt();
			
			if(num != 0) {
				sum = sum + num;
			}else {
				flag = false;
			}
		}
		System.out.println("합계 : " + sum);
	}
}
