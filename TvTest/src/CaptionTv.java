
public class CaptionTv extends Tv{

	boolean caption = false;  // 캡션 상태
	
//	CaptionTv(boolean power, int channel, int volume) {
//		super(power, channel, volume);
//	
//	}
	 CaptionTv(boolean caption){
		this.caption = caption;
	}
	
	 
	
	void displayCaption(String text) {
		if(caption == true) {    // 캡션 상태가 true(켠)일 경우 text를 보여준다 
			System.out.println(text);
		}
	}
	void captionTvInfo() {
		System.out.println("Captiontv의 정보입니다");
		System.out.println("캡션 상태 : " + caption);
	}
}
