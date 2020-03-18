import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//명명 규칙 list를 붙이지 않으면 감점요소
		Scanner scan = new Scanner(System.in);
		
		ArrayList numlist = new ArrayList();
		System.out.println("두 수를 입력하세요");
		
		for (int i = 0; i < 2; i++) {
			numlist.add(scan.nextInt());
		}
		
		int result = 0;
		for (int i = 0; i < numlist.size(); i++) {
			result += (int)numlist.get(i);
		}		
		System.out.println(result);

	}

}
