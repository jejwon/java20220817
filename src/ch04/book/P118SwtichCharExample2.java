package ch04.book;

public class P118SwtichCharExample2 {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case'B':
		case'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
//		switch (3L) {
//		long타입은 switch문에 쓸 수 없음
//		}
	}
}
