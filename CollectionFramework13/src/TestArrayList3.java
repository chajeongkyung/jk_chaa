import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 복제
		List strList = new ArrayList();
		ArrayList backupStrList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
		viewList(strList);
		
		for (int i = 0; i < 3; i++) {
			backupStrList.add(strList.get(i));
		}		
				
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
