package Chap04;

public class Ex07 {
	public static void main(String[] args) {
		int n = 10;
		int sum = 1;
		for (int i = n; i >=1; i--) {
			sum = sum * i;
		}
		
		System.out.println("¼øÂ÷°ö °á°ú = "+ sum);
		
		int sum1= 0;
		int sum2= 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 ==0) {
				sum2 += i;
			}else {
				sum1 += i;
			}
		}
		System.out.println("È¦¼öÀÇ ÇÕ = "+ sum1);
		System.out.println("Â¦¼öÀÇ ÇÕ = "+ sum2);
	}
}
