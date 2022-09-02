package ch08.lecture.p03others;

public interface MyInterface4 {
	//static 작성 가능
	//public
	static void method4() {
		System.out.println("인스턴스 생성 없이 실행 가능");
	}
	
	void method1(); //추상메소드
	default void method2(){
		//instance 메소드
	}
	
	private void method3() {
		
	}
	
	
}
