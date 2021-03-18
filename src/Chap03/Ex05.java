package Chap03;

public class Ex05 {
	int var1;
	double var2;
	char var3;
	String var4;
	String var5;
	
	public static void main(String[] args) {
		
		// 클래스라고 하는 나만의 데이터 타입 선언
		// 클래스를 사용해서 인스턴스를 생성
		// 인스턴스 안에 데이터를 저장
		// 저장된 데이터를 출력
		
		//1. Ex03타입의 인스턴스를 생성
		//2. obj1 객체에 저장
		Ex03 obj1 = new Ex03();
	
		//2. Ex04타입의 인스턴스를 생성
		//2. obj2 객체에 저장
		Ex04 obj2 = new Ex04();

		obj2.var2 = "하하하";
		obj2.var3 = "하하";
		obj2.num1 = 100;
		obj2.num2 = 50;
		
		
		//3. Ex05타입의 인스턴스를 생성
		//2. obj3 객체에 저장
		Ex05 obj3 = new Ex05();
		obj3.var1 = 32;
		obj3.var2 = 180.6;
		obj3.var3 = 'A';
		obj3.var4 = "나이키";
		obj3.var5 = "삼성";
		
		System.out.println(obj3.var1);
		System.out.println(obj3.var2);
		System.out.println(obj3.var3);
		System.out.println(obj3.var4);
		System.out.println(obj3.var5);
		System.out.println("===================");
		
		//예제1. Ex05 클래스의 인스턴스를 만들고 ex05객체에 저장하시오.
		Ex05 ex05 = new Ex05();
		
		//예제2. chulsu 객체를 만들고 Student클래스의 인스턴스에 저장하시오.
		Student chulsu = new Student();
		chulsu.name = "이철수";
		chulsu.age = 16;
		
		System.out.println(chulsu.name);
		System.out.println(chulsu.age);
		System.out.println("===================");
		
		//예제3. Student 클래스의 인스턴스를 만들고 student객체에 저장하시오.
		Student student = new Student();
		System.out.println(student.name);
		System.out.println(student.age);
	}
}



























