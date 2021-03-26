package Chap08;

public class Ex5 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		// 업캐스팅
		car= (Car) fe1;
		
		// 다운캐스팅
		fe2= (FireEngine) car;
		
//		car.water();
		fe1.water();
		fe2.water();
		
		
	}
}
