import java.util.ArrayList;
import java.util.List;

public class ExArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list는 부모임, arraylist보다 조작버튼이 적음 -> 다형성원리이해
		//부모는 자식을 참조할 수 있다 -> 부타자참
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
			
		viewList(strList);
		
		System.out.println("strList 0번째를 지운다");
		strList.remove(0);
		
		viewList(strList);
		
	}
	
	public static void viewList(List strList) {
		String str = "";
		
		for (int i = 0; i < strList.size(); i++) {
			str = (String)strList.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}
	

}










