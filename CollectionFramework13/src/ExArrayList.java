import java.util.ArrayList;

public class ExArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		//입력은 특별한 경우(규칙이 없는 경우)이므로 범위를 지정
		for (int i = 1; i < 10; i++) {
			list1.add(i);
		}
		
		for (int i = 2; i < 4; i++) {
			list2.add(i);
		}
		
		//출력은 사이즈 이용
		for (int j = 0; j < list2.size(); j++) {
			for (int i = 0; i < list1.size(); i++) {
				//마우스를 올리고 api를 확인하거나 클릭하여 변경
				//arraylist는 object로 반환
				int result = (int)list2.get(j) *(int)list1.get(i);
				
				System.out.println(list2.get(j) + " * " + list1.get(i)
				+ " = " + result);
			}
			System.out.println();
		}
		
			
	}

}










