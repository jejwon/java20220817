package ch09.lecture.p02lambda;

public class MyClass4 {
	public static void main(String[] args) {
		MyInterface4 o1 = (String s, int b) -> System.out.println(s.repeat(b));
		MyInterface4 o2 = (s, a) -> System.out.println(s.repeat(a));
		
//xxx		MyInterface4 o3 = s, a -> System.out.println(s.repeat(a)); 
		//파라미터 여러개: ()생략 불가
	}
}

interface MyInterface4{
	void method(String s, int b);
}