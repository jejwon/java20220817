package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
//		MyInterface1 o1 = new MyInterface1(); 인터페이스가 구현된 콘크리트 클래스 필요
//		MyInterface1 o2 = new MyClass1();
		
		
		//인터페이스 구현과 객체 생성을 한 번에(콘크리트 클래스 바디에 들어갈 내용과 동일)
		MyInterface1 o3 = new MyInterface1() {

			@Override
			public void method() {
				System.out.println("재정의한 메소드");
			}
			
		};
		o3.method();
	}
}



class MyClass1 implements MyInterface1{

	@Override
	public void method() {

	}
	
}

interface MyInterface1{
	void method();
}



