
public class TestClass {
	
//	클래스(static)매서드 vs 인스턴스 메서드
	
	void instanceMethod() {				//인스턴스 메소드
		
	}
	
	static void staticMethod() {		//static메소드
		
	}
	
	void instanceMethod2() {			//인스턴스 메서드
		instanceMethod();				//다른 인스턴스메서드를 호출
		staticMethod();					//static메서드를 호출
	}
	
	static void staticMethod2() {		//static메서드
//		instanceMethod();				//에러! 인스턴스메서드를 호출할 수 없다
		staticMethod();					//static메서드는 호출할 수 있다
	}

}
