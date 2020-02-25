
public class ForEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println("나 수행함");
				continue;
			}
			System.out.println(i);
		}	
//		조건문
//		삼항 vs switch vs if
//		삼항 : 수행 속도 높다, 3가지 경우 (맞다, 틀렸다, 기본), 가독성 낮다
//		switch : 맵핑, 분기문 설정
		
//		if : 가장 일반적 구현이 가능하다, 전부 가능
		
//		반복문
//		for vs while vs do-while
//		for : 가장 쉽다, 가독성, 정확한 수치와 범위를 알 경우
//		while : 무한 루프, 미지의 수치

	}
}
