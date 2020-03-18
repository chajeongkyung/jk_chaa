package test.arrylist;
import java.util.ArrayList;

public class ManMain {
	public static void main(String[] args) {
		
	ArrayList<Man> manList = new ArrayList<Man>();
		
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
	System.out.println("키총합 : " + sum);
	
	}
	
	
}
