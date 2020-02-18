/*
 * 국어 영어 수학
 * 총점과 평균을 구하고
 * 가장 높은 학생의 번호를 출력하시오
 * =========================
 * 번호  국어  영어  수학
 * 1  100 100 100
 * 2   20  20  20
 * 3   30  30  30
 * 4   40  40  40
 * 5   50  50  50
 * 
 * 수석학생  : 1번 학생
 * 총점 : 300
 * 평균 : 100.0(소수점 첫째 자리만 표현 둘째 자리는 버린다.)
 *
 * */

public class ArrTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] scoreArr = new int[5][3];
		
		int[] sum = new int[5];
		
		
		//점수값을 초기화
		System.out.println("번호 국어 영어 수학");
		for (int i = 0; i < 5; i++) {			
			for (int j = 0; j < 3; j++) {
				if(i == 0) {
					scoreArr[i][j] = 100;
				}
				else {
					scoreArr[i][j] = (i+1) * 10;					
				}																
			}					
		}
		
		//출력
		for (int i = 0; i < 5; i++) {
			System.out.print(i+1 + "  ");
			for (int j = 0; j < 3; j++) {
				if(j == 2) {
					System.out.println(scoreArr[i][j]);					
				}else {
					System.out.print(scoreArr[i][j] + " ");
				}
			}
		}
		
		//총점 구하기
		int max = 0;
		System.out.println("\n각각의 총합");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				sum[i] = sum[i] + scoreArr[i][j];				
			}
			
			System.out.print(sum[i] + " ");
			if(max < sum[i]) {
				max = sum[i];
			}			
		}
		
		System.out.println("\n\n총점 : " + max);
		
		//평균 구하기
		double avg = 0;
		
		avg = (int)(max * 10) / 30.0;
		System.out.println("평균 : " + avg);

	
	}
}



