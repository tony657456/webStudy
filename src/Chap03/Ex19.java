package Chap03;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = "+";
		String b = scanner.next();
		
		if(a.equals(b)) System.out.println("a와 b가 같습니다");
		else System.out.println("a와 b가 다릅니다");
		
		scanner.close();
	}
}
