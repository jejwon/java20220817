package ch07.lecture.p03abstract;

public class C01Abstract {
	public static void main(String[] args) {
		SubClass1 o1 = new SubClass1();
//		SuperClass o2 = new SuperClass1();
		
		SuperClass1 o3 = new SubClass1(); 
		//참조변수의 타입으로 o, 실제 인스턴스는 서브클래스
	}
}
