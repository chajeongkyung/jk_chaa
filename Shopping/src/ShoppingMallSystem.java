
public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 가게 물건 고객
		 * 
		 * 가게에는 물건이 있어야만 판매한다 에탄올(2500), 마스크(4000) 사람은 가게에 들어가서 물건을 구입할 수 있다
		 * 
		 * 가게는 유일하다
		 * 
		 * 고객은 2사람 존재한다 각자 하나만 구매한다
		 * 
		 */
		
		ProductStore jkstore = new ProductStore();
		
		Customer customer1 = new Customer("차정경", 24, 20000);
		Customer customer2 = new Customer("이찬양", 24, 70000);

		customer1.info();
		jkstore.buyMask(customer1);
//		jkstore.buyMask(customer1);
		
		System.out.println("현재 남은 돈은 " + customer1.money + " 원입니다");
		System.out.println("===================");
		

		
		
//		customer2.info();
//		jkstore.buyEthanol(customer2);
//		System.out.println("현재 남은 돈은 " + customer2.money + " 원입니다");
//		
//		System.out.println("===================");
//		System.out.println(customer2);
		
		
		
		
		
		
		
		
	}

}
