package Chap07;

public class Child extends Parent {
	// 부모 클래스로부터 상속 받은 정수를 저장하는 x
	public int x;
	public int y;
	
	// 상속 관계에서는 자식 클래스의 기본 생성자는
	// 매개변수는 없고 부모 클래스의 기본 생성자를 호출한다.
	
	public Child() {
		this(0,0);
		
		System.out.println("매개변수가 없는 생성자");
//		 기본 생성자를 직접 추가했고
//		 부모 클래스의 기본 생성자를 호출하는 코드를
//		 작성하지 않았다.
	}
	
	// 자식 클래스의 인스턴스가 만들어질 때
	// 부머 클래스의 멤버들을 같이 생성하므로
	
	// 자식 클래스의 생성자를 만든다면
	// 자식 클래스의 생성자의 맨 처음에 부모 클래스의 생성자를 호출해야 한다.
	
	public Child(int x, int y) {
		super(1);
		System.out.println("자식 클래스의 생성자");
		this.x= x; this.y= y;
	}
	
	public void method() {
		System.out.println("x= "+ x);
		System.out.println("this.x= "+ this.x);
		System.out.println("super.x= "+ super.x);	
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		
	}
}
