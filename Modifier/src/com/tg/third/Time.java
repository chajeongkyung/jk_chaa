package com.tg.third;

//접근제어자(access modifier)?
//접근제어자는 멤버 또는 클래스에 사용되어, 해당하는 멤버 또는 클래스를 외부에서
//접근하지 못하도록 제한하는 역할을 한다
//접근 제어자가 default임을 알리기 위해 실제로 default를 붙이진 않는다
//클래스나 멤버변수, 메서드, 생성자에 접근 제어자가 지정되어 있지 않다면,
//접근제어자가 default임을 뜻한다.
//캡슐화(encapsulation)
public class Time {
	
	private int hour;
	private int minutes;
	private int second;
	
	public Time(int hour, int minutes, int second){
		this.hour = hour;
		this.minutes = minutes;
		this.second = second;
		
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		
		this.hour = hour;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSeond(int second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minutes=" + minutes + ", second=" + second + "]";
	}

	
	
}
