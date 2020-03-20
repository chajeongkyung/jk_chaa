package tg.m;

import java.util.HashMap;
import java.util.Map;


public class ExMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, String> map = new HashMap();
		
		map.put("과장님", "정의광");
		map.put("판타스틱", "이환상");
		map.put("nojam", "고재민");
		
		String nickname = "";
		
		nickname = map.get("판타스틱");
		System.out.println(nickname);

		nickname  = map.get("nojam");
		System.out.println(nickname);
		
		
		
		
//		map.put("hello", 52);
//		//565에 1111을덮어 씌운 것임
//		map.put("are you O", 565);
//		map.put("are you O", 1111);
//		
//		int num = 0;
//		
//		num  = map.get("hello");
//		System.out.println(num);
//		
//		num = map.get("are you O");
//		System.out.println(num);
	
	}

}
