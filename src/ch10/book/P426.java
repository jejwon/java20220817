package ch10.book;

public class P426 {
	public static void main(String[] args) {
		String data1 = "100";
		String data = "a100";
		
		
		//클래스에 바로 접근할 수 있는 static method인 parseXXX()는 문자열을 숫자로 반환가능
		//숫자로 변환될 수 없는 문자 포함 -> 예외 발생
		
		int value1 = Integer.parseInt(data1);
//		int value2 = Integer.parseInt(data2); //NumberFormatException 
		
//		int result = value1 + value2;
//		System.out.println(data1 + "+" + data2 + "=" result);
	}
}
