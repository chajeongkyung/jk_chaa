

public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer jihun = new Customer("박지훈", 22, 100);
		Customer jungkyung = new Customer("차정경", 24, 100);
		Customer ueigwang = new Customer("정의광", 29, 100);
		Customer jaemain = new Customer("노재민", 10, 100);
		Customer younghun = new Customer("김용훈", 25, 100);
		Customer sangah = new Customer("박상아", 30, 100);
		Customer ahrm = new Customer("원아름", 27, 100);
		Customer hyunsuk = new Customer("오현석", 27, 100);
		Customer jaegun = new Customer("정제건", 25, 100);
		Customer chanyang = new Customer("이찬양", 25, 100);
		
		ProductStore computerStore = new ProductStore("최고의 컴퓨터", 10);
		ProductStore mart = new ProductStore("연필", 1);
		ProductStore penMart = new
				ProductStore("볼펜", 3);
		ProductStore eraMart = new ProductStore("지우개", 5);
		ProductStore whiteMart = new ProductStore("화이트", 1);
		ProductStore noteMart = new ProductStore("공책", 2);
		
		computerStore.buy(jihun);
		System.out.println(jihun);
		System.out.println(computerStore);
		System.out.println();
	
		mart.buy(sangah);
		System.out.println(sangah);
		System.out.println(mart);
		System.out.println();
		
		penMart.buy(ahrm);
		System.out.println(ahrm);
		System.out.println(penMart);
		System.out.println();
		
		eraMart.buy(hyunsuk);
		System.out.println(hyunsuk);
		System.out.println(eraMart);
		System.out.println();
		
		whiteMart.buy(jaegun);
		System.out.println(jaegun);
		System.out.println(whiteMart);
		System.out.println();
		
		noteMart.buy(chanyang);
		System.out.println(chanyang);
		System.out.println(noteMart);
	
		
	}

}
