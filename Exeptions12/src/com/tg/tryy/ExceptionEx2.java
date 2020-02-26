package com.tg.tryy;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0 / 0); //0으로 나누어서는 안된다
			System.out.println(4);

		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(5);

		}
		System.out.println(6);
		
	}

}
