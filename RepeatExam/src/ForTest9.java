/*
 * 무조건 while 구구단
 * ===============
 *
 *  
 *  
 * */
public class ForTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 0;
		
		while( (i+1) < 10 ) {
			System.out.print((i+1) + "단"+ "\t\t");
			i++;
		}
		System.out.println();
		i = 1;
		while (i < 10) {

			j = 2;
			while (j < 10) {

				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
}

