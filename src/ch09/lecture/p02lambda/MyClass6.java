package ch09.lecture.p02lambda;

public class MyClass6 {
	public static void main(String[] args) {
		MyInterface6 o1 = () -> {
			int d = (int)(Math.random() * 6) + 1;			
			
			return d;
		};
		int n1 = o1.method();
		System.out.println(n1);
		System.out.println(o1.method());
		
		
		
		MyInterface6 o2 = () -> {
			return (int)(Math.random() * 6) +1; //서로 다른 객체지만 같은 일을 함
		};
		
		System.out.println(o2.method());
		
		
		//코드한줄이면 {}생략 가능: return키워드도 생략!
		MyInterface6 o3 = () -> (int)(Math.random() * 6) + 1;
		System.out.println(o3.method());
	}
}
interface MyInterface6 {
	int method();
}