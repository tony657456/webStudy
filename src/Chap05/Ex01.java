package Chap05;
// Ex01 클래스는 메서드를 만들고
// 만든 메서드를 실행할 클래스
// 메서드를 만든다 -> 메서드를 정의한다/선언한다
public class Ex01 {
	void simple1() {
		System.out.println("Hello World~!");
	}
	
	public static void main(String[] args) {
		// simple1 메서드 호출
		Ex01 ex01 = new Ex01();
		
		// simple1 메서드 호출
		ex01.simple1();
	}

}
