package Chap04;

import java.util.Scanner;

// 조건 반복문이라고 한다.
public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char repeat;
		int num = 1;
		
		while(true) {
			while(num<=10) {
				System.out.println("음악을 재생합니다.");
				System.out.println(num+"번 트랙 재생");
				System.out.println("다시 처음부터 재생하시겠습니까?");
				repeat = scanner.next().charAt(0);
				
				if(repeat == 'y') {
					continue;
				}// if
				num += 1;
			}// while num
			
			System.out.println("다시 처음부터 재생하시겠습니까?");
			repeat = scanner.next().charAt(0);
			
			if(repeat != 'y') {
				break;
			}
	
		}
	}
}
