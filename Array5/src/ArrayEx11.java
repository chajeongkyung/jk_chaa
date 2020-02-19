/*
 * 
 * 구구단 만들기
 * 
 * 
 * 2차원배열
 * 
 * */
public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numArr = new int[100][100];

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {				
				numArr[j][i] = i * j;
				System.out.print(j + " * " + i + " = " + numArr[j][i] + "\t");

				if (j == 9) {
					System.out.println();
				}

			}
		}

	}
}
