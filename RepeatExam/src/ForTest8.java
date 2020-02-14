/*
 * 누적 활용
 * 1~100까지 더하는데
 * 100을 넘지않는 제일 큰 수를 출력한다
 * ===============
 * 1 - 1
 * 2 - 3
 * 3 - 6
 * 4 - 10
 * 5 - 15
 * .....
 * 13 - 91 
 *  
 * */
public class ForTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum = 0;
		int num = 1;
		int cnt = 0;
		
		while(cnt <= 100) {
			
			sum += num;
			if(sum > 100) break;
			System.out.println( num + " - " + sum);
			num++;
			cnt++;
	
		}
		
	}
	
}

