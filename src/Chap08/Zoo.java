package Chap08;

public class Zoo {
	public static void main(String[] args) {
		// 사육사 제임스를 생성
		ZooKeeper james = new ZooKeeper();
		
		// 사자에게 먹이를 주기
		Lion lion = new Lion();
		james.feed(lion);
		
		// 토끼에게 먹이를 주기
		Rabit rabit  = new Rabit();
		james.feed(rabit);
		
		// 원숭이에게 먹이를 주기
		Monkey monkey = new Monkey();
		james.feed(monkey);
	}
}
