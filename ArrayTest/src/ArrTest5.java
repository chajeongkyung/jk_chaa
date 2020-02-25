import java.util.Scanner;

/*
 * 
 * 사용자의 숫자를 입력받는다.
 * 
 * 순서는 국어, 영어, 수학이다.
 * 국영수 중에 점수가 제일 높은 순으로 출력해라
 * 단 3과목의 점수는 배열 변수 하나에 담겨있다.
 * 
 * ====================
 * 점수 입력 값 : 100, 81, 93
 * 점수 정렬한 값 :  100, 93, 81
 *
 * 기본정렬
 * */

public class ArrTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoreNum = new int[3];  //국영수 점수값을 저장할 배열
		int score = 0;
		int temp = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("점수 입력 값(국어, 영어, 수학)\n>> ");

		//입력을 다 받는다
		for (int i = 0; i < 3; i++) {
			scoreNum[i] = sc.nextInt();
		}		
		

		//내림차순으로 정렬
		for (int i = 0; i < scoreNum.length; i++) {
			for (int j = 0; j < scoreNum.length; j++) {
				if (scoreNum[i] > scoreNum[j]) {
					temp = scoreNum[i];
					scoreNum[i] = scoreNum[j];
					scoreNum[j] = temp;
				}
			}
		}
		
		//정렬한 배열을 출력
		System.out.print("점수 정렬한 값 : ");
		for (int i = 0; i < 3; i++) {
			if(i == 2) {
				System.out.print(scoreNum[i]);
				break;
			}
			System.out.print(scoreNum[i] + ", ");
			
		}

	}

}
