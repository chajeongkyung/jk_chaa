package com.tg.inter;

//class 는 extends => 상속한다 => 일반화
//interface 는 implement => 구현한다 => 실체화

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FireTruck ft = new FireTruck();
		Ambulance am = new Ambulance();
		
		ft.sound();
		ft.work();
		
		am.sound();
		am.work();

	}

}
