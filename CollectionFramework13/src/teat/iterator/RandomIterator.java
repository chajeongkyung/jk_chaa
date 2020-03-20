package teat.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RandomIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> resultList = new ArrayList();
	
		for (int i = 0; i < 6; i++) {
			resultList.add((int)(Math.random()* 100));
		}
		
		Iterator<Integer> it = resultList.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			
			System.out.print(obj);
			if(it.hasNext()) {
				System.out.print(", ");								
			}
			
		}

	}

}
