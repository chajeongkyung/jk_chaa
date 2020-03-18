package test_17;

public class Arraytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArr = new int[10];
		
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = i+1;
		}
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
	}
	

}
