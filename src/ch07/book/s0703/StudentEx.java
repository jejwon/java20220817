package ch07.book.s0703;

public class StudentEx {
	public static void main(String[] args) {
		Student student = new Student ("홍길동", "12345-12345", 1);
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		
		System.out.println("studentNo: " + student.studentNo);
	}
}
