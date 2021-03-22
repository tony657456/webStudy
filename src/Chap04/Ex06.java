package Chap04;

public class Ex06 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			int su = i%2;
			if(su==1)
				sum += i;
		}
		System.out.println(sum);

	}

}
