package Chap06;

public class Ex1 {
	public static void main(String[] args) {
		TV LG_TV = new TV();
		
		// 1. 전원을 키고
		LG_TV.power();
		LG_TV.setColor("red");
		
		// 2. 채널번호를 알려준다.(이 방법이 좋은 방법이지만 항상 그렇게 하지는 못한다.)
		// getter
		System.out.println("현재 채널 번호는 "+ LG_TV.getChannel()+ "입니다");
		
		
		LG_TV.channelUp();
		LG_TV.channelDown();
		
		// TV 전원을 켰을 때 채널을 알려주는 것
		
		// 프로시저지향 프로그래밍 기법...
//		LG_TV.channel++();
//		LG_TV.channel--();
		
		// 객체지향 프로그래밍은 기능을 중심으로 프로그램을 개발하는 방법
		// 객체를 사용하는 쪽에서는 객체가 제공하는 기능만을 사용해야한다.
	}
}
