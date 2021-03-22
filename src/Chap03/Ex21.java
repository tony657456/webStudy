package Chap03;

public class Ex21 {
	public static void main(String[] args) {
		int num = 100;
		
		num = num%2;
		
		if(num<=100 || num<0) {
			
		switch(num) {
		
			case 0:
				System.out.println("짝수입니다");
				break;
			case 1:
				System.out.println("홀수입니다!");
				break;
				
		}// end switch
		
		}// end if
		
		else {
			System.out.println("0이상의 수와 100이하의 수만 가능합니다");
		}
		
		System.out.println("프로그램 종료");
	}// end main
	
}// end class
