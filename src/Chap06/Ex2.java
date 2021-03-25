package Chap06;

public class Ex2 {
	public static void main(String[] args) {
		
		Car car= new Car(1);
		
		Car car1= new Car(2, 4);
		
		Car car2= new Car(3, 4, 10);
			
		Car car3= new Car(2, 6, 0, 100);
		
		TV tv1 = new TV();
		
		// 이런 저런 코드...
		
		tv1.setColor("빨간색");
		
		System.out.println("이 티비의 색깔은 " + tv1.getColor());
	
		
	}
}
