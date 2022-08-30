package ch07.lecture.p01inheritance;

public class SubClass5 extends SuperClass5{
	@Override
	public void method1() {
		super.method1(); //super. : 상위클래스의 멤버에 접근 가능
		System.out.println("추가한 코드들...");
	}
}
