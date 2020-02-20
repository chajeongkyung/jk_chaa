public class CardPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Card card = new Card();
		
		card.init(3, 5);
		
		str =  card.getCard();
		
		System.out.println(str);
		

	}

}
