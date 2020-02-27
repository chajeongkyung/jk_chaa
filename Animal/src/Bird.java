
public class Bird extends AnimalTrait{

	int wing = 0;
	
	Bird(String name, int tail, int leg, int wing){
		this.name = name;
		this.tail = tail;
		this.leg = leg;	
		this.wing = wing;
	}


	@Override
	void run() {
		System.out.println("새는 날아요");
	}
}
