package Chap03;

import java.util.Scanner;

public class Ex17 {
	final static int week = 7;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2021년 3월의 날짜: ");
		int dayOfMonth = scanner.nextInt();
		
		if (dayOfMonth%week == 0) {
			System.out.print("일요일");
		}
		else if (dayOfMonth%week == 1) {
			System.out.print("월요일");	
		}
		else if (dayOfMonth%week == 2) {
			System.out.print("화요일");
		}
		else if (dayOfMonth%week == 3) {
			System.out.print("수요일");
		}
		else if (dayOfMonth%week == 4) {
			System.out.print("목요일");
		}
		else if (dayOfMonth%week == 5) {
			System.out.print("금요일");
		}
		else if (dayOfMonth%week == 6) {
			System.out.print("토요일");
		}
		
		System.out.println("입니다");
		scanner.close();
	}
}
