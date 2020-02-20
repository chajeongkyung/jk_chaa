
public class Card {
	
	static String[] shapeArr = {"♥", "★", "♠", "♣"};
	static String[] numberArr = {"A", "2", "3", "4", "5", "6"
			, "7", "8", "9", "T", "J", "Q", "K"};
	
	String card = "";
	
	Card(){
		
	}
	//	랜덤
	void init() {
		//모양랜덤
		int shapeIndex = (int)(Math.random() * shapeArr.length);
		//숫자랜덤
		int numberIndex = (int)(Math.random() * numberArr.length);
		
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	//직접 뽑기
	void init(int shapeIndex, int numberIndex) {

		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	String getCard() {
		return card;
	}
	

}
