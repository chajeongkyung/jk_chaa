
public class Calculrator2 {

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
	
	void add(int a, int b) {
		int sum = 0;
		
		sum = a + b;	
		
		System.out.println(a + " + " + b + " = " + sum);
	}
}