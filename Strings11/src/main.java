
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originStr = "자바를 자바라";
		String changeStr = "";
		
		int index = 0;
		index = originStr.length()-1;
	
		changeStr = originStr.substring(index);
		
		System.out.println(originStr);
		System.out.println(changeStr);

	}

}
