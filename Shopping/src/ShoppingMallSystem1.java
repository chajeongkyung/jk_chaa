

public class ShoppingMallSystem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오
		
		String[] nameArr = new String[10];
	
		nameArr[0] = "박지훈";
		nameArr[1]  = "차정경";
		nameArr[2] = "정의광";
		nameArr[3] = "노재민";
		nameArr[4] = "김용훈";
		nameArr[5] = "박상아";
		nameArr[6] = "원아름";
		nameArr[7] = "김현석";
		nameArr[8] = "정제건";
		nameArr[9] = "오현석";
		
		for (int i = 0; i < 5; i++) {
			System.out.println(nameArr[i] + " 컴퓨터 구입");
		}
		
		System.out.println("====== 컴퓨터 가게에서 5개의 컴퓨터를 팔았습니다 =======");
		System.out.println();
		
	
		System.out.println(nameArr[5] + " 연필 구입");
		System.out.println(nameArr[6] + " 볼펜 구입");
		System.out.println(nameArr[7] + " 지우개 구입");
		System.out.println(nameArr[8] + " 화이트 구입");
		System.out.println(nameArr[9] + " 공책 구입");
		
		System.out.println("====== 마트에서 1개의 연필을 팔았습니다 ======");
		System.out.println("====== 마트에서 1개의 볼펜을 팔았습니다 ======");
		System.out.println("====== 마트에서 1개의 지우개를 팔았습니다 ======");
		System.out.println("====== 마트에서 1개의 화이트를 팔았습니다 ======");
		System.out.println("====== 마트에서 1개의 공책을 팔았습니다 ======");
		System.out.println();
		
		
		
	}

}
