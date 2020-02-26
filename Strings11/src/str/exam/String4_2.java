package str.exam;

public class String4_2 {



	String String4_2(String interestingStr, int num) {
		String originStr = "문자열은 재밌네요의 문짝입니다 " + "안녕하세요 자바의 문자열 요~? " + "자바에서 문자열은 중요한가요 요!?";
		String changeStr = ""; // 리턴 값
	
		int interestingIndex = 0;
		changeStr = originStr;
	

		String frontStr = "";
		String centerStr = "";
		String endStr = "";

		for (int i = 0; i < num; i++) {
			// "문자열"의 첫번째 인덱스

			interestingIndex = changeStr.indexOf(interestingStr);
//         System.out.println(interestingIndex);

			frontStr = changeStr.substring(0, interestingIndex);
//         System.out.println(frontStr);

			centerStr = changeStr.substring(interestingIndex, interestingIndex + interestingStr.length());
//         System.out.println(centerStr);
			centerStr = centerStr.replace(interestingStr, "객체");
//         System.out.println(centerStr);

			endStr = changeStr.substring(interestingIndex + interestingStr.length());
//         System.out.println(endStr);

			changeStr = frontStr + centerStr + endStr;
//         System.out.println("!!!!!!!! " + changeStr);
//         System.out.println("!!!!!!!! " + originStr);
		}

		return changeStr;
	}

//	void output() {
//		System.out.println(originStr);
//		System.out.println(changeStr);
//	}

}
