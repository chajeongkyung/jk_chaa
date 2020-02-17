/*
 * 
 * 점수 : 100, 81, 100, 100, 93, 17
 * 81.333333
 * 총점과 평균을 구하시오
 * 평균은 소수점 3째 자리에서 반올림 하시오
 * 무조건 배열을 사용하자
 * =============================
 * 총점 : 평균
 * ??? : ???
 * 
 * int/int => int
 * int/double => double
 * 자동, 묵시 
 * 하나라도 크면 큰 걸로 간다!
 * */

public class ArrTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] scoreArr = {100, 81, 100, 100, 93, 17};
		double avg = 0; //float 군사, 안드로이드용
		int sum = 0;
		int cnt = 0;
		
		for (int i = 0; i < 6; i++) {
			sum += scoreArr[i];
			cnt++;
		}
		avg = (double)sum / cnt;
		
		avg = (int)((avg * 100) + 0.5);   //반올림 해준거
		avg = avg / 100; 
		
		System.out.println("총점 : 평균 ");
		System.out.println(sum + " : " + avg);
				
	}

}
