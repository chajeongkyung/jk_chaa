
public class CardCase {
	
//	private static final String n = null;

	int numOfCards = Card.shapeArr.length
			 * Card.numberArr.length;
	
	Card[] cardArr =  new Card[numOfCards];
	
	public CardCase() {

		int totalCnt = 0;
		
		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int j = 0; j < Card.numberArr.length; j++) {
				cardArr[totalCnt++] = new Card(i, j);
			}
			
		}

	}
//	카드를 하나 선택한다
	Card pick(int index) {
		return cardArr[index];
	}
//	카드를 랜덤으로 하나 선택한다
	
	Card pick() {
		int index = 0;
		index = (int)(Math.random() * numOfCards);
		
		return cardArr[index];
	}
	
	void shuffle() {
		int rand = 0;
		Card card = null;
		
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random() * numOfCards);
			
			card = cardArr[0];
			cardArr[0] = cardArr[rand];
			cardArr[rand] = card;
		}
		
	}
	
//	전체 카드 보기
	void caseInSide() {
		for (int i = 0; i < numOfCards; i++) {
			String myCard = "";
			myCard = cardArr[i].getCard();
			
			System.out.print(myCard + " ");
			if((i+1) % 13 == 0) {
				System.out.println();
			}
			
		}
	}
	

}
