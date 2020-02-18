/*
 * 
 * numArr에 임의의 5가지 값을 넣는다
 * 이 값을 섞어서 출력한다
 * 단, 배열 변수를 하나더 생성한다.
 * =====================
 * 초기값 : 5, 4, 3, 2, 1
 * 셔플값 : ?, ?, ?, ?, ?(랜덤)
 * 
 *
 * */

public class ArrTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = new int[5];
		int[] changeNumArr = new int[5];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = numArr.length - i;
		}
		
		changeNumArr = numArr;     //원본(numArr)은 지키기 위해 changeNumArr사용하여 셔플
				                   //주소값을 변경
		
		System.out.print("초기값 : ");
		for (int i = 0; i < numArr.length; i++) {			
			if(i ==numArr.length-1) {
				System.out.print(numArr[i] + " ");
			}else {
				System.out.print(numArr[i] + ", ");
			}
		}
		System.out.println();
		
		int n = 0;
		int tempNum = 0;
		
		for (int i = 0; i < changeNumArr.length; i++) {
			n = (int)(Math.random() * 5); 
						
			tempNum = changeNumArr[0];
			changeNumArr[0] = changeNumArr[n];
			changeNumArr[n] = tempNum;
		}
		
		System.out.print("셔플값 : ");		
		for (int i = 0; i < changeNumArr.length; i++) {			
			if(i == changeNumArr.length-1) {
				System.out.print(changeNumArr[i] + " ");
			}else {
				System.out.print(changeNumArr[i] + ", ");				
			}
		}	
	}
}



