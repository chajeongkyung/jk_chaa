
public class Calculrator {

//	메서드
//	표현식
//	리턴타입 메서드이름(타입 변수명, 타입 변수명, ,,,) {  <- 선언부
//		메서드 호출 시 수행될 코드                                      <- 구현부
//	}
	
//	메서드?
//		특징 작업을 수행하는 일련의 문장들을 하나로 묶은 것
//	사용하는 이유
//		1. 높은 재사용성 - 한번 만들어 놓은 메서드는 몇번이고 호출할 수 있다
//		2. 중복된 코드의 제거 - 반복되는 문장들 대신 메서드를 호출하는 한 문장으로
//		대체할 수 있다
//		3. 프로그램의 구조화 - 프로그램의 코드 구조를 단순화 시킨다
//	
//	언제 메서드 쓸까?
//			- 하나의 메서드는 한 가지 기능만 수행하도록 작성하는 것이 좋다
//			- 반복적으로 수행되어야 하는 여러 문장을 하나의 메서드로 정의해 놓으면 좋다
//			- 관련된 여러 문장을 하나의 메서드로 만들어 놓는 것이 좋다
			
	
	int add(int a, int b) {
		int sum = 0;
		
		sum = a + b;
		
		return sum;
	}
}
