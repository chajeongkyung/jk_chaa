import java.util.Scanner;

/*
 * 
 * 음수 양수 구분 프로그램
 * 사용자가 입력한 숫자에 대해 판단해준다
 * 4번 시도할 수 있다
 * 
 * */
public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int inputNum = 0;

		for (int i = 0; i < 4; i++) {

			System.out.println("사용자가 입력한 숫자?");
			inputNum = scan.nextInt();

			if (inputNum < 0) {
				System.out.println("음수입니다.");
			} else if (inputNum > 0) {
				System.out.println("양수입니다.");
			}else {
				System.out.println("0입니다.");
			}
		}

	}

}
