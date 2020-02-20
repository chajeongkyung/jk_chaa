
public class Human {
	String eyeColor = "";
	String hairColor = "";
	int weight = 0;
	
	Human(String eye, String hair, int num){
		eyeColor = eye;
		hairColor = hair;
		weight = num;
	}
	
	Human(){
	
	}
	
	void humanInfo() {
		System.out.println("내 친구 머리색은 "+ hairColor);
		System.out.println("내 친구 눈동자색은 "+ eyeColor);
		System.out.println("내 친구 몸무게는 " + weight);
	}
	

}
