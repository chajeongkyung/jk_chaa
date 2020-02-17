

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		정렬된 숫자를 랜덤하게 섞는 프로그램
		
		int[] numArr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			numArr[i] = i;
			System.out.print(numArr[i] + ", ");
		}
		System.out.println();
		
		
		int rndIndex = 0;
		int tempNum = 0;
		for (int i = 0; i < 10; i++) {
			rndIndex = (int)(Math.random() * 10); // 0~9까지 랜덤하게
			
			tempNum = numArr[0];
			numArr[0] = numArr[rndIndex];
			numArr[rndIndex] = tempNum;	
		}
		for (int i = 0; i < 10; i++) {
			if(i == 9) {
				System.out.print(numArr[i]);
				break;
			}
			
			System.out.print(numArr[i] + ", ");
		}
	
	}

}
