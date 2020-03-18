import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array로 복제
		String[] strArr = new String[4];
		String[] strArr1 = new String[3];
		
		strArr[0] = "첫번째";
		strArr[1] = "두번째";
		strArr[2] = "세번째";
		strArr[3] = "네번째";

		viewArr(strArr);

		System.out.println("strArr 0번째를 지운다");	
		for (int i = 0; i < strArr1.length; i++) {
			strArr1[i] = strArr[i+1];
		}		
		viewArr(strArr1);
		
	}

	public static void viewArr(String[] strArr) {
		String str = "";

		for (int i = 0; i < strArr.length; i++) {
			str = strArr[i];
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}

}
