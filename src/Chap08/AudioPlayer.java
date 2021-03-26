package Chap08;

// 추상 클래스는 다른 클래스의 부모 클래스ㅜ가 될 수 있다.
// 부모 클래스가 추상 클래스라면
// 자식 클래스는 부모 클래스에 정의 되어있는
// 추상 메서드를 반드시 구현해야 한다.
public abstract class AudioPlayer extends Player {
	// 부모 클래스에 정의 되어있는 메서드를 자식 클래스에서 재정의 하는 것: 오버라이딩
	public void play(int pos) {
		System.out.println("player 메서드 오버라이딩");
	}
	
	public void stop() {
		System.out.println("stop!!");
	}
}
