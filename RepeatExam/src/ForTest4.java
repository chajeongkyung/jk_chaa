/*
 * 
 *2의 배수 출력
 *2의 배수의 합계를 구한다
 * 범위 0~10
 * 
 * 0:0
 * 2:2
 * 4:6
 * ...
 * 10:20
 * 총합 : 30
 * */
public class ForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int n = 10;
		
		System.out.println("범위 \t:\t총합");
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
				System.out.println(i + "\t:\t" + sum);
			}
			
		}System.out.println("총합\t:\t"+ sum);

	}

}
