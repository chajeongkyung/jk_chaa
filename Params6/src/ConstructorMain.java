
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Overflow
//		기본 생성자(default constructor)
//		Card c = new Card();
//		1. 연산자 new에 의해서 메모리(heap)에 Card클래스의 인트턴스가 생성된다
//		2. 생성자 Card()가 호출되어 수행 된다.
//		3. 연산자 new의 결과로, 생성된 Card인스턴스의 주소가 반환되어
//		참조 변수 c에저장된다.
		
		
		ConstructorData cd = new ConstructorData();
//		cd.value = 1;
		System.out.println(cd.value);
		
//		매개변수가 있는 생성자
		
		ConstructorData2 cd2 = new ConstructorData2();
//		System.out.println(cd2.value);

//		클래스 내부에 매개변수 있는 생성자를 하나라도 만들면
//		자동으로 만들어지던 기본 생성자를 만들어주지 않는다.
		
	}

}
