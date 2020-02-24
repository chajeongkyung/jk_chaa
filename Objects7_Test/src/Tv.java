
public class Tv{

	boolean power;
	int volume = 0;
	
	
	void power() {
		power = !power;
	}
	void soundUp() {
		volume++;
	}
	
	void soundDown() {
		volume--;
	}
	
	void tvInfo() {
		System.out.println("전원 여부 " + power);
		System.out.println("현재 볼륨 : " + volume);
		System.out.println("======================");
	}
	
}
