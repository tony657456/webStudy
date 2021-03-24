package Chap05;

public class Ex06 {
	void change(SimpleType type) {
		type.num1 = type.num1 * 10;
		
		System.out.println("change(SimpleType): "+type.num1);
	}
	
	void change(int[] arr) {
		arr[0] = arr[0] * 10;
		
		System.out.println("change(int[]): "+ arr[0]);
	}
	
	void change(int num1) {
		num1 = num1*10;
		
		System.out.println("change(int): "+num1);
	}
	
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		
		SimpleType type = new SimpleType();
		type.num1 = 10;                                                                                                                                      
		
		System.out.println("befor: "+type.num1);
		ex06.change(type);
		System.out.println("after: "+type.num1);
		System.out.println();
		
		int[] arr = {1, 2, 3};
		
		System.out.println("befor: "+arr[0]);
		ex06.change(arr);
		System.out.println("after: "+arr[0]);
		System.out.println();
		
		System.out.println("befor: "+arr[0]);
		ex06.change(arr[0]);
		System.out.println("after: "+arr[0]);
	}
}
