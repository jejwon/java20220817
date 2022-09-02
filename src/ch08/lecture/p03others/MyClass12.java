package ch08.lecture.p03others;

public class MyClass12 implements MyInterface1{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}
	
	//public 생략됨
	//default 메소드 override가능
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		MyInterface1.super.method2(); //interface명.super.메소드호출
		//super만 : 상속관계에 있는 object(생략가능) 호출
	}

}
