package Chap05;


public class Ex04 {
//	void multiple() {
//		
//		for (int i  = 2; i < 10; i++) {
//			for (int j = 1;  j < 10; j++) {
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			}
//			System.out.println();
//		}
//	}// multiple
//	
//	void gugudan(int gugu) {
//		if(gugu == 2) {
//			for(int i = 1; i<10; i++) {
//				System.out.println(2+"*"+i+"="+(2*i));
//			}
//		}// if
//	}// gugudan
	
	void sum1() {
		System.out.println(10+20);
	}// sum
	
	void sum2(int n1, int n2) {
		System.out.println(n1+n2);
	}// sum2
	
	void compare1(int var1, int var2) {
		if(var1>var2) {
			System.out.println(var1);
		}else {
			System.out.println(var2);
		}
	}// a
	
	void compare2() {

	}

	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		ex04.sum1();
		ex04.sum2(10, 20);
		ex04.compare1(10, 11);
		
		
	}
}
