package ch07.book.s070706;

public class InstanceOfEx {
	public static void method1(Parent parent) {
		if(parent instanceof Child) { //Child타입으로 변환 가능한지 확인(parent파라미터가 가리키고 있는 instance가 child instance인지 확인)
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	
	
	public static void method2(Parent parent) { //parent instance를 가리키고 있다가 child instance로 형변환(parent -> child xxx)
		Child child = (Child) parent; //ClassCastException이 발생할 가능성이 있음
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA); //Child 객체를 매개값으로 전달
		method2(parentA);
		
		Parent parentB = new Parent(); 
		method1(parentB); //Parent 객체를 매개값으로 전달 
//		method2(parentB); //예외발생
	}
}
