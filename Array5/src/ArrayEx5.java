/*
 * 
 * 
 * */

public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = {15, 11, 1, 3, 8};
		int temp = 0;
		
		System.out.print("초기값 ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "  ");
		}

		//오름차순 정렬
		for (int i = 0; i < numArr.length; i++) {
			for (int n = 0; n < numArr.length-1; n++) {
				if(numArr[n] > numArr[n+1]) {
					temp = numArr[n];
					numArr[n] = numArr[n+1];
					numArr[n+1] = temp;
				}
			}					
		}
		
		System.out.println();
		System.out.print("정렬 후 ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + "  ");
		}

	
	}

}
