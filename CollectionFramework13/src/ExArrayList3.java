import java.util.ArrayList;
import java.util.List;

public class ExArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List strList = new ArrayList();
		
		strList.add("첫번째");
		strList.add("두번째");
		strList.add("세번째");
		strList.add("네번째");
		
		viewList(strList);
		removeList(strList);
		System.out.println("");
		viewList(strList);
		removeList(strList);
		
	}
	public static void viewList(List strList) {
		String str = "";
		
		for (int i = 0; i < strList.size(); i++) {
			str = (String)strList.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
	}
	
	public static void removeList(List strList) {
		//지우면 사이즈가 줄어들고 채워줌
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.size());
			strList.remove(i);
		}
		
	}
	

}










