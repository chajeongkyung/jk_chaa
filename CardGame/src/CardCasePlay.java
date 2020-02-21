
public class CardCasePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardCase cardCase = new CardCase();
		
		cardCase.shuffle();
		cardCase.caseInSide();
		
		
		Card card = cardCase.pick();
		
		
		System.out.println(card.getCard());
		
		
	}

}
