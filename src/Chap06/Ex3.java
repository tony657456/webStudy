package Chap06;

import Chap07.Child2;
import Chap07.Parent2;

public class Ex3 extends Parent2 {
	public void showVlaues() {
		System.out.println(num);
	}
	

	public static void main(String[] args) {

		Parent2 parent = new Parent2();
		
		System.out.println(parent.num);
		
		parent.setNum(10);
		System.out.println(parent.getNum());
		
		System.out.println("====== =====");
		
		Child2 child = new Child2();
		
		System.out.println(child.num);

	}

}
