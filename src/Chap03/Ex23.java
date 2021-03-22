package Chap03;

import java.util.Scanner;

public class Ex23 {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫 번째 수: ");
//		int num1 = scanner.nextInt();
//		
//		System.out.print("두 번째 수: ");
//		int num2 = scanner.nextInt();
//		
//		System.out.print("연산자: ");
//		String operator = scanner.next();
//		
//		switch(operator) {
//		
//		case "+":
//			System.out.println(num1+" + "+num2+" = "+(num1+num2));
//			break;
//		case "-":
//			System.out.println(num1+" - "+num2+" = "+(num1-num2));
//			break;
//			default:
//				System.out.println("+, -, *, / 만 입력하실 수 있습니다");
//		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("코리아 IT 자판기");
		System.out.println("1. 콜라");
		System.out.println("2. 환타");
		System.out.println("3. 사이다");
		System.out.println("4. 마운틴듀");
		System.out.print("자판기의 버튼을 누르세요: ");
		
		int button = scanner.nextInt();
		
		switch(button) {
		case 1: 
		case 2: 
		case 3: System.out.println("콜라"); break; 
		case 4: System.out.println("환타"); break;
		case 5:
		case 6: System.out.println("사이다"); break; 
		case 7: System.out.println("마운틴듀"); break; 
		default: System.out.println("1~7번만 누를 수 있습니다");
		}
			
	}
}
