package com.tg.throwss;


//try-catch, throw, throws
public class Test1 {

//	void method() throws Exception {
//		try {
//			throw new Exception();
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("void method()에서 예외처리 되었습니다.");
//		}
//		
//	}
//	throws?
//			예외를 메서드의 throws에 명시하는 것은
//			예외를 처리하는 것이 아니라,
//			자신(예외가 발생할 가능성이 있는 메서드)을
//			호출한 메서드에게 예외를 전달하여 예외처리를 떠맡기는 것이다
	
	void method() throws Exception {
		System.out.println("나 수행함");
		throw new Exception();
		
		
	}
}
