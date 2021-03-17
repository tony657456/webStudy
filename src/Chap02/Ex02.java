package Chap02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴파일 타임에 배열의 크기를 결정
		char[] arr1  = new char[2];
		
		System.out.println("배열의 갯수: ");
		
		Scanner scanner  = new Scanner(System.in);
		
		int length = scanner.nextInt();
		// 실행 단계에서 배열의 크기를 결정(동적 배열 생성)
		char[] arr_1 = new char[length];
	}

}
