package Chap04;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
//		String number  = "0123456789";
//		for(int  i =0; i<number.length(); i++) {
//			System.out.println(number.charAt(i));
//		} 
//		String a = "sa;fdjas;fjasl;kfjdsjfiosdadasdfffasffffsddjfpiodsjf";
//		for(int i =0; i<a.length(); i++) {
//			char monja = a.charAt(i);
//			
//			if(monja == 'a') {
//				System.out.println(monja);
//			}
//		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("공백을 제거하고 문자열을 출력하세요: ");
		String a = scanner.nextLine();
		
		for (int i = 0; i < a.length(); i++) {
			char monja  = a.charAt(i);
			if(monja != ' ') {
				System.out.print(monja);
			}// if
		}// for
		
	}
}
