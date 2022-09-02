package ch08.lecture.p03others;

public interface MyInterface1 {
	void method();//public abstract
	
	default void method2() {
		//interface default method
		//body를 가질 수 있음
		//재정의하지 않아도 되는 instance메소드
	}
}
