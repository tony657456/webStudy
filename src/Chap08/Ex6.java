package Chap08;

public class Ex6 extends Product {
	public static void main(String[] args) {
		// 사과
		Apple[] applebasket = new Apple[3];
		
		applebasket[0]= new Apple();
		
		// 바나나를 담을 수 있는 바구니를 만들어서 바구니에 바나나를 담아보세요.
		Banana[] bananabasket = new Banana[3];
		
		bananabasket[0] = new Banana();
		
		// 양파
		Onion[] onionbasket = new Onion[3];
		
		onionbasket[0] = new Onion();
		
		Product[] basket3 = new Product[3];
	}
}
