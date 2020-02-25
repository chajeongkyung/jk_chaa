
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double avg = 0;
		
		StudentVo student = new StudentVo();
		student.setName("홍길동"); 
		student.setNo(1);
		student.setBan(2);
		student.setKor(100);
		student.setMath(76);
		student.setEng(60);
//		System.out.println(student);

		
		sum = student.getKor() + student.getEng() + student.getMath();	
		avg = (int)((sum/3.0)*100 + 0.5)/100.0;		
		
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
