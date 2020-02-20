
public class HomeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Home myHome = new Home(5, 13, "dog");
		Home myHome2 = new Home(6, 45, "cat");
		
		
		
		System.out.println("MY SWEET HOME");
		System.out.println("방 개수 : " + myHome.room);
		System.out.println(myHome.floor + "층");
		System.out.println("애완동물 : " + myHome.pet);
		
		System.out.println();
		
		System.out.println("MY SWEET HOME");
		System.out.println("방 개수 : " + myHome2.room);
		System.out.println(myHome2.floor + "층");
		System.out.println("애완동물 : " + myHome2.pet);

	

		
	}

}
