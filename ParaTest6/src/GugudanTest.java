import java.util.Scanner;

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Scanner sc = new Scanner(System.in);
		
		
		Gugudan gugudan = new Gugudan("스마트 구구단");	
		System.out.println(gugudan.title);
	
	
		while(true) {
		gugudan.input();
		gugudan.output();
		
		System.out.println("종료? y/n");
		str = sc.nextLine();
		if(str.equals("y"))
			break;
		
		}
		
	}

}
