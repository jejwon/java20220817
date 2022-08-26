package ch06.lecture.p02constructor;

public class C03Constructor {
	public static void main(String[] args) {
		MyClass3 o1 = new MyClass3 ("iceman", 99);
		System.out.println();
		
		MyClass3 o2 = new MyClass3 ("maverick" , 99);
		System.out.println();
		
//		MyClass3 o3 = new MyClass3 (); 파라미터가 있기 때문에 기본생성자 호출 불가
		
	}
}
