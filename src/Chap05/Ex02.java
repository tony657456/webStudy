package Chap05;

public class Ex02 {
	void simple2() {
		System.out.println("Java Program Start");
	}
	
	void simple3(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	void simple4() {
		System.out.println("2021-03-14");
	}
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		
		ex02.simple2();
		ex02.simple3(1,1);
		ex02.simple4();
	}
}
