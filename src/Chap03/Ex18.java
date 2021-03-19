package Chap03;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.print("수를 입력하세요: ");
//		int n1  = scanner.nextInt();
//		int n2  = scanner.nextInt();
//		
//		if(n1>n2) System.out.println(n1);
//		else System.out.println(n2);
		
		System.out.print("점수를 입력하세요: ");
		int num = scanner.nextInt();
		
		if(num>=90&&num<=100) System.out.println("학점은 A입니다");
		else if(num>=80&&num<90) System.out.println("학점은 B입니다");
		else if(num>=70&&num<80) System.out.println("학점은 C입니다");
		else if(num>=60&&num<70) System.out.println("학점은 D입니다");
		else System.out.println("학점은 F입니다");
		
		scanner.close();
		
	}
}
