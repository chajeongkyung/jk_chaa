import java.util.ArrayList;
import java.util.List;

public class ExArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer 같이 클래스 단위로 적는다
		ArrayList numTestList = new ArrayList();
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		numTestList.add(1);
		numTestList.add(10);
		
		//객체
		Integer number = new Integer(1);
		//래퍼클래스
		numList.add(number);
		numList.add(1);
		numList.add(10);
		
		
//		System.out.println((int)numTestList.get(0) * (int)numTestList.get(1));
		System.out.println(numList.get(0) * numList.get(1));
		
		
		
//		List strList = new ArrayList();
//		
//		strList.add("첫번째");
//		strList.add("두번째");
//		strList.add("세번째");
//		strList.add("네번째");
//		
//		viewList(strList);
//		//인덱스 위치, 값 -> 잘 사용x
// 		strList.set(3, "4");
//		
//		viewList(strList);
		
	}
//	public static void viewList(List strList) {
//		String str = "";
//		
//		for (int i = 0; i < strList.size(); i++) {
//			str = (String)strList.get(i);
//			System.out.println(i + " : " + str);
//		}
//		System.out.println();
//	}	

}










