package Chap01;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num1 = 10;
//		System.out.println(num1++);
//		num1 = num1+10;
//		System.out.println(++num1);		
//		num1 = num1-7;
//		System.out.println(--num1);
//		num1 = num1*2;
//		System.out.println(num1--);
//		double fNum = num1 / 4.0;
//		System.out.println(--fNum);
//		num1 = num1%12;
//		System.out.println(++num1);
//		
//		System.out.println(17 != 10);
//		System.out.println(17>32);
//		num1 =num1+1;
//		num1++;
//		System.out.println(num1);
//		System.out.println(++num1);
//		System.out.println(num1++);
//		System.out.println(num1);
		
//		num1 =num1-1;
//		num1--;
//		--num1;
//		System.out.println(num1);
		
//		char m = 'a';
//		char m2 = 'a';
//		
//		System.out.println(m==m2);
//		 System.out.println(m!=m2);
//		System.out.println(m>m2);
//		System.out.println(m>=m2);
//		System.out.println(m<m2);
//		System.out.println(m<=m2);
		
//		String m1 = "apple";
//		String m2 = "banana";
//		
//		System.out.println(m1 == m2);
//		System.out.println(m1 != m2);
		
//		int num1 = 27;
//		
//		System.out.println(num1 != 10);
//		System.out.println(num1 != 5);
//		System.out.println(num1 >= 27);
//		System.out.println(num1 <= 27);
//		System.out.println(num1 < 30);
//		System.out.println(num1 <= 30);
		
//		System.out.println(true&&true);
//		System.out.println(false&&false);
//		System.out.println(false&&true);
		
		char a = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요>>");
		int  korean = scanner.nextInt();
		
		if(korean>=90 && korean <=100) {
			a = 'A';
		}
		else if (80<= korean && korean<90) {
			a = 'B';
		}
		else if (70<= korean && korean<80) {
			a = 'C';
		}
		else if (60<= korean && korean<70){
			a = 'D';
		}
		else{
			System.out.println("잘못 입력 하셨습니다.");
		}
		System.out.println(a);

		scanner.close();

	}

}
