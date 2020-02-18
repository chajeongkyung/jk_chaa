
public class Time {
	
//	1. 시,분,초는 모두 0보다 크거나 같아야 한다
//	2. 시의 범위는 0~23, 분과 초의 범위는 0~59이다.
	
	int hour = 0;
	int min = 0;
	int sec = 0;
	
	int getHour() {
		return hour;
	}
	void setHour(int n) {
		if(n < 0 || n > 23) {
			return;
		}
		hour = n;
	}
	
	int getMin() {
		return min;
	}
	void setMin(int m) {
		if(m < 0 || m > 59) {
			return;
		}
		min = m;
	}
	
	int getSec() {
		return sec;
	}
	void setSec(int s) {
		if(s < 0 || s > 59) {	
			return;
		}
		sec = s;
	}
	
	
	
	
	
	
	

}
