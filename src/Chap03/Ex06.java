package Chap03;

public class Ex06 {
	public static void main(String[] args) {
		SimpleType1 type1 = new SimpleType1();
		type1.num1 = 10;
		type1.num2 = 11;
		
		SimpleType2 type2 = new SimpleType2();
		type2.var1 = 21;
		type2.var2 = 20;
		SimpleType2.var3 = 30;
		
		System.out.println(type1.num1);
		System.out.println(type2.var2);
		
		System.out.println(type1.num2);
		System.out.println(type2.var2);
		System.out.println(SimpleType2.var3);
	}
}
