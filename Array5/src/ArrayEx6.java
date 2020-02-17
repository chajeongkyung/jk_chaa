/*
 * 
 * 
 * */

public class ArrayEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = { 15, 11, 1, 3, 8 };
		int temp = 0;
		int cnt = 0;
		
		//자리 변경 여부 체크
		boolean changed = false;

		System.out.print("초기값 ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "  ");
		}
		System.out.println();

		// 오름차순 정렬
		for (int i = 0; i < numArr.length; i++) {
			changed = false;               //다시 수행하는 부분에 대한 초기화
			System.out.println(i + 1 + "번째 수행");
			for (int n = 0; n < numArr.length - 1 - i; n++) {
				if (numArr[n] > numArr[n + 1]) {
					temp = numArr[n];
					numArr[n] = numArr[n + 1];
					numArr[n + 1] = temp;
					

					changed = true;

				}cnt++;
				for (int m = 0; m < numArr.length; m++) {
					System.out.print(numArr[m] + "  ");
				}
				System.out.println();
			}
			if (changed == false) {
				break;
			}

//			for (int m = 0; m < numArr.length; m++) {
//				System.out.print(numArr[m] + "  ");
//			}
//			System.out.println();
		}

		System.out.println("\n총 바꾼 횟수 : " + cnt);
		System.out.println();
		System.out.print("정렬 후 ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "  ");
		}

	}

}
