//멤버 = 멤버변수 + 멤버메서드
public class Members { //멤버클래스라 함
	
	//멤버변수 = 스태틱변수 + 인스턴스변수
	static int number; //스태틱변수
	static String string;
	int num;           //인스턴스변수
	String str;
	
	//생성자
	Members(){
		
	}
	
	Members(String str){
		this.str = str;
	}
	
	//멤버메서드 = 스태틱메서드 + 인스턴스메서드
	static int add(int num) { //스태틱메서드
		return 0;
		
	}

	void add() {             //인스턴스메서드
		
	}
	
	void bbbb() {
			
	}
	

}
