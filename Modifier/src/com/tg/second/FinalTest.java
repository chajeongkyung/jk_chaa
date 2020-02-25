package com.tg.second;

//final?
//		마지막의, 변경될 수 없는
//		final이 사용될 수 있는 곳
//		클래스, 메서드, 멤버변수, 지역변수

final class FinalTest {	
	final int MAX_SIZE = 100;
	
	final int max() {
		final int tempNum = 0;
		Math.random();
		return tempNum;
	}
	
}
