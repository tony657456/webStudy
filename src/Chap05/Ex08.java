package Chap05;

public class Ex08 {
//	int add(int num1, int num2) {
//		int result = num1+num2;
//		return result;
//	}
	
	int div(int num1, int num2) {
		int result = num1%num2;
		return result;
	}
	
	int stackAdd(int var1) {
		if(var1 < 0 || var1 > 100) {
			System.out.println("n은 0이상 100이하만 가능합니다");
		return -1;
		}
		int sum = 0;
		for(int i = 1; i<=var1; i++) {
			sum += var1;
		}
		return sum;
	}
		
	public static void main(String[] args) {
		
		
		
	}
	}

