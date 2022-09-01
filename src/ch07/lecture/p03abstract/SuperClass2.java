package ch07.lecture.p03abstract;

public abstract class SuperClass2 {
	//상위클래스에서 정의할 수 없지만 하위클래스에서 각각 다르게 사용할 수 있는 추상메소드
	//바디가 없는 메소드
	//상속받는 클래스가 꼭 구현해야 함
	//추상 메소드가 있는 클래스는 꼭 추상클래스여야 함
	public abstract void cry(); 
	
	public void walk() {
		System.out.println("네발로 걷습니다.");
	}
	
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}
