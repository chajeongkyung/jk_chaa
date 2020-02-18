
public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		선언
//		타입 변수명
		Tv t;             //t에 null값 저장
		t = new Tv();     //new는 Tv()의 주소값 할당
		
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + 
				"입니다.");

	}

}
