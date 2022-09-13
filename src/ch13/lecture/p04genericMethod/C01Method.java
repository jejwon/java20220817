package ch13.lecture.p04genericMethod;

public class C01Method {
	public static void main(String[] args) {
		
		C01Method.<String>method1("str");
		C01Method.<Integer>method1(3);
		C01Method.<Double>method1(3.14);
		
		//메소드 타입 파라미터 생략 가능
		method1("str");
		method1(3);
		method1(3.14);
	}
	
	public static <T> void method1(T p) { //타입이 나중에 결정
	}	
	
	public static void method(Object o) {
		
	}
	public static void method(String s) {
		
	}
	public static void method(Integer i) {
		
	}
	
	
}
