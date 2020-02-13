//3일차
/**
 * 가위바위보
 * 
 * */
import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		for(int i = 0; i < 3; i++) {
		
			Scanner scan = new Scanner(System.in);
			
			int input = 0;
			int ai = 0;
			String me = "";
			String com = "";
			
			System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요>>>");
			input = scan.nextInt();
			
			ai = (int)(Math.random()*3) + 1;  //Math.random()함수는 0~0.9까지의 랜덤 수 
			
			if (input == 1) me = "가위";
			else if (input == 2) me = "바위";
			else if (input == 3) me = "보";
			else System.out.println("잘못 입력하셨습니다");
			if (ai == 1) com = "가위";
			else if (ai == 2) com = "바위";
			else if (ai == 3) com = "보";
			
		
			
			if(me != "") {
				//System.out.println("컴퓨터도 선택 했습니다.");
				System.out.println("당신은 \"" + me + "\" 상대는 \"" + com + "\" 을 선택했습니다");
			
				switch (input - ai) {
				case -1 : case 2 : System.out.println("저런~~ 졌네요"); break;
				case -2 : case 1 : System.out.println("오~~ 이겼네요"); break;
				case 0 : System.out.println("이런! 비겼네요");break;
				default : System.out.println("에러 입니다");
				}
							
			}
		}
		
			
	}
}
