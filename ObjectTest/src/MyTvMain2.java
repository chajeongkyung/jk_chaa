
public class MyTvMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTv2 tv = new MyTv2();
		MyTv2 tv1 = new MyTv2();
		
		System.out.println(tv);
		System.out.println(tv1);
		
		tv.channel = 7;
		tv.power = true;
		tv.color = "red";
		
		System.out.println(tv.channel);
		System.out.println(tv.power);
		System.out.println(tv.color);
		
		tv1.channel = tv.channel;
		tv1.power = tv.power;
		tv1.color = "yellow";
		
		System.out.println();
		
		System.out.println(tv1.channel);
		System.out.println(tv1.power);
		System.out.println(tv1.color);
		
		

	}

}
