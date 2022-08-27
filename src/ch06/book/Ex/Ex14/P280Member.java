package ch06.book.Ex.Ex14;

public class P280Member {
	public static void main(String[] args) {
		
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("강자바", "java");
		
//		Member m1 = new Member(); 초기화 안 된 기본생성자 
//		Member m2 = new Member(); 호출 안됨
//		
//		m1.name = "goose";
//		m1.id = "mother";
//		m1.password = "back";
//		m1.age = 33;
//		
//		m2.name = "hollywood";
		
		System.out.println(user1.name);
		System.out.println(user1.id);
		
		System.out.println(user2.name);
		System.out.println(user2.id);
		
	}
	
}
