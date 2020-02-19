/*
 * 
 * 구구단 만들기
 * 1차원 배열
 * 결과만 1차원 배열에 넣는다
 * 그걸 출력한다.
 * 
 * 
 * */
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[100];

		int index = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				numArr[index] = i * j;
				System.out.print(j + " * " + i + " = " + numArr[index] + "\t");
				index++;
				
				if (j == 9) {
					System.out.println();
				}

			}
		}

	}
}
