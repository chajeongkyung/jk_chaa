/*
 * 
 * 1부터 5까지 숫자가 들어있는 배열을 만들고
 * 순차적으로 출력하시오
 * ============
 * 배열[0] = 1
 * 배열[1] = 2
 * 배열[2] = 3
 * 배열[3] = 4
 * 배열[4] = 5
 * 
 * 
 * */

public class ArrTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= null;
		num = new int[5];
						
		for(int i = 0; i < 5; i++) {			
			num [i] = i+1;
			System.out.println("배열[" + i + "] = " + num[i]);
		}
		
	}

}
