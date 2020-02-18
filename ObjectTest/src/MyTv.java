/*
 * Tv속성 중 2개를 추가해서
 * 모든 변수에 값을 할당하여 출력 하시오
 * =================
 * 빨강
 * true
 * 11
 * ?
 * ?
 * */


public class MyTv {
	
//	속성(Attribute) - 크기, 길이, 색상, 볼륨, 채널 등
//	기능 - 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등


	String color;  
	boolean power; 
	int channel;   
	double weight;
	double height;
	
	void power() {
		power =! power;		
	}
	
	void channelUp() {
		channel++;		
	}	
	void channelDown() {
		channel--;		
	}
	
	void weightUp() {
		weight++;		
	}
	void weightDown() {
		weight--;		
	}
	
	void heightUp() {
		height++;		
	}
	void heightDown() {
		height--;		
	}
	
	
	
}


