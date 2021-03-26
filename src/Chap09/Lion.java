package Chap09;

public class Lion extends Animal {
	public Lion() {
		super("사자");
	}

	@Override
	public void run() {
		System.out.println(getMyName()+"가 달려갑니다");
	}

	@Override
	public void findFood() {
		// TODO Auto-generated method stub
		System.out.println("사냥감을 쫓아가 잡았습니다");
	}

	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
		System.out.println("잡아서 뜯어 먹음");
	}
	
	
	
}
