// 어떤 단 하나의 물건만 팔수있는 매장
public class ProductStore{
	
	int storeMoney = 0;  // 주인장의 소지금
	
	Mask mask = new Mask();
	Ethanol ethanol = new Ethanol();
	int maskNum = 1;
	
	void buyMask(Customer customer){	
		if (maskNum == 0) {
			System.out.println("재고가 부족합니다!");
			return;
		}
		if(customer.money >= mask.price){
			customer.money = customer.money - mask.price; 
			storeMoney = storeMoney + mask.price;
			System.out.println("마스크를 구입하셨습니다.");
			maskNum--;
		}else{
			System.out.println("마스크를 구입하기에 ");
			System.out.println(customer.money - mask.price + " 원 부족합니다.");
		}
		
		
	}
	
	void buyEthanol(Customer customer) {
		if(customer.money >= ethanol.price){
			customer.money = customer.money - ethanol.price; 
			storeMoney = storeMoney + ethanol.price;
			System.out.println("에탄올을 구입하셨습니다.");
		}else{
			System.out.println("에탄올을 구입하기에 ");
			System.out.println(customer.money - ethanol.price + " 원 부족합니다.");
		}
	}		
	
}
