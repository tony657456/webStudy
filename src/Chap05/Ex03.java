package Chap05;

public class Ex03 {
	void simple(int val) {
		System.out.println(val);
	}
	
	void simple2() {
		System.out.println("Hello World~!");
	}
	
	void simple3(String message) {
		System.out.println(message);
	}
	
	// simple4는 정수 두 개가 필요한 메서드
	void simple4(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
	}
	}
	
	//simple5 메서드는 정수 두 개와 문자 하나가 필요한 메서드
	
	void simple5(int num3, int num4, char a) {
		if(a == '+') {
			System.out.println(num3+num4);
		}else {
			System.out.println(num3-num4);
		}
	}
	
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		
		ex03.simple(1);
		ex03.simple2();
		ex03.simple3("Hello World~!");
		ex03.simple3("안녕하세요");
		ex03.simple5(2, 3, '+');
	}
}
