import java.util.Scanner;

/*
 * 
 * 1~100의 범위에서 홀수만 더한다
 * 단 10번 더했다면 10번까지 더한 값을 출력한다
 * ============================
 * 1번째 누적값: 0 + 1 = 1
 * 2번째 누적값: 1 + 3 = 4
 * 3번째 누적값: 4 + 5 = 9
 *  
 *  
 * */
public class ForTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int j = 1;
		int cnt = 1;
		//String str = ""

		for (int i = 1; i <= 100; i++) {
			System.out.print(cnt + "번째 누적값 :");
			System.out.println(sum + " + " + j + " = " + (sum + j));
			
			if (j % 2 != 0) {
				sum += j;
				cnt++;
				
			}
			j += 2;
			if(cnt > 10) break;			
		}
	}
}
