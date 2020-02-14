
/*
 * for문으로 
 * 윤년을 구하라
 * 
 * 1~2020년까지
 * ===========================
 * 윤년
 * 4
 * 8
 * .
 * .
 * .
 * 2020
 * 횟수 : 20
 *  
 *  
 * */
public class ForTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;

		for(int i = 1600; i <= 2020; i++) {
			if(i % 4 == 0) {                         // 4로 나눠지면 윤년
				if(i % 100 == 0) {                   // 100으로 나눠지면 평년
					if( i % 400 == 0) {              // 근데 또 400으로 나눠지면 윤년
						System.out.println(i);
						cnt++;
					}
				}else {
					cnt++;
					System.out.println(i);		
				}
			}			
		}
		System.out.println("횟수 : " + cnt);
	}
}















