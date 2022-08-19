package ch03.book;

public class C90StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "터너";
		String strVar2 = "터너";
		String strVar3 = new String("터너");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		System.out.println(!strVar1.equals(strVar2)); //not 연산자 ! 
	}
}
