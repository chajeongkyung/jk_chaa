package com.tg.tryy;

import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
//		n에 대해서 오류가 발생하면 n을 자신의 값으로 두자
		try {
			
			System.out.println("숫자만 입력 ");
			n = scan.nextInt();	
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			e.printStackTrace();
			System.out.println("예외메시지: " + e.getMessage());
			n = -1;
		}
		
	}

}
