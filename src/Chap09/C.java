package Chap09;

// 인터페이스의 상속은 한번에 여러 인터페이스를 상속할 수 있다.(다중상속)
// 클래스는 한번에 하나의 클래스만 상속 할 수 있다.(단일상속)
public interface C extends B {
	public static final int a = 10;
	
	public abstract void method1();
}
