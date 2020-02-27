
public class Rabbit extends AnimalTrait{
	
	Rabbit(String name, int tail, int leg){
		this.name = name;
		this.tail = tail;
		this.leg = leg;	
	}


	@Override
	void run() {
		System.out.println("토끼는 달린다");
	}

}
