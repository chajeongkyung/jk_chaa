/*
 * 무조건 while 구구단
 * ===============
 *
 *  
 * */
public class ForTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 1;
		int col = 0;
		
		while( (row+1) < 10 ) {
			System.out.print((row+1) + "단"+ "\t\t");
			row++;
		}
		System.out.println();
		row = 1;
		while (row < 10) {

			col = 2;
			while (col < 10) {
				System.out.print(col + " * " + row + " = " + (row * col) + "\t");
				col++;
			}
			System.out.println();
			row++;
		}
	}
	
}

