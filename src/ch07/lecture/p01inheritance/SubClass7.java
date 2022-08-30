package ch07.lecture.p01inheritance;

public class SubClass7 extends SuperClass7{
	
	public SubClass7() {
		super(1);//상위클래스 생성자 꼭 실행해야 함(다른 코드보다 먼저!!!)
		//슈퍼클래스 인스턴스 필드 초기화 하는 일
//		super();//꼭 실행해야 함- 안써도 자동 삽입
		//서브 클래스의 인스턴스 필드 초기화 하는 일...
		System.out.println();
	}
}
