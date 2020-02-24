
public class CaptionTv extends Tv{

	//false꺼짐, true켜짐
	Boolean captionState = false;

	
	void soundUp() {
		volume = volume + 2;
	}
	
	void tvInfo() {
		System.out.println("전원 여부 " + power);
		System.out.println("현재 볼륨 : " + volume);
		System.out.println("captionState : " + captionState);
		System.out.println("======================");
	}
	
}
