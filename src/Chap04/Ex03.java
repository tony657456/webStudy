package Chap04;

import java.util.Iterator;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
//		System.out.println("구구단 2단...");
//		int num = 2;
//		int i =1;
//		while(i<10) {
//			System.out.println(num+"*"+i+"="+(num*i));
//			i += 1;
//		}
//		
		int num2= 2;
		while(num2<6) {
			int a =1; // 밑에 while문이 끝나면 int i는 메모리상에서 사라진다.
			while(a<10) {
				System.out.println(num2+"*"+a+"="+(num2*a));
				a += 1;
			}// while a
			num2 += 1;
			System.out.println();
		}// while num2
	}
}
