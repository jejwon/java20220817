package ch06.lecture.p08singleton;

public class MyClass1 {
	//하나의 객체만 만듦
	private static final MyClass1 instance = new MyClass1(); //instance공개x, 객체 먼저 만들기
	
	private MyClass1() {
		
	}
	
	public static MyClass1 getInstance() { // 참조값만 리턴, 메소드만 공개
		return instance;
	}
	
	
}
