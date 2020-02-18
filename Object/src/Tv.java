
public class Tv {
	
//	속성(Attribute) - 크기, 길이, 색상, 볼륨, 채널 등
//	기능 - 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등


	String color;  //기본값으로 초기화 null
	boolean power; // false
	int channel;   // 0
	
	void power() {
		power =! power;		
	}
	
	void channelUp() {
		channel++;		
	}
	
	void channelDown() {
		channel--;		
	}	
	
}
