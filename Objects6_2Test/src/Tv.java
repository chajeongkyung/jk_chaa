
public class Tv {
	
//	속성(Attribute) - 크기, 길이, 색상, 볼륨, 채널 등
//	기능 - 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등 
	boolean power; 
	int channel; 
	int  volume;
	
	
	void power() {
		power =! power;		
	}
	
	void channelUp() {
		channel++;		
	}
	
	void channelDown() {
		channel--;		
	}	
	
	void volumeUp() {
		 volume++;		
	}
	
	void  volumeDown() {
		 volume--;		
	}	
	
	
	
	
}

