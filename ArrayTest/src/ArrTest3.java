/*
 * 
 * 
 *
 * */

public class ArrTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = { 79, 88, 91, 33, 100, 55, 95 };
		int maxNum = scoreArr[0];
		int minNum = scoreArr[0];
		int max = 0;
		int min = 0;

		for (int i = 1; i < 7; i++) {
			if (maxNum < scoreArr[i]) {
				maxNum = scoreArr[i];
				max = i;
			}

			if (minNum > scoreArr[i]) {
				minNum = scoreArr[i];
				min = i;
			}

		}

		System.out.println("최대값 : " + maxNum);
		System.out.println("최소값 : " + minNum);
		System.out.println("최대값의 위치는 : " + (max + 1));
		System.out.println("최소값의 위치는 : " + (min + 1));

	}

}
