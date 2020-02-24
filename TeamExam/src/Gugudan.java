import java.util.Scanner;

/*
 * 스마트 구구단
 * 
 * 시작 값 ~ 끝 값
 * 2, 4를 입력하면
 * 2,3,4단 출력
 * 
 * 4~2는 출력x
 * 
 * */
public class Gugudan {

	//구구단 출력 범위를 입력받음
	int numInput() {
		int dan = 0;
		Scanner sc = new Scanner(System.in);
		
		dan = sc.nextInt();
		return dan;				
	}
	
	//두 수를 매개변수로 받아서 배열에 저장
	void mulnum(int danstart, int danend) {		
		if(danstart > danend) {
			System.out.println("잘못 입력하였습니다");
		}
		      for (int n = 1; n <= 9; n++) {
		         for (int i = danstart; i <= danend; i++) {
		        	 System.out.print(i + " * " + n + " = " + (i*n) + "\t" );
		        
		      }System.out.println();
		         
		   }
		}
	
	
}
