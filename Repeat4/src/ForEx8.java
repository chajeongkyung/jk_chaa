
public class ForEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println("나 수행함");
				continue;
			}
			System.out.println(i);
		}	
	}
}