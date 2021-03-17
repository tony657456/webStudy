package Chap01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("시력: ");
//		Double sight = scanner.nextDouble();
		
//		if(sight>=0.0 && sight <=2.0) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
		
//		boolean result1 = sight < 0.0;
//		boolean result2 = sight > 2.0;
//		boolean result = result1 || result2;
//		
//		System.out.println(!result);
		
//		int num1 = 15;
//		int num2 = 17;
//		
//		int num5 = num1^num2;
//		int num3 = num1  << 2;
//		int num4 = num1  >> 2;
//		
//		System.out.println(num5);
//		System.out.println(num3);
//		System.out.println(num4);

//		int num1 = true ? 1:2;
//		int num2 = false ? 1:2;
//		
//		System.out.println(num1);
//		System.out.println(num2);
		
//		boolean button  = true;
//		
//		String status = button ? "불이 켜졌습니다": "불이 꺼졌습니다";
//		System.out.println(status);
		
		Scanner scanner = new Scanner(System.in);
		int kor  = scanner.nextInt();
		boolean result  = 0<=kor && kor<=100;
		String str = result ? "올바른 점수입니다":"올바르지 않은 점수 입니다";
		System.out.println(str);
		
		result = kor >=50;
		str = result ? "Pass": "Fail";
		
		System.out.println(str);
	}

}
