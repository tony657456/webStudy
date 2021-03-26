package Chap09;

public abstract class Animal {
	private String name;
	private int hungry;
	
	public Animal() {
		this("animal");
	}
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getMyName() {
		return name;
	}

	// 동물든은 배고플 때 음식을 찾앗거 먹으므로
	// eat 메서드를 사용해서 배고프다면
	// 음식을 찾고 먹도록 구현하였다.
	//이떄, 동물들 마다 음식을 찾는 방식이 다 다르므로 findFood 메서드는 추상메서드로
	// 동물들 마다 음식을 먹는 방식이 다르므로 eatFood 메서드는 추상메서드로 선언 하였음.
	
	public abstract void run();
	public abstract void findFood();
	public abstract void eatFood();
	public void ear() {
		if(hungry <= 5) {
			// 음식을 찾는다.
			findFood();
			// 음식을 먹는다.
			eatFood();
		}
	}
}
