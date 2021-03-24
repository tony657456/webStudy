package Chap04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 아래와 같이 줄 수를 입력 받아 별을(*)을 출력하세요.
		/*
		 * 줄 수: (입력) 3		즐 수 : 5
		 *					*
		 *					**
		 *					***
		 *					****
		 *					*****
		 * *
		 * **
		 * ***
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("줄 수: ");
		int row = scanner.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
