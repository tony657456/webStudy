package Chap05;

public class Ex05 {
	void change(int num1) {
		num1 = num1 * 10;
		
		System.out.println("change(int): "+num1);
	}
	
	void change(SimpleType type) {
		type.num1 = type.num1 * 10;
		
		System.out.println("change(SimpleType): "+type.num1);
	}
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		int num1 = 10;
		
		System.out.println("before: "+ num1);
		ex05.change(num1);
		System.out.println("after: "+num1);
		System.out.println();
		
		SimpleType type = new SimpleType();
		type.num1 = 10;                                                                                                                                      
		
		System.out.println("befor: "+type.num1);
		ex05.change(type);
		System.out.println("after: "+type.num1);
	}
}
