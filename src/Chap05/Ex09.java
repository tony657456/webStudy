package Chap05;

public class Ex09 {
	
	// 세 add 메서드는 이름은 같지만 매개변수가 다르므로 오버로딩 된 메서드이다.
	// 1. 메서드 이름이 같아야 한다.
	// 2. 매개변수 타입이나 갯수가 달라야 한다.
	// 3. 리턴타입은 고려 대상이 아니다.
	
	int add(int num1, int num2) {
		int add = num1 + num2;
		return add;
	}
	
	double add(double num1, double num2) {
		double add = num1 + num2;
		return add;
	}
	
	double add(double num1, int num2) {
		double add = num1 + num2;
		return add;
	}
	public static void main(String[] args) {
		Ex09 ex09 = new Ex09();
		
		ex09.add(1, 1);
		ex09.add(1, 0.1);
		ex09.add(0.1, 0.1);
	
}
}
