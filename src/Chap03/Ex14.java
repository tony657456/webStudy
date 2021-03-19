package Chap03;

public class Ex14 {
	public static void main(String[] args) {
//		System.out.println("코드 시작");
//		
//		if(true) {
//			System.out.println("참이니까");
//			System.out.println("출력");
//		}
//		if(false) {
//			System.out.println("거짓이니까");
//			System.out.println("출력x");
//		}
//		
//		System.out.println("코드 끝");
		
//		int score = 58;
//		
//		if (score>=60) {
//			System.out.println("통과");
//		}
//		if (score<60) {
//			System.out.println("재시험");
//		}
//		
		double Bmi = 50;
		
		if (Bmi<18.5) {
			System.out.println("저체중");
		}
		if (Bmi>=18.5 && Bmi<=24) {
			System.out.println("정상");
		}
		if (Bmi>=25&&Bmi<=29) {
			System.out.println("비만");
		}
		if (Bmi>=30) {
			System.out.println("고도 비만");
		}
	}
}
