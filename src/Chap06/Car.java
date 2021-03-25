package Chap06;

public class Car {
	private int color;
	private int wheel;
	private float speed ;
	private double fuel;
	
	public void setColor(int color) {
		this.color = color;
	}
	
	// 생성자 -> 인스턴스가 만들어질 때마다 자동으로 호출되는 메서드
	// 일반적인 메서드가 아니므로 이름이 정해져있음
	// 생성자 메서드의 이름은 클래스의 이름과 같아야한다.
	// 생성자 메서드는 반환타입이 없다.
	// 생성자의 접근 제어자는 public, private 중 하나를 쓸 수 있다.
	public Car() {
		// 인스턴스를 만들 때
		// 해당 인스턴스가 우리가 원하는 값을 갖고 있도록
		// 설정할 수 있음
		
		// 자동차의 색을 첫 번째로 지정
		color = 1;
		// 바퀴의 수
		wheel= 4;
		// 빠르기
		speed = 0;
		// 연료량
		fuel= 0;
		
		System.out.println("Car 클래스의 생성자 호출");
	}
	
	public Car(int color) {
		// 생성자 안에서 다른 생성자를 호출하는 방법
		// this(매개변수)는 생성자를 호줄하는 방법
		// 다른 생성자를 호출하는 이 코드는 생성장의 맨 위에 위치해야한다.
		this();
		
		this.color = color;
	}
	
	public Car(int color, int wheel) {
		this.color = color;
		this.wheel = wheel;
	}
	
	public Car(int color, int wheel, float speed) {
		this.color = color;
		this.wheel = wheel;
		this.speed = speed;
	}
	
	public Car(int color, int wheel, float speed, double fuel) {
		this.color = color;
		this.wheel = wheel;
		this.speed = speed;
		this.fuel = fuel;
	}
}
