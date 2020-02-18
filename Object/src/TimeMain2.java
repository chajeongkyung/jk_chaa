
public class TimeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time koreanTime = new Time();
		Time vietnamTime = new Time();
		
		
		System.out.println("한국 시간");
		//koreanTime.hour = 17;
		koreanTime.setHour(17);
		System.out.print (koreanTime.hour + ":");
		koreanTime.min = 39;
		System.out.print(koreanTime.min + ":" );
		koreanTime.sec = 55;
		System.out.println(koreanTime.sec);
		
		System.out.println("베트남 시간");
		vietnamTime.hour = 15;
		System.out.print (vietnamTime.hour + ":");
		vietnamTime.min = 39;
		System.out.print(vietnamTime.min + ":" );
		vietnamTime.sec = 55;
		
		System.out.println(vietnamTime.sec);
				
	}

}
