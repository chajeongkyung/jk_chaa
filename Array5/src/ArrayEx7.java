/*
 * 
 * 
 * 
 * */
//관련있는 것들의 묶음
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//45개의 공
		int[] ballArr = new int[45];
		
		//1~45가지의 숫자 저장
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i + 1;			
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i]+ " ");
		}
		System.out.println();
		
		int tempNum = 0;
		int n = 0;
		
		for (int i = 0; i < ballArr.length; i++) {
			n = (int)(Math.random() * 45); //배열 범위 (0~44)의 값을 얻는다
			
			tempNum = ballArr[0];
			ballArr[0] = ballArr[n];
			ballArr[n] = tempNum;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i]+ " ");
		}
		
	}

}


