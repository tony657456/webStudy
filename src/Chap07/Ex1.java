package Chap07;

public class Ex1 {
	// A - 최상위 부모 클래스
	// B - A 클래스의 자식 클래스
	// C - A 클래스의 자식 클래스, D 클래스의 부모 클래스
	// D - C 클래스의 자식 클래스
	public static void main(String[] args) {
		A a = new A();
		
		B b = new B();
		b.setNum2(2);
		C c = new C();
		
		D d = new D();
		
	}
	
}
