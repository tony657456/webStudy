package Chap02;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr1 = new int[2][2];
//		
//		double[][] arr2 = new double[3][2];
//		
//		char[][] arr3 = new char[2][3];
//		
//		char[][] arr4 = new char[3][3];
//		
//		double[][] arr5 = new double[4][1];
//		
		int[][] scores = {
				{84, 62, 55},
				{93, 71, 80},
				{52, 79, 33},
				{42, 100, 52}
				};
		
		System.out.println(scores[0][0]);
		System.out.println(scores[0][1]);
		System.out.println(scores[0][2]);
		
		int kor = scores[0][0];
		// 행번호만 사용했을 때 적절한 타입의 변수에 저장하세요.
		// 첫번째 행을 따로 빼온 다음 하나씩 출력한 경우(열번호를 사용하여 접근할 수 는 없다.)
		int[] student = scores[0];
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		
		int [][] studentInfo = new int[3][];
		studentInfo[0] = new int[3];
		studentInfo[1] = new int[5];
		studentInfo[2] = new int[1];
		

		
		}
		
	}
