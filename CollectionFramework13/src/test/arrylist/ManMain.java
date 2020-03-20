package test.arrylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManMain {
	public static void main(String[] args) {
		
	ArrayList<Man> manList = new ArrayList<Man>();
	List<Integer> weightList = new ArrayList();
		
	Man man = new Man("차정경", 100);
	Man man1 = new Man("김용훈", 50);
	
	manList.add(man);
	manList.add(man1);
	
	
	int sum = 0;
	for (int i = 0; i < manList.size(); i++) {
		sum = sum + manList.get(i).getWeight();
	}
	
	System.out.println("========");
	System.out.println("사람수 : " + manList.size());
	

//	weightList = man.getWeight();
	
	
	Iterator<Integer> it = weightList.iterator();
	
	while(it.hasNext()) {
		Object obj = it.next();
		
		System.out.println(obj);
		
	}
	
	System.out.println("키총합 : " + sum);
	
	}
	
	
}
