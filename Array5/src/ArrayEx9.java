/*
 * 
 * 구구단 만들기
 * 1차원 배열
 * 결과만 1차원 배열에 넣는다
 * 그걸 출력한다.
 * 
 * 2차원배열
 * 
 * */
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[100];
		
		//구구단 결과 값을 저장
		int index = 0;
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9 ; j++) {
				numArr[index] = i * j; 
				index++;
				
			}
		}
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * "+ i + " = " + numArr[index]);				
				
			}index++;
		}
		
		
//		for (int i = 0; i < numArr.length; i++) {
//			
//			if((i+1) % 9 == 0) {				
//				System.out.println();
//				
//			}else {
//				System.out.print(numArr[i] + " ");
//			}
//		}
		

	}
}



