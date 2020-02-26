package net.mega;

import java.util.Scanner;

public class MyInputUtil {
/**
 * 사용자가 키보드로 입력한 숫자값을 반환한다
 * 
 * */
	
	public int getUserInputNumber() {
		Scanner scan = new Scanner(System.in);

		int num = 0;
		try {
			System.out.println("숫자를 입력해주세요");
			num = scan.nextInt();
			System.out.println(num);
		} catch (Exception e) {
			System.out.println("0");
		}
		
		return num;
	}
}
