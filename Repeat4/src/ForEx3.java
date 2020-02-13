
public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		int mulNum = 0;
	
		for(int i = 2; i <= 9; i++) {
			System.out.print(i+"단\t");
		}System.out.println();
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				mulNum = i * j;
				str = j + "*" + i + "=" + mulNum + "\t";
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
