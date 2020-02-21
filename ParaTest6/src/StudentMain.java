
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double avg = 0;
	
		
		Student student = new Student
				("홍길동", 2, 1, 100, 60, 76);

		
		sum = student.getTotal();		
		avg = student.getAverage();		
		
		student.info();
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
