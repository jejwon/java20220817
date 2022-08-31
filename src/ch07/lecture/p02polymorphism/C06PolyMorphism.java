package ch07.lecture.p02polymorphism;

public class C06PolyMorphism {
	public static void main(String[] args) {
		SubClass3 o1 = new SubClass3();
		
		SuperClass3 o2 = o1;
		
		System.out.println(o2 == o1); //true
		System.out.println(System.identityHashCode(o1));
		System.out.println(System.identityHashCode(o2));
		
		o1.method1(); //instance method o1 == o2 같은 instance
		o2.method1(); //instance method, 실제 인스턴스의 메소드가 실행됨
		              // type: superclass, instance: subclass o1과 같음
		              //subclass의 재정의된 method1을 호출
		
		SuperClass3 o3 = new SuperClass3();
		o3.method1();
		
		
		
		
		
		
		
		
		
		
		
	}
}
