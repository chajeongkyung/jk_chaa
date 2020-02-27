package com.tg.polymorphism;

public class Tv {
	
	boolean power; 
	int channel; 

	void power() {
		power =! power;		
	}
	
	void channelUp() {
		channel++;		
		System.out.println("된거야");
	}
	
	void channelDown() {
		channel--;		
	}	
	
	
	
}

