
public class Student {
	
	String name = "";
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	
	
	
	
	Student(String name, int ban, int no, 
			int kor, int eng, int math) {	
		
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}


	int getTotal() {
		int sum = 0;
		sum = kor + eng + math;

		return sum;
		
	}
	
	double getAverage() {
		double avg = 0;
		int sum = 0;
		
		sum = kor + eng + math;
		
		avg = sum / 3.0;		
		avg = (int)((avg * 100) + 0.5) / 100.0;
	
		return avg;		
		
	}
	
	void info() {
		
		System.out.println("실행결과");
		System.out.println("이름 : " + name + " / 반 : " + ban + " / 번호 :" + no);
		System.out.println("국어 : " + kor + " / 영어 : " + eng + " / 수학 : " + math);
		
	}
	
	
	

}
