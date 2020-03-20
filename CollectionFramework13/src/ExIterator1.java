import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExIterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//2,100단 구구단
		List<Integer> list1 = new ArrayList();
		List<Integer> resultList = new ArrayList();
		
		list1.add(2);
		list1.add(100);
		
	
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 1; j <= 9; j++) {
			resultList.add(list1.get(i) * j);
			}
		}
		//iterator는 출력용
		Iterator<Integer> it = resultList.iterator();
		
		while(it.hasNext()) {
			//안전하게 확인하기 위해서
			Object obj = it.next();
			
			System.out.println(obj);
			
		}
		
		
//		Iterator<Integer> it = list.iterator();
//		
//		while(it.hasNext()) {
//			//안전하게 확인하기 위해서
//			Object obj = it.next();
//			
//			System.out.println(obj);
//			
//		}
		
	}

}
