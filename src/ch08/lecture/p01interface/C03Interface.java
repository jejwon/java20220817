package ch08.lecture.p01interface;

public class C03Interface {
	public static void main(String[] args) {
		MyInterface3 o1 = new MyClass3();
		MyInterface3 o2 = new MyClass4();
		
		o1.method1();
		o1.method2();
		o1.method3();
		o1.method4();
		
		o2.method1();
		o2.method2();
		o2.method3();
		o2.method4();
		
		System.out.println("=============메소드 호출");
		method1(o1);//실제 인스턴스는 myclass3인스턴스/ 실제 인스턴스의 메소드 실행됨
		method1(o2); //자동형변환
	}
	
	public static void method1 (MyInterface3 o) {
		o.method1(); 
//컴파일됨-> 재정의됨
//-> myclass3으로 만들어진 인스턴스는 myinterface3타입으로 만들어진 어떤 인스턴스가 들어오든 그 클래스는 method1을 재정의했다는 것이 보장됨
		o.method2();
		o.method3();
		o.method4();
	}
}
