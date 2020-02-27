
public class Cat extends AnimalTrait{

	Cat(String name, int tail, int leg){
		this.name = name;
		this.tail = tail;
		this.leg = leg;	
	}


	@Override
	void run() {
		System.out.println("고양이는 달린다");
	}
	
}
