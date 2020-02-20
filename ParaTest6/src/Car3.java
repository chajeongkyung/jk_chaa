
public class Car3 {
	
//	색상
	String color = ""; 
//	변속기 종류
	String gearType = "";
//	문의 개수
	int door = 0;
	
//this에 대해 배우자
//	this?
//			인스턴스 자신을 가리키는 참조변수
//			인스턴스의 주소가 저장되어 있다
//			모든 인스턴스 메서드에 지역변수로 숨겨진 채로 존재한다.
			
	Car3(String color, String gearType, int door){
		//인스턴스 변수 초기화 작업만!! syso금지
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("생성자의 주소값 : " + this);
		
	}
	
	void carInfo() {
		System.out.println("매서드 상의 주소값 : " + this);
		System.out.println("My car");
		System.out.println("색상 : "+ color);
		System.out.println("변속 : " + gearType);
		System.out.println("자동차 문 "+ color);
		
		
	}
	void carInfo(String color, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		
		System.out.println("매서드 상의 주소값 : " + this);
		System.out.println("My car");
		System.out.println("색상 : "+ this.color);
		System.out.println("변속 : " + this.gearType);
		System.out.println("자동차 문 "+ this.door);
		
		
	}
	
}
