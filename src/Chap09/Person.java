package Chap09;

public class Person extends Animal{
	public Person() {
		super("사람");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getMyName()+"이 달려갑니다");
		
	}

	@Override
	public void findFood() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatFood() {
		// TODO Auto-generated method stub
		
	}
}
