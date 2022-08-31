package ch07.lecture.p02polymorphism;

public class C09Casting {
	public static void main(String[] args) {
		SuperClass4 o1 = new SubClass41();
		SubClass41 o2 = (SubClass41) o1;
		
		SuperClass4 o3 = new SubClass42();
		
		//instanceof 연산 : 결과 boolean
		//좌항: 참조변수
		//우항: 타입(클래스, 인터페이스)
		
		System.out.println(o3 instanceof SubClass42); //true
		System.out.println(o3 instanceof SuperClass4); 
		System.out.println(o3 instanceof SubClass41); 
		
		
		if (o3 instanceof SubClass41) {
			SubClass41 o4 = (SubClass41) o3;
		} //casting 가능한지 확인하기
		
//		SubClass41 o4 = (SubClass41) o3; //강제타입변환 41<-->42 서로 타입 변환 불가
		//프로그램 종료시킴
		
		
		System.out.println("프로그램 종료");
	}
}
