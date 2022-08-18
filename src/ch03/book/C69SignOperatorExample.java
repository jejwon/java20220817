package ch03.book;

public class C69SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		short s = 100;
//		short result3 = -s; //short의 연산의 결과는 int 
		int result3 = -s;
		System.out.println("result3=" + result3);
				
	}
	
	
	
	
}
