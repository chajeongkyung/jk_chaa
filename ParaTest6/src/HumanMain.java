
public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human human = new Human("Brown", "Black", 100);
		Human human2 = new Human();

		human.humanInfo();
	
		
		human2.hairColor = "red";
		human2.eyeColor = "blue";
		human2.weight = 200;
		
		System.out.println();
		human2.humanInfo();
		

	}

}
