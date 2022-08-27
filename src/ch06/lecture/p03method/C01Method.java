package ch06.lecture.p03method;

public class C01Method {
	public static void main(String[] args) { //MyClass1설계도로 만들어지는 instance
		MyClass1 o1= new MyClass1();
		o1.name = "maverick";
		o1.age = 99; //(instance) field
		
		o1.method(); //실제instance가 있어야 method호출 가능
					//(instance) method호출
		
		System.out.println("메인 메소드 코드1");
	}
}
