
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다차원 배열
		//2차열 배열
		int[][] scoreArr = new int[3][3];
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int j = 0; j < scoreArr.length; j++) {
				scoreArr[i][j] = (i+1) * 10;
			}
		}
//		scoreArr[1][1] = 5;
//		scoreArr[2][2] = 100;
//		
//		System.out.println(scoreArr[2][2]);
			
		
		
		for (int i = 0; i < scoreArr.length; i++) {
			for (int j = 0; j < scoreArr.length; j++) {
				System.out.print(scoreArr[i][j] + ", ");
			}
			System.out.println();
		}
	}
}



