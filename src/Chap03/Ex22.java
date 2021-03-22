package Chap03;

public class Ex22 {
	public static void main(String[] args) {
		int num2 = 7;
		num2 = num2%7;
		System.out.print("무슨요일>>");
		switch(num2) {
		
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		default:
			System.out.println("일요일");
		
	}
		

	}
}
