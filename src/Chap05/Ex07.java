package Chap05;

public class Ex07 {	
// int -> add 메서드가 동작하고 나서 만들어 내는 결과값이 정수 타입이라는 것
// add -> 메서드의 이름
// () -> 매개변수가 필요 없는 메서드

	// 반환 타입
	// 정수: byte, short, int, long
	// 실수: float, double
	// 문자: char
	// 문자열: String
	// 인스턴스: 인스턴스에 맞는 클래스명
	
	int add() {
		int result = 1+1;
		return result;
	}
	
	double division() {
		double result2 = 36%5;
		return result2;
	}
	
	int sum() {
		int sum = 0;
		for(int i = 1; i<=5; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Ex07 ex07 = new Ex07();
		
		double result = ex07.add();
		
		System.out.println(result);
		System.out.println(ex07.division());
		System.out.println(ex07.sum());
		
	}
}
