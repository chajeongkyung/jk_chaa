
public class GugudanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int danStart = 0;
		int danEnd = 0;
		
		Gugudan gugudan = new Gugudan();
		
		
		System.out.println("첫 숫자를 입력해 주세요 >>");
		danStart = gugudan.numInput();
		System.out.println("두 번째 숫자를 입력해 주세요 >>");
		danEnd = gugudan.numInput();
		
		gugudan.mulnum(danStart, danEnd);

	}

}
