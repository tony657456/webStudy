package Chap03;

public class Ex12 {
	public static void main(String[] args) {
//		Numbers numbers = new Numbers();
//		
//		numbers.num1 = 1_000_000;
//		numbers.num2 = numbers.num1;
//		
//		long var = (long)numbers.num1 * (long)numbers.num2;
//		System.out.println(var);
		
		double pi = 3.141592;
		
		double pi_1 = pi*1000;
		System.out.println(pi_1);
		
		int pi_2 = (int)(pi*1000);
		System.out.println(pi_2);
		
		double pi_3 = (int)(pi*1000)/1000.0;
		System.out.println(pi_3);
		
		System.out.println(pi);
		
		double pi_4 = (pi*100)+0.5;
		System.out.println(pi_4);
	}
}
