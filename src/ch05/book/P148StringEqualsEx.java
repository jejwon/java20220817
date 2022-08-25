package ch05.book;

public class P148StringEqualsEx {
	public static void main(String[] args) {
		String strVar1 = "Turner";
		String strVar2 = "Turner"; //동일한 문자열 리터럴로 생성된 객체를 참조하기 때문에 비교하면 true
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		} 
		String strVar3 = new String("Turner");
		String strVar4 = new String("Turner");// new연산자로 String객체를 별도 생성-> 참조값이 다름
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}
