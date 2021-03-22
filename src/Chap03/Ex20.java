package Chap03;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요.: ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 수를 입력하세요.: ");
		int num2 = scanner.nextInt();
		System.out.print("연산자를 입력하세요.: ");
		String var1 = scanner.next();
		
		if(var1.equals("+")) System.out.println(num1 + num2);
		
		scanner.close();
	}
}
