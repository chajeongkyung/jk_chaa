import java.util.Scanner;

/*
 * 스마트 구구단
 * ===============
 *
 *  
 * */
public class ForTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1;

		while (num != 0) {

			System.out.println("단 입력하세요(0입력시 종료)\n>>");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();

			if (num == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println(num + "단");

			for (int i = 1; i <= 19; i++) {

				System.out.print(num + " * " + i + " = " + num * i + "\t");
				if (i % 5 == 0) {
					System.out.println();
				}

			}
			System.out.println();

		}
	}
}
