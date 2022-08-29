package ch06.lecture.p05final;

public class MyClass1 {
	//static final : 상수
	//상수명 작성 관습: UPPER_SNAKE_CASE
	static final int ABC = 990;
	static final int DEF;
	static final int MY_HOME_NUMBER = 3030;
	
	static {
		DEF = 100;
	}
	
	
	//field
	final int a = 5;
	final int b;
	
	//constructor
	public MyClass1(){
		b = 9;
	}
	
	public MyClass1(int b) {
		this.b = b;
	}
	
//	MyClass1(int c, int d) {
//		초기화 해야됨
//      this.b = 999;
//	}
}
