
public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat("고양이", 4, 1);		
		Rabbit rabbit = new Rabbit("토끼", 1, 4);
		Bird bird = new Bird("앵무새", 2, 1, 2);
		
		cat.run();		
		rabbit.run();
		bird.run();
	}

}
