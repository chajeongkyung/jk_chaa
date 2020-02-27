
public class Customer{

	//소유금액
	int money = 1000; 
	//보너스 점수
	int bonusPoint = 0;
	
	
	void buy(Product product) {
		if ( money < product.price) {
			System.err.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		
		money = money - product.price;
		bonusPoint = bonusPoint + product.bonusPoint;
		System.out.println(product + "을/를 구입했습니다");
	}
	

	@Override
	public String toString() {
		return "Customer [money=" + money + ", bonusPoint=" + bonusPoint + "]";
	}
	
	


}
