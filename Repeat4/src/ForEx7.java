import java.util.Scanner;

public class ForEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan  = new Scanner(System.in);
		
		String str = "";
	
		while(true) {
			System.out.println("안녕?");
			System.out.println("입력 >>(y는 종료) ");
			
			str = scan.nextLine();
			
			if(str.equals("y")) {
				break;
			}
			System.out.println(str);
		}
		System.out.println("잘 가세요");
	}
}
