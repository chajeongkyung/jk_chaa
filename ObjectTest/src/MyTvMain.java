
public class MyTvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTv t;             //t에 null값 저장
		t = new MyTv();     //new는 MyTv()의 주소값 할당
		
		t.color = "빨강";
		System.out.println("현재 색상은 " + t.color + "입니다.");
		
	
		t.channel =11;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "입니다.");
		
	
		t.power = true;
		t.power();
		System.out.println("현재 전원여부는 " + t.power + "입니다.");

		
		t.height = 200.0;
		t.heightUp();
		System.out.println("현재 높이는 " + t.height + "입니다.");

		
		t.weight = 20.0;
		t.weightUp();		
		System.out.println("현재 무게는 " + t.weight + "입니다.");

		

	}

}
