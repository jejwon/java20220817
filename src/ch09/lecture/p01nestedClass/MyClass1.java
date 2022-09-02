package ch09.lecture.p01nestedClass;

public class MyClass1 {
	
	//인스턴스 중첩 클래스
	class NestedClass{
		//field
		//constructor
		//method
	}
	
	//스태틱 중첩 클래스
	static class StaticNestedClass{
		//field
		//constructor
		//method
	}
	
	//로컬 클래스 : 메소드 안에 클래스
	public void method() {
		class LocalClass{
			//field
			//constructor
			//method
		}
	}
}
