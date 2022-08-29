package ch06.book.s0611;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person ("1234 - 1234", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "4321-6789"; final필드 변경 불가
		p1.name = "을지문덕";
	}
}
