/*
 * Tv는 볼륨이 있다
 * Tv는 볼륨을 1올리고 1내는 기능이 있다
 * 음소거 Tv를 만든다
 * 음소거가 있다
 * 음소거 버튼을 누르면 음소거가 된다
 * 음소거가 된 상태에서 다시 음소거 버튼을 누르면 이전의 볼륨 상태로 돌아간다
 * 
 * 
 * */
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CaptionTv ctv = new CaptionTv();
		
		
		MuteTv Tv = new MuteTv();		
		Tv.volume = 10;
		
		Tv.volumeUp();
		
		System.out.println(Tv.volume);
		
//		captionTv.caption = true;		
//		captionTv.displayCaption("Hello Java");
		
//		captionTv.mute = true;
		
		Tv.muteCaption();
		Tv.muteCaption();
		
	
		


	}

}
