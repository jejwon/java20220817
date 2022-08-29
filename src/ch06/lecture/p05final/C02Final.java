package ch06.lecture.p05final;

public class C02Final {
	public static void main(String[] args) {
	//책 (645)
	//final: 변수의 값을 한 번만 할당할 수 있다.
	
	int a = 3;
	a = 5;
	
	final int b;
	b = 9;
//	b = 6; //xxx
	
	
	method1(30);
	method2(33);
	
	}
	
	
	static void method1 (int i) {
		i = 3;
	}
	
	static void method2 (final int i) { //메소드 호출할 때 이미 할당됨
//		i = 5; //xx 두번째 할당 
	}
}
