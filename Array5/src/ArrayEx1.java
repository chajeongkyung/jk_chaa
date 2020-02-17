
public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int score4 = 0;
		int score5 = 0;

		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(score4);
		System.out.println(score5);
		
		System.out.println("==========배열시작==========");
		System.out.println();
//		배열(Array)
//		같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
//		표현식
//		타입[] 변수이름;
		
	
		int[] scoreArr = null;  //선언문 null기본값
		scoreArr = new int[5];
		scoreArr[0] = 1;
		
		System.out.println(scoreArr[0]);
		System.out.println(scoreArr[1]);
		System.out.println(scoreArr[2]);
		System.out.println(scoreArr[3]);
		System.out.println(scoreArr[4]);

	}

}
