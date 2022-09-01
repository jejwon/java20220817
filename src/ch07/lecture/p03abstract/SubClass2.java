package ch07.lecture.p03abstract;

public class SubClass2 extends SuperClass2{
	//하위클래스는 상위 추상클래스의 추상메소드를 구현해야 함
	
	@Override
	public void cry() {
		System.out.println("월월");
	}
	
	@Override
	public void eat() {
		System.out.println("사료를 먹습니다.");
	}
	
}
