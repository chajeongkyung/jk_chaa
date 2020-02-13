//1부터 10까지 더하는 프로그램
public class ForTest1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0; //누적
		int cnt = 0; //횟수

		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
			cnt++;
		}
		
		System.out.println( cnt + "까지의 합: " +sum);
		
	}	
}
