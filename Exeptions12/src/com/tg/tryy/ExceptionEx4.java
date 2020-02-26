package com.tg.tryy;

import java.util.Scanner;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(1);
		System.out.println(2);
	
		
		try {	
			int n = scan.nextInt();	
			System.out.println(3);
			System.out.println(0/0); //0으로 나누어서는 안된다
			System.out.println(4);

		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException");
			System.out.println(5);

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
		System.out.println(6);
		
	}

}
