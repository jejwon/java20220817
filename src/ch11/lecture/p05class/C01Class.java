package ch11.lecture.p05class;

public class C01Class {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c;
		
		
		String s1 = "java";
		
		
		//instance의 getClass메소드
		Class c1 = s1.getClass();
		System.out.println(c1.getName());
		
		
		//Class forName메소드
		Class c2 = Class.forName("java.lang.String");
		System.out.println(c2.getName());
		
		//class 키워드 사용
		Class c3 = String.class;
		System.out.println(c3.getName());
		
		System.out.println(c1 == c2);
		System.out.println(c2 == c3); //3개가 모두 같은 instance를 가리킴
	}
}
