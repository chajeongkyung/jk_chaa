
public class StudentVo {
	
	private String name = "";
	private int ban = 0;
	private int no = 0;
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	
	
	public StudentVo() {
		super();
	}
	
	public StudentVo(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ban
	 */
	public int getBan() {
		return ban;
	}
	/**
	 * @param ban the ban to set
	 */
	public void setBan(int ban) {
		this.ban = ban;
	}
	/**
	 * @return the no
	 */
	public int getNo() {
		return no;
	}
	/**
	 * @param no the no to set
	 */
	public void setNo(int no) {
		this.no = no;
	}
	/**
	 * @return the kor
	 */
	public int getKor() {
		return kor;
	}
	/**
	 * @param kor the kor to set
	 */
	public void setKor(int kor) {
		this.kor = kor;
	}
	/**
	 * @return the eng
	 */
	public int getEng() {
		return eng;
	}
	/**
	 * @param eng the eng to set
	 */
	public void setEng(int eng) {
		this.eng = eng;
	}
	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}
	/**
	 * @param math the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	
	
	


	
	
	

}
