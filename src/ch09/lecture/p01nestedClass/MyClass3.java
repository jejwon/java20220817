package ch09.lecture.p01nestedClass;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 l = new MyInterface3() { //클래스 이름 없는 익명 클래스 객체

			@Override
			public void method() {
				System.out.println("재정의한 메소드");
				
			}
		};
	}
}


interface MyInterface3 {
	void method();
}