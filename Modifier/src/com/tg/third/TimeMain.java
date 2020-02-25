package com.tg.third;

public class TimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time(12, 35, 30);
		
		System.out.println(time);
//		time.hour = 13;
		
		time.setHour(13);
		time.getHour();
		
		System.out.println(time);
		
	}

}
