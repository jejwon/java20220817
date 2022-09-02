package ch09.lecture.p02lambda;

public class MyClass3 {
	public static void main(String[] args) {
		MyInterface3 o1 = (String s) -> System.out.println(s);
		
		o1.method("hello");
		o1.method("bullet");
		
		MyInterface3 o2 = (s) -> System.out.println(s.repeat(2));
		
		o2.method("brad");
		o2.method("mav");
		
		
		
		
		MyInterface3 o3 = s -> System.out.println(s.repeat(3));
		
		o3.method("tan");
		o3.method("lem");
	}
}


interface MyInterface3{
	void method(String s);
}