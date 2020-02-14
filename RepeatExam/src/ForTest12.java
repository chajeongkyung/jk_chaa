import java.util.Scanner;

/*
 * 
 *  
 * */
public class ForTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0 ;
		int answer = 0;
		boolean flag = true;
		String str = "";
		
		Scanner scan = new Scanner(System.in);
		
			
		while(flag) {	
		answer = (int) (Math.random() * 100) + 1;

		System.out.println("상대방이 숫자를 선택했습니다");
		System.out.println("답 : " + answer);
		System.out.println("1~100사이니 맞춰보세요");

		System.out.println("1과 100사이의 정수를 입력하세요\n>>");
		num = scan.nextInt();
		
		
	
		while(true) {		

			if (num > answer) {
				System.out.println("더 작은 수로 다시 시도해 주세요");
			} else if (num < answer) {
				System.out.println("더 큰 수로 다시 시도해 주세요");
			} else if (num == answer) {
				System.out.println("정답입니다");
				System.out.println("다시할래?(y) or (n)");
				
				scan.nextLine();                                //개행문자를 없애주는 의미없는 작업!
				str = scan.nextLine();
				
					if (str.equals("y")) {
						flag = true;
						break;
					} else if (str.equals("n")){
						System.out.println("프로그램 종료");
						flag = false;
						break;
					}
			}		
		}
		
	}
}
	
}

