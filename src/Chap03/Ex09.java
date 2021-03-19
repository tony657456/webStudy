package Chap03;

public class Ex09 {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		student1.name = "고영희";
		student1.addr = "부산광역시 부산진구 중앙대로";
		
		Student student2 = new Student();
		
		student2.name = "이철수";
		student2.addr = "부산광역시 남구 전포대로";
				
		Student[] studentList = new Student[5];
		
		studentList[0] = new Student();
		studentList[1] = new Student();
		studentList[2] = new Student();
		studentList[3] = student2;
		studentList[4] = new Student();
		System.out.print("이사 전= ");
		System.out.println(student2.addr);
		
		studentList[0].name = "이철수";
		studentList[3].addr = "부산광역시 부산진구 범천동";
		
		// 왜 student2의 주소까지 변경이 될까?
		System.out.println(studentList[3].addr);
		System.out.println(student2.addr);
	}
}
