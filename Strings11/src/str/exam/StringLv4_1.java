package str.exam;

public class StringLv4_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절대 원본 데이터를 변경하지 않는다

		String originStr = "자바워크: 자바를 자바라"; // 기준
		String changeStr = "";          // 결과

		int idx = 0;


		changeStr = originStr.replace("자바", "DB");
//		idx = originStr.lastIndexOf("자바");

		idx = originStr.indexOf("자바", originStr.indexOf("자바")+7);

		changeStr = changeStr.substring(0, idx) + "자바라";
//		changeStr = changeStr.concat("자바라");
		

//		자바워크: 자바를 자바라를
//		DB워크: DB를 자바라로 변경하여 출력하시오 

		System.out.println(originStr);
		System.out.println(changeStr);

	}

}