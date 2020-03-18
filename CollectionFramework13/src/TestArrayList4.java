import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 복제
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
//		int size = strList.size();
//		for (int i = 0; i < size; i++) {
//			viewList(strList);
//			strList.remove(0);					
//		}

//		int size = strList.size();
//		for (int i = size; i > 0; i--) {
//			viewList(strList);
//			strList.remove(strList.size()-1);
//		}
		
		
		//best방법
		for (int i = strList.size()-1; i >= 0; i--) {
			viewList(strList);
			strList.remove(i);
		}
		System.out.println("");	
		
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
