
public class MuteTv extends Tv{
 
	boolean mute = false;
	int volTemp = 0;               //이전 볼륨
	
	void muteCaption() {           //음소거 메서드
			
		if (mute) {
			volume = volTemp;
			mute = false;
			
			System.out.println("음소거 해제" + "\t" + volume);
			
		} else {
			volTemp = volume;
			volume = 0;
			mute = true;
			
			System.out.println("음소거" + "\t" + volume);
			
		}
	}

	
}
