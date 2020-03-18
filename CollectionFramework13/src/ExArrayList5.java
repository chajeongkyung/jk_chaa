import java.util.ArrayList;
import java.util.List;

public class ExArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String은 특수한 경우로 자동형변환이 됨
		ArrayList<String> titleStrList = new ArrayList(); 
		ArrayList<Integer> numList = new ArrayList<Integer>(); 
		titleStrList.add("인베이젼스");
		titleStrList.add("이노베이션");
		titleStrList.add("오밸리스크");
		titleStrList.add("다운풀");
		
		for (int i = 0; i < titleStrList.size(); i++) {
			System.out.println(titleStrList.get(i));
		}
//		1~4까지 list에 담아서 모든 숫자의 총합을 구하시오
		printSumNum(numList);
		
	}
//	메인에서 메서드 만들어서 리턴없이 출력, 가능한 제너릭 사용
	public static void printSumNum(ArrayList<Integer> numList) {
		
		for (int i = 0; i < 4; i++) {
			numList.add(i+1);
		}
		int sum = 0;
		for (int i = 0; i < numList.size(); i++) {
			sum = sum + numList.get(i);
		}		
		System.out.println(sum);
	}
	


}










